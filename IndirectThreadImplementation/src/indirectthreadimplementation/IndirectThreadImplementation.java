/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Program to excecute a new Thread using Indirect Implementation

 */
package indirectthreadimplementation;

/**
 *
 * @author Lucifer
 */
public class IndirectThreadImplementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Main has started executing ");
        Manger manager = new Manger();
        manager.setName("Rohit Thread");
        manager.start();
        for (int i = 10; i >= 0; i--) {
            System.out.println("main " + i);
            Thread.sleep(1000);
        }
        System.out.println("completed succesfully");
        
    }

}
