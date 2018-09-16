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
public class AnonymousClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Device[] d = new Device[3];
        d[0] = new Device("TV");
        d[1] = new Device("Laptop");
        d[2] = new Device("Mobile");
        
        System.out.println("getting initial state of all devices");
        
        Switch[] s=new Switch[3];
        for(int i=0;i<3;i++){
            s[i]=d[i].getSwitch();
        }
        System.out.println("Initial state of devices");
        display(d);
        
        System.out.println("Turning on all the devices");
        
        for(int i=0;i<3;i++){
            s[i].on();
        }
        display(d);
        System.out.println("turning on the Tv");
        s[0].off();
        display(d);
        
        
        
        
        

    }
    
    public static void display(Device[] d){
       for(int i=0;i<3;i++){
            d[i].currentState();
        }}

}
