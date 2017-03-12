//
//  Packet.swift
//  SendBird-iOS
//
//  Created by Marc Santos on 2017-03-12.
//  Copyright © 2017 SendBird. All rights reserved.
//

import Foundation

enum ObjectType: Int {
    case Testpacket = 1
}

//class Packet: NSObject, NSCoding {
//    var objectType: Object
//    var object: AnyObject!
//    
//    required convenience init(coder aDecoder: NSCoder) {
//        self.init()
//        objectType = ObjectType(rawValue: aDecoder.decodeObject(forKey: "objectType") as! Int)
//        object = aDecoder.decodeObject(forKey: "object") as! NSObject
//    }
//    
//    convenience init(objectType: ObjectType, object: AnyObject) {
//        self.init()
//        self.objectType = objectType
//        self.object = object
//    }
//    
//    func encode(with aCoder: NSCoder) {
////        if let objectType = objectType { aCoder.encode(objectType.rawValue, forKey: "objectType") }
////        if let object = object { aCoder.encode(object, forKey: "object") }
//    }
//    
//    func getObject<Element>() -> Element {
//        return object as! Element
//    }
//    
//}


