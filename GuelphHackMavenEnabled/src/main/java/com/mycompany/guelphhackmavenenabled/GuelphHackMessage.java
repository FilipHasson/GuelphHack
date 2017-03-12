/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guelphhackmavenenabled;

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
    
    public String toStringVerbose(){
        return this.stamp.toString()+"| "+this.user+": "+this.message+"\n";
    }
    
    public GuelphHackMessage (String user, String message){
        this.user = user;
        this.message = message;
        this.stamp = new Date();
    }
}
