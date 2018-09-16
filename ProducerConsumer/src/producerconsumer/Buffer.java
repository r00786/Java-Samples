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
public class Buffer {

    private int value;
    private boolean produced = false;

    public synchronized void produce(int value) {
        if (produced) {
            System.out.println("producer entered the monitor out of turn waiting....");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        this.value = value;
        System.out.println(this.value + " is produced");
        produced = true;
        notify();

    }

    public synchronized void consume() {
        if (!produced) {
            System.out.println("Consumer entered the monitor out of turn waiting....");
            try {
                wait();
            } catch (Exception e) {

            }
        }
        System.out.println(value + " is consumed");
        produced = false;
        notify();

    }
}
