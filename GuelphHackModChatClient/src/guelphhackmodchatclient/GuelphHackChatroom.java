/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackmodchatclient;

import java.util.ArrayList;

/**
 *
 * @author Guest User
 */
public class GuelphHackChatroom {
    private String chatroomName;
    private ArrayList<GuelphHackMessage> messages = new ArrayList<GuelphHackMessage>(); 
    
    public String getChatroomName(){
        return chatroomName;
    }
    
    public GuelphHackChatroom(String name){
        this.chatroomName = name;
    }
}
