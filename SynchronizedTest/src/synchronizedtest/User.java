/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedtest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class User extends Thread {
    Print p;
    String msg;
    public User(Print p,String msg){
        this.p=p;
        this.msg=msg;        
    }
    @Override
    public void run(){
        try {
            p.printLine(msg);
        } catch (InterruptedException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
