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
public class B extends A{
    Test test;
    public int oop=7;
    
    public interface Test{
        void display();
    }
    private  int c;
    
    public B(){
        c=89;
        FinalKeyword finalKeyword=new FinalKeyword();
        test=(Test)finalKeyword;
        test.display();     
       
      
        
        
    }
    public void display(B x){
        x.dis();
       
        System.out.print(((B)x).oop);
    }
}
