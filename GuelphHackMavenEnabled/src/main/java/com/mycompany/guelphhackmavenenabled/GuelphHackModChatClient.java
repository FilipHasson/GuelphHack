/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guelphhackmavenenabled;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip Hasson
 */
public class GuelphHackModChatClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("FUCKING FUCKING FUCK SHIT BITCH");
        final GuelphHackModLogin login = new GuelphHackModLogin();
        final GuelphHackChat chatUI = new GuelphHackChat();
        login.addWindowListener(new WindowAdapter(){
            public void windowDeiconified(WindowEvent e) {
                if (login.isClosing()) {
                    System.exit(0);
                } else {
                    chatUI.setVisible(true);
                    login.setVisible(false);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GuelphHackModChatClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    (new Thread(new ServerListener(chatUI))).start();

                }//WINDOW_DEICONIFIED
            }
        });
        chatUI.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        login.setVisible(true);
    }
    
}
