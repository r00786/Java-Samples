/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedtest;

/**
 *
 * @author Lucifer
 */
/*
 * 
 * Program showing the use of Synchronized keyword in java
which gets the resource in a mutual exclusive manner 
by locking the object as every object has a flag called lock which is set by default
to false by using synchronized keyword we set it to true

 */
public class SynchronizedTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Print p=new Print();
        User user=new User(p,"hi one");
        User userTwo=new User(p,"hi Two");
        user.start();
        userTwo.start();
    }
    
}
