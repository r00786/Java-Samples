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
public class InterfaceSecondType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rational a=new Rational(2,2);
        Rational b=new Rational(2,3);
        a.display();
        b.display();
        
       
        
        Adder.adder(a,b);
          Add c=new Add(2,2);
        Add d=new Add(2,3);
        Adder.adder(c,d);
    }
    
}
