//
//  SocketService.swift
//  SendBird-iOS
//
//  Created by Marc Santos on 2017-03-12.
//  Copyright © 2017 SendBird. All rights reserved.
//

import Foundation
import CocoaAsyncSocket
import SwiftyJSON

public class SocketService: NSObject, GCDAsyncSocketDelegate {
    
    let address = "159.203.32.136"
    let port = 45202
    var socket: GCDAsyncSocket!
    var admin = false
    
    static let sharedInstance = SocketService()
    
    override init() {
        super.init()
    }
    
    func connectSocket(admin: Bool) {
        
        if admin == true {
            self.admin = true
        }
        else {
            self.admin = false
        }
        
        self.socket = GCDAsyncSocket(delegate: self, delegateQueue: DispatchQueue.main)
        do {
            try self.socket.connect(toHost: address, onPort: UInt16(port))
        } catch let e {
            print(e)
        }
        
    }
    
    public func socket(_ sock: GCDAsyncSocket, didConnectToHost host: String, port: UInt16) {
        print("connected to \(address) on port \(port)")
        if admin {
            self.sendPacket(packetDictionary: ["user_type" : "admin"])
        }
        else {
            self.sendPacket(packetDictionary: ["user_type" : "user"])
        }
    }
    
    func sendPacket(packetDictionary : [String:Any]) {
        
        let json = JSON(packetDictionary)
        var data: Data?
        do {
            try data = json.rawData()
        }
        catch {
            print("Failed to send to socket")
        }

        if let data = data {
            self.socket.write(data, withTimeout: -1, tag: 0)
        }
        
    }
    
}
