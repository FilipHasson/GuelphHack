//
//  GroupChatViewController.swift
//  GuelphHacks-iOS
//
//  Created by Marc Santos on 2017-03-11.
//  Copyright © 2017 Marc Santos. All rights reserved.
//

import UIKit
import SendBirdSDK

class GroupChatViewController: UIViewController {

    var groupChannel: SBDGroupChannel!

    private var messageQuery: SBDPreviousMessageListQuery!
    private var delegateIdentifier: String!
    private var hasNext: Bool = true
    private var refreshInViewDidAppear: Bool = true
    private var isLoading: Bool = false
    private var keyboardShown: Bool = false
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */
    
    private func loadPreviousMessage(initial: Bool) {
        if initial == true {
            self.chattingView.resendableFileData.removeAll()
            self.chattingView.resendableMessages.removeAll()
            self.chattingView.preSendFileData.removeAll()
            self.chattingView.preSendMessages.removeAll()
            
            self.chattingView.chattingTableView.isHidden = true
            self.messageQuery = self.groupChannel.createPreviousMessageListQuery()
            self.hasNext = true
            self.chattingView.messages.removeAll()
            DispatchQueue.main.async {
                self.chattingView.chattingTableView.reloadData()
            }
        }
        
        if self.hasNext == false {
            self.chattingView.chattingTableView.isHidden = false;
            return
        }
        
        if self.isLoading == true {
            self.chattingView.chattingTableView.isHidden = false;
            return
        }
        
        self.isLoading = true
        
        self.messageQuery.loadPreviousMessages(withLimit: 40, reverse: !initial) { (messages, error) in
            if error != nil {
                let vc = UIAlertController(title: Bundle.sbLocalizedStringForKey(key: "ErrorTitle"), message: error?.domain, preferredStyle: UIAlertControllerStyle.alert)
                let closeAction = UIAlertAction(title: Bundle.sbLocalizedStringForKey(key: "CloseButton"), style: UIAlertActionStyle.cancel, handler: nil)
                vc.addAction(closeAction)
                DispatchQueue.main.async {
                    self.present(vc, animated: true, completion: nil)
                }
                
                self.chattingView.chattingTableView.isHidden = false
                self.isLoading = false
                
                return
            }
            
            if messages?.count == 0 {
                self.hasNext = false
            }
            
            if initial == true {
                for message in messages! {
                    self.chattingView.messages.append(message)
                }
                
                self.groupChannel.markAsRead()
            }
            else {
                for message in messages! {
                    self.chattingView.messages.insert(message, at: 0)
                }
            }
            
            if initial == true {
                self.chattingView.initialLoading = true
                
                DispatchQueue.main.async {
                    self.chattingView.chattingTableView.reloadData()
                    DispatchQueue.main.async {
                        self.chattingView.scrollToBottom(animated: false, force: true)
                        self.chattingView.chattingTableView.isHidden = false
                    }
                }
                
                self.chattingView.initialLoading = false
                self.isLoading = false
            }
            else {
                if (messages?.count)! > 0 {
                    DispatchQueue.main.async {
                        self.chattingView.chattingTableView.reloadData()
                        DispatchQueue.main.async {
                            self.chattingView.scrollToPosition(position: (messages?.count)! - 1)
                            self.chattingView.chattingTableView.isHidden = false
                        }
                    }
                }
                self.isLoading = false
            }
        }
    }


}
