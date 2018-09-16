/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesecondtype;

/**
 *
 * @author Lucifer
 */
public class Rational implements Addable {
    private int a;
    private int b;
    public Rational(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void display() {
        System.out.println( a+"/"+b);
    }

    @Override
    public Addable dosum(Addable x) {
        Rational c=(Rational)x;
        int a=this.a*c.b+this.b*c.a;
        int b=this.b*c.b;
        return new Rational(a,b);
        
    }
    
}
