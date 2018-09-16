/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodchaining;

/**
 *
 * @author Lucifer
 */
public class MethodChaining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MChaining chaining =new MChaining();
        chaining.first().second().third().fourth().fifth();
    }
    
}
class MChaining{
    public MChaining first(){
        System.out.println("In first method");
       return new MChaining(); 
    } 
      public MChaining second(){
        System.out.println("In second method");
       return new MChaining();
    } 
        public MChaining third(){
        System.out.println("In third method");
       return new MChaining(); 
    } 
          public MChaining fourth(){
        System.out.println("In fourth method");
       return new MChaining(); 
    } 
            public MChaining fifth(){
        System.out.println("In fifth method");
       return new MChaining(); 
    } 
}