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
    private ArrayList<GuelphHackUser> users = new ArrayList<GuelphHackUser>();
    private boolean activeRoom;
    
    public boolean emptyRoom (){
        if (users.size() == 0){
            return true;
        }
        return false;
    }
    
    private boolean isUserElement(GuelphHackUser u){
        if (!emptyRoom()){
            for (int i =0; i <users.size(); i++){
                if (users.get(i).getHandle().equals(u.getHandle()))
                {
                    return true;
                }
            }
        return false;
        } else {
            return false;
        }
    }
    
    public ArrayList<GuelphHackUser> getUsers(){
        return this.users;
    }
    
    public void addUser(GuelphHackUser u){
        if (!isUserElement(u)){
            this.users.add(u);
        }
    }
    
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
