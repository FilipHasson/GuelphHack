//
//  TestPacket.swift
//  SendBird-iOS
//
//  Created by Marc Santos on 2017-03-12.
//  Copyright © 2017 SendBird. All rights reserved.
//

import Foundation

class Message: NSObject {
    var msg: String!
    var from: String!
    
    init(msg: String, from: String) {
        self.msg = msg
        self.from = from
    }
}


//class TestPacket: NSObject, NSCoding {
//    
//    var message:Message!
//    
//    required convenience init(coder aDecoder: NSCoder) {
//        self.init()
//        let msg = aDecoder.decodeObject(forKey: "message") as! String
//        let from = aDecoder.decodeObject(forKey: "from") as! String
//        message = Message(msg: msg, from: from)
//    }
//    
//    convenience init(message: Message) {
//        self.init()
//        self.message = message
//    }
//    
//    func encode(with aCoder: NSCoder) {
//        if let msg = message.msg {
//            aCoder.encode(msg, forKey: "message")
//        }
//        if let from = message.from {
//            aCoder.encode(from, forKey: "from")
//        }
//    }
//    
//}


class TestPacket: NSObject, NSCoding {
    
    var message:String!
    
    required convenience init(coder aDecoder: NSCoder) {
        self.init()
        let msg = aDecoder.decodeObject(forKey: "message") as! String

        message = msg
    }
    
    convenience init(message: String) {
        self.init()
        self.message = message
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(message)
    }
    
}



