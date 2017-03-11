//
//  LoginViewController.swift
//  GuelphHacks-iOS
//
//  Created by Marc Santos on 2017-03-11.
//  Copyright © 2017 Marc Santos. All rights reserved.
//

import UIKit
import SnapKit
import TextFieldEffects
import SendBirdSDK

class LoginViewController: UIViewController {

    let titleLabel = UILabel()
    let usernameTextField = AkiraTextField()
    let nicknameTextField = AkiraTextField()
    let loginButton = UIButton()
    
    override func viewDidLoad() {
        super.viewDidLoad()
    
        setupTitle()
        setupTextFields()
        setupLoginButton()
        
    }

    
    private func setupTitle() {
        titleLabel.text = "Guelph Messenger"
        titleLabel.font = UIFont.boldSystemFont(ofSize: 20)
        
        view.addSubview(titleLabel)
        
        titleLabel.snp.makeConstraints { (make) -> Void in
            make.centerX.equalTo(view)
            make.centerY.equalTo(view).offset(-100)
        }
    
    }
    
    private func setupLoginButton() {

        loginButton.layer.cornerRadius = 10
        loginButton.clipsToBounds = true
        loginButton.titleLabel?.text = "hello"
        loginButton.setTitleColor(Colors.Turquoise, for: .normal)
        loginButton.layer.borderColor = Colors.Turquoise.cgColor
        loginButton.layer.borderWidth = 1
        loginButton.setTitle("Login", for: .normal)
        loginButton.addTarget(self, action: #selector(LoginViewController.loginTapped(sender:)), for: .touchUpInside)
        
        view.addSubview(loginButton)
        
        loginButton.snp.makeConstraints { (make) -> Void in
            make.centerX.equalTo(view)
            make.width.equalTo(100)
            make.height.equalTo(30)
            make.top.equalTo(nicknameTextField.snp.bottom).offset(30)
        }
        
    }
    
    private func setupTextFields() {
        
        usernameTextField.placeholder = "Username"
        nicknameTextField.placeholder = "Nickname"
        usernameTextField.borderStyle = .none
        nicknameTextField.borderStyle = .none
        
        usernameTextField.borderColor = Colors.Turquoise
        usernameTextField.placeholderColor = Colors.Turquoise
        nicknameTextField.borderColor = Colors.Turquoise
        nicknameTextField.placeholderColor = Colors.Turquoise
        
        view.addSubview(usernameTextField)
        view.addSubview(nicknameTextField)
        
        usernameTextField.snp.makeConstraints { (make) -> Void in
            make.centerX.equalTo(view)
            make.top.equalTo(titleLabel.snp.bottom).offset(50)
            make.width.equalTo(200)
            make.height.equalTo(50)
        }
        
        nicknameTextField.snp.makeConstraints { (make) -> Void in
            make.centerX.equalTo(view)
            make.top.equalTo(usernameTextField.snp.bottom).offset(10)
            make.width.equalTo(200)
            make.height.equalTo(50)
        }
        
    }
    
    func loginTapped(sender: UIButton!) {
        
        guard let userId = usernameTextField.text, let nickname = nicknameTextField.text else {
            return
        }
        
        SBDMain.connect(withUserId: userId, completionHandler: { (user, error) in
            // ...
            
            SBDMain.updateCurrentUserInfo(withNickname: nickname, profileUrl: nil, completionHandler: { (error) in
                UserDefaults.standard.set(SBDMain.getCurrentUser()?.userId, forKey: "sendbird_user_id")
                UserDefaults.standard.set(SBDMain.getCurrentUser()?.nickname, forKey: "sendbird_user_nickname")
            })
            
        })
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
