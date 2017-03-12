/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackmodchatclient;

import java.util.Date;

/**
 *
 * @author Guest User
 */
public class GuelphHackMessage {
    private String user;
    private String message;
    private Date stamp;
    
    public String toString(){
        return this.user+": "+this.message+"\n";
    }
    
    public GuelphHackMessage (String user, String message){
        
    }
}
