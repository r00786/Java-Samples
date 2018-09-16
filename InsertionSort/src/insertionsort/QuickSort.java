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
public class QuickSort {
    
    int[] items;
    int partition(int[] arr,int low,int high){
        
        int startIndex=(low-1);
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                startIndex+=1;
                int temp=arr[j];
                arr[j]=arr[startIndex];
                arr[startIndex]=temp;
            }
            
        }
        int temp=arr[high];
        arr[high]=arr[startIndex+1];
        arr[startIndex+1]=temp;
        this.items=arr;
        
        
        return startIndex+1;     
        
        
        
    }
    
    public void getSortedList(int[] arr,int low,int high){
        if(low<high){
            int partition=partition(arr,low,high);
            getSortedList(arr,low,partition-1);
            getSortedList(arr,partition+1,high);
        }
        
        
    }
    public int[] getList(){
        return items;
    }
}
