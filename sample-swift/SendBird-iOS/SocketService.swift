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
    let port = 45201
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
//        let packet = Packet(objectType: .Testpacket, object: messagePacket)
        //sendPacket(packet: messagePacket)
    }
    
//    func sendPacket(packet: TestPacket) {
    func sendPacket(messageDictionary : [String:AnyObject]) {
//        let packetData = NSKeyedArchiver.archivedData(withRootObject: packet)
//        var packetDataLength = packetData.count
//        let buffer = NSMutableData(bytes: &packetDataLength, length: MemoryLayout<Int16>.size)
//        buffer.append(packetData)
        //let swag = message.data(using: .utf8, allowLossyConversion: false)

//        socket.write(swag!, withTimeout: -1, tag: 0)
    }

    //msg
    //userid / nickname
    //time
    //channel
    
}
