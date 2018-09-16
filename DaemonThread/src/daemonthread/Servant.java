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
public class Servant extends Thread {
    private int sleepTime;
    @Override
    public void run(){
        Thread th =Thread.currentThread();
//        if(th.isDaemon()){
//            System.out.println("New thread is started as daemon");
//            
//        }else{
            System.out.println("New is thread is started normally ");
            for(int i =0;i<=10;i++){
                try {
                    System.out.println("run "+i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Servant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("thread completed succesfully");
//        }
    }
    
}
