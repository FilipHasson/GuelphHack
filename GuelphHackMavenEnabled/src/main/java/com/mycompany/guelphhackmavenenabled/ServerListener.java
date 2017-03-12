package com.mycompany.guelphhackmavenenabled;


import com.google.gson.Gson;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karol
 */
public class ServerListener implements Runnable{
    
    private final String HOST_IP = "159.203.32.136";
    private final int PORT = 42069;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private boolean connected;
    
    private class GsonMessage{
        String channel_name;
        String user_id;
        String message;
        String flag;
        String time;
    }
    
     //Parse JSON formatted string and return data in UserActivity object
    public UserActivity strToActivity(String json){
        
        Gson gson = new Gson();
        
        GsonMessage gsonMessage;
        gsonMessage = gson.fromJson(json, GsonMessage.class);
        
        if (gsonMessage.flag.equals("true")){
            Flag flag = new Flag(new User(gsonMessage.user_id,gsonMessage.channel_name));
            return flag;
            
        }
        else{
            Date date = new Date(gsonMessage.time);
            System.out.println("Date: "+date.toString());
            Message message = new Message(gsonMessage.message
                    , new User(gsonMessage.user_id,gsonMessage.channel_name)
                    , date, gsonMessage.channel_name);
            return message;
        }
        
    }
    
    public ServerListener(){
        try{
            System.out.println("Attempting to connect to host.");
            connected = false;
            
            //Get socket and in/out streams
            Socket host = new Socket(HOST_IP,PORT);
            
            System.out.println("Connected to host.");

            in = new ObjectInputStream(host.getInputStream());
           // out = new ObjectOutputStream(host.getOutputStream());
            
            System.out.println("Connected to host and established streams successfully.");
            boolean connected = true;
            
        }catch(Exception e){
            System.err.println("Error connecting to host! Exiting");
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void run() {
        while(true){
            
            try {
                //Listen for activties
                UserActivity activity = (UserActivity)in.readObject();
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    
}
