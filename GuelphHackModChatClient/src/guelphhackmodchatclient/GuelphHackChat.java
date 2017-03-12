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
        userList = new java.awt.List();
        chatBoxEntryScrollPane = new javax.swing.JScrollPane();
        chatBoxEntry = new javax.swing.JTextArea();
        usersLabel = new javax.swing.JLabel();
        chatBoxScrollPane = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        infoButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        chatroomLabel = new javax.swing.JLabel();
        switchRoomButton = new javax.swing.JButton();
        roomScrollPane = new javax.swing.JScrollPane();
        roomList = new java.awt.List();

        miscCheckBox.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        currChatLabel.setAlignment(java.awt.Label.CENTER);

        userScrollPane.setViewportView(userList);

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

        chatBox.setColumns(20);
        chatBox.setRows(5);
        chatBoxScrollPane.setViewportView(chatBox);

        infoButton.setText("Info");

        reportButton.setText("Report");

        chatroomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chatroomLabel.setText("Chatrooms");
        chatroomLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        switchRoomButton.setText("Switch Room");
        switchRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchRoomButtonActionPerformed(evt);
            }
        });

        roomScrollPane.setViewportView(roomList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chatroomLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(switchRoomButton))
                            .addComponent(roomScrollPane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chatBoxScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addComponent(chatBoxEntryScrollPane))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(userScrollPane)
                            .addComponent(usersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(currChatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currChatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoButton)
                            .addComponent(reportButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chatBoxScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chatBoxEntryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chatroomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(roomScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(switchRoomButton)
                            .addComponent(logoutButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        initRooms();
        setCurrentChat(0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void initRooms(){
        rooms.add(new GuelphHackChatroom("Social Anxiety"));
        rooms.add(new GuelphHackChatroom("Depression"));
        rooms.add(new GuelphHackChatroom("School Stressers"));
        rooms.add(new GuelphHackChatroom("Grief and Loss"));
    }
    
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
    
    private void updateUserList(GuelphHackChatroom c){
        ArrayList<GuelphHackUser> u = c.getUsers();
        userList.removeAll();
        if (!c.emptyRoom()){
            for (int i =0; i < u.size(); i++){
                userList.add(u.get(i).getHandle());
            }
        }
        updateChatList();
    }
    
    private void updateChatList(){
        //ArrayList<GuelphHackUser> u = c.getUsers();
        roomList.removeAll();
        for (int i =0; i < rooms.size(); i++){
            roomList.add(rooms.get(i).getChatroomName());
        }
    }
    
    private void setCurrentChat(int i){
        GuelphHackChatroom c = rooms.get(i);
        setCurrentChat(c);
    }
    
    private void setCurrentChat(String name){
        GuelphHackChatroom c;
        for (int i =0; i< rooms.size(); i++){
            c = rooms.get(i);
            if (c.getChatroomName().equals(name)){
                setCurrentChat(c);
            }
        }
        
    }
    
    private void setCurrentChat(GuelphHackChatroom c){
        currChatLabel.setText(c.getChatroomName());
        clearChatBox(this.chatBox);
        this.chatBox.setEditable(false);
        this.currentChat = c;
        c.addUser(new GuelphHackUser("Mod"));
        c.addUser(new GuelphHackUser("Test"));
        updateUserList(c);
        printChatLog(c);
    }
    
    private void chatBoxEntryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chatBoxEntryKeyTyped
        if (evt.getKeyChar() == '\n'){
            sendMessage("Mod",chatBoxEntry.getText().trim());
            clearChatBox(this.chatBoxEntry);
        }
    }//GEN-LAST:event_chatBoxEntryKeyTyped

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void switchRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchRoomButtonActionPerformed
        setCurrentChat(roomList.getSelectedItem());
    }//GEN-LAST:event_switchRoomButtonActionPerformed
                              
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
    private javax.swing.JLabel chatroomLabel;
    private java.awt.Label currChatLabel;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JCheckBox miscCheckBox;
    private javax.swing.JButton reportButton;
    private java.awt.List roomList;
    private javax.swing.JScrollPane roomScrollPane;
    private javax.swing.JButton switchRoomButton;
    private java.awt.List userList;
    private javax.swing.JScrollPane userScrollPane;
    private javax.swing.JLabel usersLabel;
    // End of variables declaration//GEN-END:variables
    
    private ArrayList<GuelphHackChatroom> rooms = new ArrayList<GuelphHackChatroom>();
    private GuelphHackChatroom currentChat;
    private boolean appStarting = true;
}
