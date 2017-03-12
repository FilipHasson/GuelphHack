/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackmodchatclient;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Guest User
 */
public class GuelphHackChat extends javax.swing.JFrame {

    /**
     * Creates new form GuelphHackUI
     */
    public GuelphHackChat() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miscCheckBox = new javax.swing.JCheckBox();
        logoutButton = new javax.swing.JButton();
        currChatLabel = new java.awt.Label();
        userScrollPane = new javax.swing.JScrollPane();
        chatBoxEntryScrollPane = new javax.swing.JScrollPane();
        chatBoxEntry = new javax.swing.JTextArea();
        usersLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roomListLabel = new javax.swing.JLabel();
        socialAnxientyButton = new javax.swing.JButton();
        depressionButton = new javax.swing.JButton();
        schoolStresserButton = new javax.swing.JButton();
        griefLossButton = new javax.swing.JButton();
        chatBoxScrollPane = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();

        miscCheckBox.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        currChatLabel.setAlignment(java.awt.Label.CENTER);

        chatBoxEntry.setColumns(20);
        chatBoxEntry.setRows(5);
        chatBoxEntry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chatBoxEntryKeyTyped(evt);
            }
        });
        chatBoxEntryScrollPane.setViewportView(chatBoxEntry);

        usersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersLabel.setText("Users");

        roomListLabel.setText("    Chatrooms:");

        socialAnxientyButton.setText("1. Social Anxiety");
        socialAnxientyButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        socialAnxientyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialAnxientyButtonActionPerformed(evt);
            }
        });
        setCurrentChat(this.socAnxRoom);

        depressionButton.setText("2. Depression");
        depressionButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        depressionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depressionButtonActionPerformed(evt);
            }
        });

        schoolStresserButton.setText("3. School Stressers");
        schoolStresserButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        schoolStresserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolStresserButtonActionPerformed(evt);
            }
        });

        griefLossButton.setText("4. Grief & Loss");
        griefLossButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        griefLossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                griefLossButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roomListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(socialAnxientyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(depressionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(schoolStresserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(griefLossButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roomListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(socialAnxientyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depressionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(schoolStresserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(griefLossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        chatBox.setColumns(20);
        chatBox.setRows(5);
        chatBoxScrollPane.setViewportView(chatBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currChatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chatBoxEntryScrollPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(chatBoxScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(usersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currChatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chatBoxScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chatBoxEntryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        setCurrentChat(this.socAnxRoom);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendMessage(String user, String message){
        GuelphHackMessage m = new GuelphHackMessage(user, message);
        this.currentChat.addMessage(m);
        printMessage(m);
    }   
    
    private void clearChatBox(JTextArea j){
        j.setText("");
    }
    
    private void printChatLog(GuelphHackChatroom c){
        ArrayList<GuelphHackMessage>chatlog = c.getChatLog();
        clearChatBox(this.chatBox);
        if (!chatlog.isEmpty()){
           for (int i =0; i <chatlog.size(); i++){
               printMessage(chatlog.get(i));
           }
        }
    }
    
    private void printMessage(GuelphHackMessage m){
        this.chatBox.append(m.toString());
    }
    
    private void setCurrentChat(GuelphHackChatroom c){
        currChatLabel.setText(c.getChatroomName());
        clearChatBox(this.chatBox);
        this.chatBox.setEditable(false);
        this.currentChat = c;
        printChatLog(c);
    }
    
    private void socialAnxientyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialAnxientyButtonActionPerformed
        currChatLabel.setText(this.socAnxRoom.getChatroomName());
        setCurrentChat(this.socAnxRoom);
    }//GEN-LAST:event_socialAnxientyButtonActionPerformed

    private void depressionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depressionButtonActionPerformed
        currChatLabel.setText(this.depresRoom.getChatroomName());
        setCurrentChat(this.depresRoom);
    }//GEN-LAST:event_depressionButtonActionPerformed

    private void schoolStresserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolStresserButtonActionPerformed
        currChatLabel.setText(this.schoolRoom.getChatroomName());
        setCurrentChat(this.schoolRoom);
    }//GEN-LAST:event_schoolStresserButtonActionPerformed

    private void griefLossButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_griefLossButtonActionPerformed
        currChatLabel.setText(this.grief2Room.getChatroomName());
        setCurrentChat(this.grief2Room);
    }//GEN-LAST:event_griefLossButtonActionPerformed

    private void chatBoxEntryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chatBoxEntryKeyTyped
        if (evt.getKeyChar() == '\n'){
            sendMessage("Mod",chatBoxEntry.getText().trim());
            clearChatBox(this.chatBoxEntry);
        }
    }//GEN-LAST:event_chatBoxEntryKeyTyped

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_logoutButtonActionPerformed
                              
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuelphHackChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuelphHackChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuelphHackChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuelphHackChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuelphHackChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatBox;
    private javax.swing.JTextArea chatBoxEntry;
    private javax.swing.JScrollPane chatBoxEntryScrollPane;
    private javax.swing.JScrollPane chatBoxScrollPane;
    private java.awt.Label currChatLabel;
    private javax.swing.JButton depressionButton;
    private javax.swing.JButton griefLossButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JCheckBox miscCheckBox;
    private javax.swing.JLabel roomListLabel;
    private javax.swing.JButton schoolStresserButton;
    private javax.swing.JButton socialAnxientyButton;
    private javax.swing.JScrollPane userScrollPane;
    private javax.swing.JLabel usersLabel;
    // End of variables declaration//GEN-END:variables
    private GuelphHackChatroom socAnxRoom = new GuelphHackChatroom("Social Anxiety");
    private GuelphHackChatroom depresRoom = new GuelphHackChatroom("Depression");
    private GuelphHackChatroom schoolRoom = new GuelphHackChatroom("School Stressers");
    private GuelphHackChatroom grief2Room = new GuelphHackChatroom("Grief & Loss");
    private GuelphHackChatroom currentChat;
}
