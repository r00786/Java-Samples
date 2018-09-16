/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedtest;

/**
 *
 * @author Lucifer
 */
public class Print {

    public synchronized void printLine(String msg) throws InterruptedException {
        System.out.println("--------");
        Thread.sleep(1000);
        System.out.println(msg);
        Thread.sleep(1000);
        System.out.println("--------");
        Thread.sleep(1000);
    }

}
