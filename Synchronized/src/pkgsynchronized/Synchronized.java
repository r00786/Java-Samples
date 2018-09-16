/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsynchronized;

/**
 *
 * @author Lucifer
 */
public class Synchronized {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buffer b=new Buffer();
        Producer p=new Producer(b);
        Consumer c=new Consumer(b);
        p.start();
        c.start();
    }
    
}
