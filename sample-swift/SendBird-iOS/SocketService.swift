//
//  SocketService.swift
//  SendBird-iOS
//
//  Created by Marc Santos on 2017-03-12.
//  Copyright © 2017 SendBird. All rights reserved.
//

import Foundation
import CocoaAsyncSocket

public class SocketService: NSObject, GCDAsyncSocketDelegate {
    
    let address = "159.203.32.136"
    let port = 49153
    var socket: GCDAsyncSocket!
    
    override init() {
        super.init()
        
        socket = GCDAsyncSocket(delegate: self, delegateQueue: DispatchQueue.main)
        do {
            try socket.connect(toHost: address, onPort: UInt16(port))
        } catch let e {
            print(e)
        }
        
    }
    
    public func socket(_ sock: GCDAsyncSocket, didConnectToHost host: String, port: UInt16) {
        print("connected to \(address) on port \(port)")
    }

    //msg
    //userid / nickname
    //time
    //channel
    
}
