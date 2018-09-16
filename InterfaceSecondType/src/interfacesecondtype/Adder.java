/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesecondtype;

/**
 *
 * @author Lucifer
 */
public class Adder {
    public static void adder(Addable x,Addable y){
        Addable z=x.dosum(y);
        z.display();
    }
    
}
