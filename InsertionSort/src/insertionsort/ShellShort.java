/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Lucifer
 */
public class ShellShort {
    
        public int items[];
    
    public ShellShort(int items[]){
        this.items=items;
        
    }
    
    public int[] getSortedList(){
        int n =items.length;
        for(int i=n/2;i>0;i/=2){            
            
            for(int k=i;k<n;k+=1){
                int temp=items[k];
            int j;
            for(j=k;j>=i&&items[j-i]>temp;j-=i){
                items[j]=items[j-i];
            }                              
               
            items[j]=temp; 
            }
         
         
        }
        return items;
    }
    
}
