/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interupttest;

/**
 *
 * @author Lucifer
 */
public class InteruptTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.out.println("Master has started starting a servant and giving it 5 seconds to complete");
        
      Servant servant =new Servant();
      servant.start();
      servant.join(5000);
      if(servant.isAlive()){
          System.out.println("Servant is taking more time than usual... interupting it");
          servant.interrupt();
      }else{
          System.out.println("Servant is completed within given time");
      }
    }
    
}
