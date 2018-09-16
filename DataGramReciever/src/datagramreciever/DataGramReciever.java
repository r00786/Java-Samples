/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datagramreciever;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Lucifer
 */
public class DataGramReciever {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, IOException {
        // TODO code application logic here
        DatagramSocket receiver=new DatagramSocket(2001);
        System.out.println("receiver started receiving");
        while(true){
            DatagramPacket packet=new DatagramPacket(new byte[100],100);
            receiver.receive(packet);
            String msg =new String (packet.getData());
            msg=msg.trim();
            if(msg.equalsIgnoreCase("over")){
                break;
            }
            System.out.println("Receiver : "+msg);
            
            
        }
        receiver.close();
    }
    
}
