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
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] items=new int[10];
        int index=0;
        for(int i=10;i>0;i--){
            items[index]=i;
            index++;
            
        }
        QuickSort sort=new QuickSort();
        System.out.println("Before Sort");
//        sort.sortByRecursion(items);

        for(int i=0;i<items.length;i++){
               System.out.println(items[i]);
        }
        sort.getSortedList(items, 0, items.length-1);
          System.out.println("After Sort");
        for(int i=0;i<sort.getList().length;i++){
               System.out.println(sort.getList()[i]);
        }
     
    }
    
}
