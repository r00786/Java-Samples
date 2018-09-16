/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innertest;

/**
 *
 * @author Lucifer
 */
public class InnerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creating an object of static inner class C");
        AB.C ab =new AB.C(26);
        ab.display();
        
       System.out.println("Creating an object of outer class AB");
       AB obj2=new AB(78);
       obj2.display();
       
       System.out.println("Creating another object of outer class ");
       
       AB obj3=new AB(90);
       obj3.display();
       
       AB.D obj4=obj3.new D(30);
       obj4.display();
      
    }
    
}
