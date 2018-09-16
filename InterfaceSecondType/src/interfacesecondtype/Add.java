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
public class Add implements Addable{
    private int a;
    private int b;
public Add(int a,int b){
    this.a=a;
    this.b=b;
}
    @Override
    public void display() {
        System.out.println(a+"+"+b+"i");
    }

    @Override
    public Addable dosum(Addable x) {
        Add c=(Add)x;
        int a=this.a+c.a;
        int b=this.b+c.b;
        return new Add(a,b);
    }
    
}
