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
public class SelectionSort {
    public int items[];
    
    public SelectionSort(int items[]){
        this.items=items;
        
    }
    
    public int[] getSortedList(){
        for(int i=0;i<items.length;i++){
            int presentIndex=i;
            for(int j =presentIndex+1;j<items.length;j++){
                if(items[presentIndex]>items[j]){
                    items[presentIndex]=items[presentIndex]^items[j];
                    items[j]=items[j]^items[presentIndex];
                    items[presentIndex]=items[presentIndex]^items[j];
//                    presentIndex=j;
                    
                }
            }
        }
        return items;
    }
    
}
