/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddirect;

/**
 *
 * @author Lucifer
 */
public class ThreadDirect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("Main is excetuting in " + Thread.currentThread().getName());
        MyRunnable runnable = new MyRunnable();
        runnable.run();
        System.out.println("main thread resumed");
        Thread thread = new Thread(runnable);
        System.out.println("starting new Thread");
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println("main "+i);
             Thread.sleep(1000);
        }
       
        System.out.println("main completed");

    }

}
