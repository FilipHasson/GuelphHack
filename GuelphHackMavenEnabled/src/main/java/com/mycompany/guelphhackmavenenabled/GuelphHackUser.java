/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guelphhackmavenenabled;

/**
 *
 * @author Guest User
 */
class GuelphHackUser {
    private String handle;
    private String email;
    private boolean reported;
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getHandle() {
        return handle;
    }

    public boolean isReported(){
        return reported;
    }
    
    public void reportUser(){
        this.reported = true;
    }
    
    public void setHandle(String name) {
        this.handle = name;
    }
    
    public GuelphHackUser(String name, String email){
        this.handle = name;
        this.email = email;
        this.reported = false;
    }
}
