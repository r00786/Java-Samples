/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refbyfamily;

/**
 *
 * @author Lucifer
 */
public class RefByFamily {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a=new A();
        B b=new B();
        C c=new C();
        Printable x=(Printable)b ;
        a.invoke(x);
        x=(Printable)c ;
        a.invoke(x);
    }
    
}
