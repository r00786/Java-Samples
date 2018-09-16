/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousblock;

/**
 *
 * @author Lucifer
 */
public class A {
    private int a;
    
    public A(int x){
        System.out.println("initialization of object started");
        a=x;
    }
    {
                System.out.println("Common initialization started");

    }
    public void display(){
                System.out.println("a ="+a);

    }
        {
      System.out.println("Common init ended");
    }
}
