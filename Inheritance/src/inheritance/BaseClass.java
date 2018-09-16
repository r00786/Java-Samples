/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lucifer
 */
public class BaseClass {
    public int integer=7;
    private int x ,y;
    public BaseClass(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public void display(){
        System.out.println("value of x is " +x+ "\nvalue of y is "+y);
    }
    
}
