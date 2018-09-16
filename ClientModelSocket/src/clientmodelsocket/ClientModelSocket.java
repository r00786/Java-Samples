/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmodelsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Lucifer
 */
public class ClientModelSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
        System.out.println("Client started connection on port 5000...");
       
        Socket socket=new Socket(InetAddress.getLocalHost(),6666);
       
        System.out.println("Connection completed sending messages");
                BufferedReader keyIn=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader sin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream sOut;
        sOut = new PrintStream(socket.getOutputStream());
        while(true){
            System.out.println("Enter msg to Send and end to terminate");
            String msg=sin.readLine();
            if(msg.equalsIgnoreCase("end")){
                break;}
            
            System.out.println("Server "+msg);
            System.out.println("Enter Reply to send");
            String reply=keyIn.readLine();
            sOut.println(reply);
            
        }
        System.out.println("Closing connection ");
        socket.close();
        
        
    }
    
}
