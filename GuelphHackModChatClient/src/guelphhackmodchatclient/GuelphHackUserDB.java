/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackmodchatclient;

/**
 *
 * @author Filip Hasson
 */
public class GuelphHackUserDB {
    
    private boolean passwordHash(String username, String password){
        return true;
    }
    
    public boolean loginQuery(String username, String password){
        //return passwordHash(username, password);
        if (username.equals("invalid"))return false;
        return true;
    }
    
    public void resetPasswordQuery (String username){
        
    }
}
