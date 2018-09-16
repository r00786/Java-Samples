/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Lucifer
 */
public class SetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set setone = new HashSet();
        setone.add(555);
        setone.add(666);
        setone.add(999);
        setone.add(1000);
        setone.add(777);
        setone.add(333);
        setone.add(222);
        setone.add(100);
        setone.add(100);
        setone.add(99);
        
        Iterator iteratorone = setone.iterator();

        while (iteratorone.hasNext()) {
            System.out.println(iteratorone.next());
        }
        Set set = new TreeSet();
              set.add(555);
        set.add(666);
        set.add(999);
         set.add(999);
        set.add(1000);
        set.add(777);
        set.add(333);
        set.add(222);
        set.add(100);
        set.add(99);
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
