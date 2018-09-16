/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectinvokemethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class ReflectInvokeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException {
        try {
            // TODO code application logic here
            Class c = Class.forName("reflectinvokemethod.A");
            Method m = c.getDeclaredMethod("display", null);
            m.setAccessible(true);
           
            
            Constructor ctr = c.getDeclaredConstructor(null);
            ctr.setAccessible(true);
             Object obj = ctr.newInstance();
            m.invoke(obj, null);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReflectInvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ReflectInvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(ReflectInvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ReflectInvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReflectInvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
