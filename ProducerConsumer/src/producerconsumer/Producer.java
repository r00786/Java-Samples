/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class Producer extends Thread {
    Buffer b;
    public Producer(Buffer b){
        this.b=b;
        
    }
    public void run(){
        System.out.println("producer started produing values ");
        for(int i=0;i<10;i++){
            b.produce(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
