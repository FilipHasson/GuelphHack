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
    private boolean activeRoom;
    
    public void addMessage(GuelphHackMessage m){
        messages.add(m);
    }
    
    public boolean isEmpty(){
        return messages.isEmpty();
    }
    
    public ArrayList<GuelphHackMessage> getChatLog(){
        return messages;
    }
    
    public String getChatroomName(){
        return chatroomName;
    }
    
    public GuelphHackChatroom(String name){
        this.chatroomName = name;
        this.activeRoom=false;
    }
}
