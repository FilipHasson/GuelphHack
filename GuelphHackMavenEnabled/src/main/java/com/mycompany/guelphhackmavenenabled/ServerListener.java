package com.mycompany.guelphhackmavenenabled;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
    private final int PORT = 45202;
    private BufferedReader in;
    private PrintWriter out;
    private boolean connected;
    private GuelphHackChat ghc;
    
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
        
        String s = "{";
        s += json + "}";
        
        json=s;
        GsonMessage gsonMessage;
        gsonMessage = gson.fromJson(json, GsonMessage.class);
/*        
        if (gsonMessage.flag.equals("true")){
            Flag flag = new Flag(new User(gsonMessage.user_id,gsonMessage.channel_name));
            return flag;
            
        }
        else{*/
        Date date = new Date();//Date(gsonMessage.time);
        System.out.println("Date: "+date.toString());
        Message message = new Message(gsonMessage.message
                , new User(gsonMessage.user_id,gsonMessage.channel_name)
                , date, gsonMessage.channel_name);
        return message;
        //}
        
    }
    
    public ServerListener(GuelphHackChat ghc){
        this.ghc = ghc;
        try{
            System.out.println("Attempting to connect to host.");
            connected = false;
            
            //Get socket and in/out streams
            Socket host = new Socket(HOST_IP,PORT);
            
            System.out.println("Connected to host.");

            out = new PrintWriter(host.getOutputStream());
            System.out.println("Ehh lmao");
            this.in = new BufferedReader(new InputStreamReader(host.getInputStream()));
            //host.getInputStream()
            out.printf("Hey I just met you\n");
            out.flush();
            
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
                System.out.println("Waiting for shit");
                //Message test = new Message("Go fuck yoself",new User("asshat","Social Anxiety"),new Date(),"Social Anxiety");
                //GuelphHackMessage ghmtest = test.getGHMessage();
                //ghc.sendMessage(ghmtest);
                //if (in!=null){4
                //String string = in.readLine();
                 String string;
                while((string = in.readLine()) == null ){
                    System.out.println("Loopin lik a mothafucka");
                    if (string != null) break;
                }
                System.out.println("parsing some shity: "+string);
                //Message test = new Message("Go fuck yoself",new User("asshat","Social Anxiety"),new Date(),"Social Anxiety");
                UserActivity activity = strToActivity(string);
                //UserActivity activity = (UserActivity)in.readObject();
                System.out.println("Something Happened");
                if (activity instanceof Message){
                    System.out.println("Recieved a Message?");
                    Message m = (Message)activity;
                    GuelphHackMessage ghm = m.getGHMessage();
                    ghc.sendMessage(ghm);
                }
                System.out.println("Something Else Happened");
                //
                //}
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }   
    }
}
