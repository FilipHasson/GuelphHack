/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackmodchatclient;

/**
 *
 * @author Guest User
 */
class GuelphHackUser {
    private String handle;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String name) {
        this.handle = name;
    }
    
    public GuelphHackUser(String name){
        this.handle = name;
    }
}
