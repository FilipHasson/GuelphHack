//
//  SocketService.swift
//  SendBird-iOS
//
//  Created by Marc Santos on 2017-03-12.
//  Copyright © 2017 SendBird. All rights reserved.
//

import Foundation
import CocoaAsyncSocket

class SocketService: NSObject, NetServiceDelegate, GCDAsyncSocketDelegate {
    
    var service: NetService?
    var services = [NetService]()
    var socket: GCDAsyncSocket!
    
    func startBroadcast() {
        socket = GCDAsyncSocket(delegate: self, delegateQueue: DispatchQueue.main)
        do {
            try socket.accept(onPort: 0)
            service = NetService(domain: "", type: "_tutorial._tcp", name: "SwiftTutorial", port: Int32(socket.localPort))
        } catch {
            print("error listening on port")
        }
        if let service = service {
            service.delegate = self
            service.publish()
        }
        
    }
    
    func netServiceDidPublish(_ sender: NetService) {
        guard let service = service else {
            return
        }
        print("published succesfully on port \(service.port) / domain: \(service.domain) / \(service.type) / \(service.name)")
    }
    
    
}
