/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumer;

/**
 *
 * @author Lucifer
 */
public class ProducerConsumer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buffer buffer=new Buffer();
        Producer pr=new Producer(buffer);
        Consumer cr=new Consumer(buffer);
        pr.start();
        cr.start();
    }
    
}
