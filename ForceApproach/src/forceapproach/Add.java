/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forceapproach;

/**
 *
 * @author Lucifer
 */
public class Add extends Number {
    private int x,y;
    public Add(int x ,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void display() {
        System.out.println("x is: "+ x+ "y is: "+y);
    }

    @Override
    public Number add(Number x) {
        Add c=(Add)x;
        int r =c.x+this.x;
        int i=c.y+this.y;
        return new Add(r,i);
    }
    
}
