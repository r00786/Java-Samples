/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datagramsender;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class DataGramSender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        // TODO code application logic here
        DatagramSocket sender=new DatagramSocket(2002);
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Enter msg to send over to terminate");
            String msg=in.nextLine();
            DatagramPacket packet =new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getLocalHost(),2001);
            sender.send(packet);
            if(msg.equalsIgnoreCase("over")){
                break;
            }
            
        }
        sender.close();
    }
    
}
