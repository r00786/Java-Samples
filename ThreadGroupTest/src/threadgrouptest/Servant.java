/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgrouptest;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class Servant extends Thread {

    private int sleepTime;

    public Servant(ThreadGroup g, String s) {
        super(g, s);
        Random r = new Random();
        sleepTime = r.nextInt(10);

    }

    public void run() {
        String tName=this.getName();
        System.out.println(tName+ " has started sleeping for "+sleepTime+" seconds");
        try {
            Thread.sleep(sleepTime*1000);
            System.out.println(tName+" has slept well refreshed");
        } catch (InterruptedException ex) {
      System.out.println(tName +" is disturbed while sleeping ");
        }
        

    }

}
