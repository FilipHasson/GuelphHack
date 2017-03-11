//
//  GroupListTableViewCell.swift
//  GuelphHacks-iOS
//
//  Created by Marc Santos on 2017-03-11.
//  Copyright © 2017 Marc Santos. All rights reserved.
//

import UIKit
import SendBirdSDK
import SnapKit

class GroupListTableViewCell: UITableViewCell {

    private var channel: SBDGroupChannel!
    let channelNameLabel = UILabel()
    
    static func cellReuseIdentifier() -> String {
        return String(describing: self)
    }
    
    override func awakeFromNib() {
        super.awakeFromNib()
        
        channelNameLabel.snp.makeConstraints { (make) -> Void in
            make.centerY.equalToSuperview()
            make.centerX.equalToSuperview()
        }
        
        
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }
    
    func setModel(aChannel: SBDGroupChannel) {
        self.channel = aChannel
        
        var memberNames: [String] = []
        
        if self.channel.memberCount > 1 {
            for member in self.channel.members! as NSArray as! [SBDUser] {
                if member.userId == SBDMain.getCurrentUser()?.userId {
                    continue
                }
                memberNames.append(member.nickname!)
            }
        }
        
        self.channelNameLabel.text = memberNames.joined(separator: ", ")
    
    }
    
}
