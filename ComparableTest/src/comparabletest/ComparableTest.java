/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparabletest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Lucifer
 */
public class ComparableTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list = new ArrayList();

        list.add(new Emp("a",6));
        list.add(new Emp("b",5));
        list.add(new Emp("c",4));
        list.add(new Emp("g",3));
        list.add(new Emp("f",3));
        list.add(new Emp("d",1));
        list.add(new Emp("e",9));
        Collections.sort(list);

        Iterator iter=list.iterator();
        while(iter.hasNext()){
            Emp e=(Emp)iter.next();
            System.out.println(e.a);
            
        }

    }

}
