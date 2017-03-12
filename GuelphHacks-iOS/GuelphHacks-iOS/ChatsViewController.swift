//
//  ChatsViewController.swift
//  GuelphHacks-iOS
//
//  Created by Marc Santos on 2017-03-11.
//  Copyright © 2017 Marc Santos. All rights reserved.
//

import UIKit
import SendBirdSDK

class ChatsViewController: UIViewController, UITableViewDelegate, UITableViewDataSource {

    private var channels: [SBDGroupChannel] = []
    private var tableView: UITableView!
    private var groupChannelListQuery: SBDGroupChannelListQuery?

    override func viewDidLoad() {
        super.viewDidLoad()
        
        
        tableView = UITableView(frame: CGRect(x: 0, y: 0, width: 0, height: 0), style: UITableViewStyle.grouped)
        view.addSubview(tableView)
        tableView.delegate = self
        tableView.dataSource = self
    
        tableView.snp.makeConstraints { (make) -> Void in
            make.center.equalToSuperview()
            make.size.equalToSuperview()
        }
        
        self.tableView.register(GroupListTableViewCell.self, forCellReuseIdentifier: "GroupListTableViewCell")

        self.tableView.register(GroupListTableViewCell.nib(), forCellReuseIdentifier: GroupListTableViewCell.cellReuseIdentifier())
        setupUI()
        
        self.refreshChannelList()
        
    }

    
    func testing(sender: UIButton) {
        print("hello")
        tableView.reloadData()
    }
    
    func setupUI() {
        title = "Chats"
        
        let refreshButton = UIBarButtonItem(title: "Refresh", style: .plain, target: self, action: #selector(ChatsViewController.testing(sender:)))
 

        self.navigationItem.leftBarButtonItem = refreshButton

        
    }

    private func refreshChannelList() {
        self.channels.removeAll()
        
        DispatchQueue.main.async {
            self.tableView.reloadData()
        }
        
        self.groupChannelListQuery = SBDGroupChannel.createMyGroupChannelListQuery()
        self.groupChannelListQuery?.limit = 20
        
        self.groupChannelListQuery?.loadNextPage(completionHandler: { (channels, error) in
            
            for channel in channels! {
                self.channels.append(channel)
            }
            
            DispatchQueue.main.async {
                if self.channels.count == 0 {
                    self.tableView.separatorStyle = UITableViewCellSeparatorStyle.none
                }
                else {
                    self.tableView.separatorStyle = UITableViewCellSeparatorStyle.singleLine
                }
                self.tableView.reloadData()
            }
        })
    }
    
    private func loadChannels() {
        
        if self.groupChannelListQuery != nil {
            if self.groupChannelListQuery?.hasNext == false {
                return
            }
            self.groupChannelListQuery?.loadNextPage(completionHandler: { (channels, error) in
                for channel in channels! {
                    self.channels.append(channel)
                }
                
                DispatchQueue.main.async {
                    self.tableView.reloadData()
                }
            })
        }
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return channels.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        
        let cell = tableView.dequeueReusableCell(withIdentifier: "GroupListTableViewCell", for: indexPath) as! GroupListTableViewCell
        
        
        cell.setModel(aChannel: self.channels[indexPath.row])
        
        if self.channels.count > 0 && indexPath.row + 1 == self.channels.count {
            self.loadChannels()
        }
        
        return cell
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
