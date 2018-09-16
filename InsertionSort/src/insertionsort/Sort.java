/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.List;

/**
 *
 * @author Lucifer
 */
public class Sort {
    int[] items;
    
    
    public Sort(int[] items){
        this.items=items;        
    }
    
    public int[] getSortedList(){
        for(int i=1;i<items.length;i++){
            int key=items[i];
            int j=i;
            while(j>0&&key<items[j-1]){
                items[j]=items[j-1];
                j=j-1;
               
            }
            items[j]=key;
            
        }
        return items;
    }
    
}
