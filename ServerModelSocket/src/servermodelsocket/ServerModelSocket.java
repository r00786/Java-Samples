/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermodelsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lucifer
 */
public class ServerModelSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        ServerSocket serverSocket=new ServerSocket(6666);
        System.out.println("Server is ready listening connection request on port 5000... ");
        Socket socket=serverSocket.accept();
        BufferedReader keyIn=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader sin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream sOut;
        sOut = new PrintStream(socket.getOutputStream());
        while(true){
            System.out.println("Enter msg to Send and end to terminate");
            String msg=sin.readLine();
            if(msg.equalsIgnoreCase("end")){
                break;}
            
            System.out.println("Client "+msg);
            System.out.println("Enter Reply to send");
            String reply=keyIn.readLine();
            sOut.println(reply);
            
        }
        System.out.println("Closing connection ");
        Thread.sleep(2000);
        socket.close();
        System.out.println("Connection closed");
        serverSocket.close();
        
      
        
    }
    
}
