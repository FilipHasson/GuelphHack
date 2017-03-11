/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackmodchatclient;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Guest User
 */
public class GuelphHackModChatClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuelphHackModLogin login = new GuelphHackModLogin();
        login.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        login.setVisible(true);
    }
    
}
