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
public class BubbleSort {
     public int items[];
    
    public BubbleSort(int items[]){
        this.items=items;
        
    }
    
    public int[] getSortedList(){
        for(int i=0;i<items.length;i++){
          
            for(int j =0;j<items.length-1;j++){
                if(items[j]>items[j+1]){
                    items[j]=items[j]^items[j+1];
                    items[j+1]=items[j+1]^items[j];
                  items[j]=items[j]^items[j+1];
//                    presentIndex=j;
                    
                }
            }
        }
        return items;
    }
}
