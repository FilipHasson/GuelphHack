/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guelphhackserverside;

/**
 *
 * @author karol
 */
public class GuelphHackServerSide {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HTTPHandler handler = new HTTPHandler();
        try{
            handler.getAllChannelURL();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
