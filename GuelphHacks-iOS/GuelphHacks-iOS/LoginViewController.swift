//
//  LoginViewController.swift
//  GuelphHacks-iOS
//
//  Created by Marc Santos on 2017-03-11.
//  Copyright © 2017 Marc Santos. All rights reserved.
//

import UIKit
import TextFieldEffects

class LoginViewController: UIViewController {

    var usernameTextField: UITextField
    var nicknameTextField: UITextField
    var loginButton: UIButton
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
    }

    func loginTapped(sender: UIButton!) {

    }
    
    private func createUI() {
        
        loginButton.setTitle("Login", for: .normal)
        w
        loginButton.addTarget(self, action: #selector(LoginViewController.loginTapped(sender:)), for: .touchUpInside)
        
        

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
