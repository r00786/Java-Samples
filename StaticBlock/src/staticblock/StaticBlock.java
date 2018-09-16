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
public class StaticBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        TicketCounter t1=new TicketCounter();
//        t1.show();
//         TicketCounter t2=new TicketCounter();
//        t2.show();

//A.display();
//B x=new B();

double f=12.54;
System.out.println("Value of f is "+f);

    }
    
}
 class A{
     static{
         System.out.println("A is initialized");
     }
     public static void display(){
          System.out.println("display of A is invoked ");
     }
    
}
class B{
    static{
            System.out.println("B is initialized");
    }
    public B(){
        System.out.println("object of B is initialized");
    }
}
class C{
    static int value;
    static{
        
        value=200;
        System.out.println("C is initialized");
    }
}
class D{
    static{
        System.out.println("D is initialized");
    }
}
