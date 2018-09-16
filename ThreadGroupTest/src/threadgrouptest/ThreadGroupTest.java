/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgrouptest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class ThreadGroupTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Master started ,starting 3 servant threads");
        ThreadGroup g = new ThreadGroup("Servants");
        Servant s1 = new Servant(g, "s1");
        Servant s2 = new Servant(g, "s2");
        Servant s3 = new Servant(g, "s3");
        s1.start();
        s2.start();
        s3.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadGroupTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (g.activeCount() > 0) {
            System.out.println("Servants are taking more time to complete ..... interupting it ");
            g.interrupt();
        } else {
            System.out.println("Servants excuted successfully");
        }
    }

}
