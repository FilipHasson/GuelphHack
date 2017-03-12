/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackserverside;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.in;
import java.net.Socket;
import java.net.URI;
import java.net.*;
import com.google.gson.*;

/**
 *
 * @author karol
 */
public class ServerListener implements Runnable{

    private final String HOST_IP = "159.203.32.136";
    private final int PORT = 42069;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private boolean connected = false;
    
    public ServerListener(){
        try{
            System.out.println("Attempting to connect to host.");
            
            //Get socket and in/out streams
            Socket host = new Socket(HOST_IP,PORT);
            
            System.out.println("Connected to host.");

            in = new ObjectInputStream(host.getInputStream());
            out = new ObjectOutputStream(host.getOutputStream());
            
            System.out.println("Connected to host and established streams successfully.");
            connected = true;
            
        }catch(Exception e){
            System.err.println("Error connecting to host! Exiting");
            e.printStackTrace();
        }
    }
    
    @Override
    public void run() {
        
        //Read data when available and handle it
        while(true && connected){
            
            try{
                Gson data = (Gson) in.readObject();
                
            }catch(Exception e){
            }
            
        }
        
    }
    
}
