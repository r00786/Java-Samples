/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybillmaker;

import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class ElectricityBillMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Name for Bill");
        String name=in.nextLine();
        System.out.println("Enter Month");
        String month=in.nextLine();
        System.out.println("Enter Prev Reading");
        int prevReading=in.nextInt();
        System.out.println("Enter New Reading");
        int newReading=in.nextInt();        
        Bill b=new Bill(name,month,prevReading,newReading);
        b.createBill();
    }
    
}
