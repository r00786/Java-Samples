/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddirect;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        
        for(int i=0;i<10;i++){
            System.out.println("runnablle"+i);
            try { 
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
