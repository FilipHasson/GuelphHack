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
    private var tableView: UITableView
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        self.tableView.delegate = self
        self.tableView.dataSource = self
        
        
        let query = SBDGroupChannel.createMyGroupChannelListQuery()!
        query.limit = 20
        query.loadNextPage(completionHandler: { (channels, error) in
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
                
                GroupChannelList.
                self.tableView.reloadData()
            }
        })
        // Do any additional setup after loading the view.
    }

    
    func lol() {
        title = "Chats"
        
    }
    
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return channels.count
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
