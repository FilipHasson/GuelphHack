//
//  SocketServiceBrowser.swift
//  SendBird-iOS
//
//  Created by Marc Santos on 2017-03-12.
//  Copyright © 2017 SendBird. All rights reserved.
//

import Foundation
import CocoaAsyncSocket

class SocketServiceBrowser: NSObject, NetServiceDelegate, NetServiceBrowserDelegate, GCDAsyncSocketDelegate {
    var socket: GCDAsyncSocket!
    var services: NSMutableArray!
    var serviceBrowser: NetServiceBrowser!
    var service: NetService!
    
    func startBrowsing() {
        if (services != nil) {
            services.removeAllObjects()
        } else {
            services = NSMutableArray()
        }
        
        serviceBrowser = NetServiceBrowser()
        serviceBrowser.delegate = self
        serviceBrowser.searchForServices(ofType: "_tutorial._tcp", inDomain: "")
        
    }
    
    func netServiceBrowser(_ browser: NetServiceBrowser, didFind service: NetService, moreComing: Bool) {
        services.add(service)
        connect()
    }
    
    func connect() {
        service = services.firstObject! as! NetService
        service.delegate = self
        service.resolve(withTimeout: 30.0)
    }
    
    func netServiceDidResolveAddress(_ sender: NetService) {
        if connectWithService(service: sender) {
            print("Did connect with service")
        } else {
            print("Error connecting with service")
        }
    }
    
    func netService(sender: NetService, didNotResolve errorDict: [String : NSNumber]) {
        service.delegate = nil
    }
    
    func connectWithService(service: NetService) -> Bool {
        var isConnected = false
        
        let addresses: [Data] = service.addresses!
        if (socket == nil || !socket.isConnected) {
            socket = GCDAsyncSocket(delegate: self, delegateQueue: DispatchQueue.main)
            //Connect
            var count = 0
            while (!isConnected && addresses.count >= count) {
                let address = addresses[count]
                count += 1
                do {
                    try socket.connect(toAddress: address)
                    isConnected = true
                } catch {
                    print("Failed to connect")
                }
            }
        } else {
            isConnected = socket.isConnected
        }
        
        return isConnected
    }
    
    func socket(_ sock: GCDAsyncSocket, didConnectToHost host: String, port: UInt16) {
        print("Socket connected to host")
    }
    
}
