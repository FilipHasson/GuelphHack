/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guelphhackmavenenabled;

import java.util.ArrayList;

/**
 *
 * @author Guest User
 */
public class GuelphHackWebAPI {
    public ArrayList<GuelphHackChatroom> getChatrooms(){
        ArrayList<GuelphHackChatroom> c = new ArrayList<GuelphHackChatroom>();
        c.add(new GuelphHackChatroom("Social Anxiety"));
        c.add(new GuelphHackChatroom("Depression"));
        c.add(new GuelphHackChatroom("School Stressers"));
        c.add(new GuelphHackChatroom("Grief and Loss"));
        return c;
    }
    public void updateRoomUsers(GuelphHackChatroom c){
        c.addUser(new GuelphHackUser("Mod","moderator@mail.uoguelph.ca"));
        c.addUser(new GuelphHackUser("Test","test@mail.uoguelph.ca"));
    }
}
