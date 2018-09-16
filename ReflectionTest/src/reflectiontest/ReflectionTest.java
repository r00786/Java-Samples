/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class ReflectionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Class c;
        try {
            c = Class.forName("java.lang.Object");

            Field f[] = c.getDeclaredFields();
            for (Field v : f) {
                System.out.println(v);
            }
            Method m[] = c.getDeclaredMethods();
            for (Method v : m) {
                System.out.println(v);
            }
            Constructor ctrs[] = c.getDeclaredConstructors();
            for (Constructor v : ctrs) {
                System.out.println(v);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReflectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
