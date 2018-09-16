/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class Consumer extends Thread{
    Buffer b;
    public Consumer(Buffer b){
        this.b=b;
    }
    public void run(){
        System.out.println("Consumer has started consuming values");
        for(int i=0;i<10;i++){
            b.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
