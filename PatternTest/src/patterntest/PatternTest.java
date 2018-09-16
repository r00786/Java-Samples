/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterntest;

/**
 *
 * @author Lucifer
 */
public class PatternTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] currArr=null;
        int[] prevArr=null;
        for(int i=1;i<=6;i++){
            currArr=new int[i];
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print(" "+1);
                    currArr[j-1]=1;
                }else{
                    if(i>2){
                        int p=prevArr[j-1]+prevArr[j-2];
                        System.out.print(" "+p);
                        currArr[j-1]=p;
                        
                    }
                }
            }
            System.out.println();
            prevArr=currArr;
        }
        currArr=null;
        prevArr=null;
    }
    
}
