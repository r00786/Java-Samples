/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclass;

/**
 *
 * @author Lucifer
 */
public class Device {

    String name;
    boolean status;

    public Device(String name) {
        this.name = name;
        Object object=new Object();

    }

    public void currentState() {
        if (status) {
            System.out.println(" Device is On");
        } else {
            System.out.println("Device is off");
        }
    }

    public Switch getSwitch() {
        Switch s = new Switch() {
            @Override
            public void on() {
                status = true;
            }

            @Override
            public void off() {
                status = false;
            }

        };

        return s;
    }

}
