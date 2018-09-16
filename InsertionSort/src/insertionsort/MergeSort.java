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
public class MergeSort {

    private int[] items;
          
    
    public MergeSort(){
      
        
    }
    
    public void sortByRecursion(int[] items){
        int n =items.length;
        if(n<2){
            return ;
        }
        int mid=n/2;
        int[] left=new int[mid];
        int[] right=new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]=items[i];
        }     
        
        int k=0;
         for(int i=mid;i<n;i++){
             right[k]=items[i];      
             k+=1;
        } 
         sortByRecursion(left);
         sortByRecursion(right);
         merge(left,right,items);
              
       
      
    }
    
    
    public int[] getSortedList(){
        return items;
    }
    void  merge(int[] left ,int[] right,int[] arr){
        int nl=left.length;
        int nr=right.length;
        int i=0,j=0,k =0;
        while(nl>i&&nr>j){
        if(left[i]<=right[j]){
            arr[k]=left[i];
            i++;
            
        }else if(right[j]<=left[i]){
            arr[k]=right[j];
            j++;            
        }
        k=k+1;
        }
        while(nl>i){
            arr[k]=left[i];
            i+=1;
            k+=1;
        }
        while(nr>j){
            arr[k]=right[j]; 
            j+=1;
            k+=1;
        }
        this.items=arr;
       
    }
    
}
