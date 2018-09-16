/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interupttest;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class Servant extends Thread{
    int sleepTime;
    public Servant(){
        Random random=new Random();
        sleepTime=random.nextInt(10);
        
    }
    public void run(){
        System.out.println("Servant has started sleeping for "+sleepTime+" seconds");
        try {
            Thread.sleep(sleepTime*1000);
            System.out.println("Servant is  feeling fresh after sound sleep");
        } catch (InterruptedException ex) {
           System.out.println("Servant is disturbed while sleeping...");
        }
        
        
    }
    
}
