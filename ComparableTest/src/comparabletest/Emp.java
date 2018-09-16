/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparabletest;

/**
 *
 * @author Lucifer
 */
public class Emp implements Comparable<Emp> {

    String a;
    int b;

    public Emp(String a,int b) {

        this.a = a;
         this.b = b;

    }

    @Override
    public int compareTo(Emp o) {
       return o.a.compareTo(this.a);
    }

}
