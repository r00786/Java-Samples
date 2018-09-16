/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetwo;

/**
 *
 * @author Lucifer
 */
public class A {
    public void display(){
        System.out.println("In A");
    }
    public void display(String s){
        System.out.println(s);
    }
    public static void invoke(A x){
        x.display();
    }
    
}
