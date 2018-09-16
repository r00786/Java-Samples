/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daemonthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class DaemonThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Main thread started launching new thread");
        Servant servant = new Servant();
        servant.setDaemon(true);
        servant.start();
        for (int i = 5; i >= 0; i--) {
            System.out.println("main " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DaemonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("main thread is completed");
                
        
    }

}
