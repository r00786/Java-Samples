/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetest;

/**
 *
 * @author Lucifer
 */
public class InheritanceTest {
static String check;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        P2.B b=new P2.B();
//        b.finalize();

try{
System.out.println(check.toString());}
catch(RuntimeException e){

    System.out.println("Exception caught in specific block");
}


    }
    
}
