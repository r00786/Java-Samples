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
public class Buffer {
    private int value;
    public  synchronized void produce(int v){
        value=v;
        System.out.println(value + " is produced");
    }
    public synchronized void consume(){
        System.out.println(value+ " is consumed");
    }
}
