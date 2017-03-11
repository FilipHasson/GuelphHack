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

    private var channels: [SBDGroupChannel]!
    private var tableView: UITableView!
    
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
        
    }

    
    func setupUI() {
        title = "Chats"
        
    }

    
    private func loadChannels() {
        let query = SBDGroupChannel.createMyGroupChannelListQuery()!
        query.limit = 20
        query.loadNextPage(completionHandler: { (channels, error) in
            for channel in channels! {
                self.channels.append(channel)
            }
            
            DispatchQueue.main.async {
                self.tableView.reloadData()
            }
        })
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return channels.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        var cell: UITableViewCell?
        
        cell = tableView.dequeueReusableCell(withIdentifier: GroupListTableViewCell.cellReuseIdentifier()) as! GroupListTableViewCell
        
        (cell as! GroupListTableViewCell).setModel(aChannel: self.channels[indexPath.row])
        
        if self.channels.count > 0 && indexPath.row + 1 == self.channels.count {
            self.loadChannels()
        }
        
        return cell!
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
