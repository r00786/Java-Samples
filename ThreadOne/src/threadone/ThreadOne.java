/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadone;

/**
 *
 * @author Lucifer
 */
public class ThreadOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
      System.out.println("Main method is excecuted is "+Thread.currentThread().getName()+" Thread");
      new A();
      new A();
      new A();
      System.out.println("Requesting the scheduling of finalizer thread");
      System.gc();
      Thread.sleep(5000);
      System.out.println("Main THread resumed Objects left "+A.counter);
        
    }
    


}
class A{
    static int counter;
    public A(){
        counter++;
        System.out.println("Object no "+counter+" is created");       
     
    }
       public void finalize(){
           Thread th = Thread.currentThread();
           String tName=th.getName();
           System.out.println("Objecy no "+counter+" is destroyed by "+tName+" Thread" );
           counter--;
            
        }
}
