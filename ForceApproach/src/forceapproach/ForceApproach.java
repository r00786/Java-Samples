/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forceapproach;

/**
 *
 * @author Lucifer
 */
public class ForceApproach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Add first=new Add(4,4);
        Add second=new Add(5,8);
        
        Add three =(Add)first.add(second);
        three.display();
        
    }
    
}
