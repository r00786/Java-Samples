/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
For this we have to extend the Thread class 
and override the run method there and put
the code for excecutuion there
*/
package indirectthreadimplementation;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class Manger extends Thread {
    @Override
    public void run(){
        System.out.println("run() is excecuting in "+Thread.currentThread().getName()+" Thread");
        for(int i=0;i<=10;i++){
            System.out.println("run "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Manger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
