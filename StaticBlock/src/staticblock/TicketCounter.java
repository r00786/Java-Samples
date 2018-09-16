/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock;

/**
 *
 * @author Lucifer
 */
public class TicketCounter {
    private static int counter;
    
    static{
        counter=0;
        System.out.println("In static block");
    
}
    public TicketCounter(){
        System.out.println("In Constructor");
        counter++;
    }
    public void show(){
        System.out.println("it is ticket number "+counter );
    }
    
}
