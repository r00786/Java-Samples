/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prpogramone;

/**
 *
 * @author Lucifer
 */
public class PrpogramOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=7;
        int numberToBeMultiplied=0;
        int half=0;
        if(n%2==0){
            half=n/2;
        }else{
            half=(n/2)+1;
        }
        for(int i=1;i<=n;i++){
                 if(i<=half){
                     printSequence(n*numberToBeMultiplied,n);     
                     numberToBeMultiplied+=2;               
                }else{
                     numberToBeMultiplied=((n-i)*2)+1;
                     printSequence(n*numberToBeMultiplied,n);
                             
                 }
    }
    }
    public static void printSequence(int firstNum,int range){
         for(int j=0;j<range;j++){
             System.out.print(" "+ ++firstNum);             
            }
         System.out.println();
    }
    
}
