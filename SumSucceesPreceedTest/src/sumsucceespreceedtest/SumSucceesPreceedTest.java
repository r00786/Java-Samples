/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumsucceespreceedtest;

/**
 *
 * @author Lucifer
 */
public class SumSucceesPreceedTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int indexofItem=0;
        int j,k;
        int index=-1;
        int preceedingSum=0;
        int suceedingSum=0;
        int[] testArr={2,4,4,5,4,1};
        for(int i=0;i<testArr.length;i++){
            suceedingSum=0;
            preceedingSum=0;  
            boolean leftdone=false;
            
         for(j=i,k=j+1;j>=0||k<testArr.length;i--,k++){
             if(j>=0&&!leftdone){
                 preceedingSum+=testArr[j];
                 leftdone=true;
             }
             if(k>j&&k<6){
            suceedingSum+=testArr[k];}
            
        }
         if(preceedingSum==suceedingSum){
             index=i;
             break;
         }
                 
            
        }
        if(index!=-1){
            System.out.println(index);
        }
    }
    
}
