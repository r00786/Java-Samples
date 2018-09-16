/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalkeyword;

/**
 *
 * @author Lucifer
 */
public class FinalKeyword implements B.Test {

    /**
     * @param args the command line arguments
     */
    final int a;
    public FinalKeyword(){
        a=10;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      
 
    
 
     
     B b =new B();
    
  ((B)b).display(b);
  b.dis();
        
     
    
     
    }

    @Override
    public void display() {
        System.out.println("working perfect");
    }
    
}
