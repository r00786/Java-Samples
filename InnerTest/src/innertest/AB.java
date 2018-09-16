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
public class AB {
    private static int a;
    private int b;
    static{
        a=5;
    }
    public AB(int x){
        b=x;
    }
    public void display(){
        System.out.println("a of AB is : "+a);
        System.out.println("b of this obj is : "+b);
        
    }
    //Static inner class 
    public static class C{
        private int c;
        public C(int x){
            c=x;
        }
        public void display(){
            System.out.println("a of AB is : "+a);
            
            System.out.println("c of this obj is : "+c);
        }
        
    }
    //non static inner class
    
        class D{
        private int d;
        public D(int x){
            d=x;
        }
        public void display(){
            System.out.println("a of AB is : "+a);
            
            System.out.println("d of this obj is : "+d);
            System.out.println("b can also be referenced : "+b);
        }
        
    }
        
        
    
}
