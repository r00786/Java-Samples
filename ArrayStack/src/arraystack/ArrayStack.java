/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

/**
 *
 * @author Lucifer
 */
public class ArrayStack {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackTest s=new StackTest();
        System.out.println("Stack operation");
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.display();
        
         QueueTest q=new QueueTest();
          System.out.println("Queue operation");
        q.push(1);
        q.push(2);
        q.push(3);
        q.display();
        q.pop();
        q.display();
        

    }

}
 class StackTest{
    int size = 10;
    int[] arr = new int[size];
    int top = -1;

    public void push(int element) {
        if (top < size - 1) {
            top++;
            arr[top] = element;
            System.out.println("Item pushed");
        } else {
            System.out.println("Stack full");
        }

    }

    public void pop() {
        if (top >= 0) {
            top--;
            System.out.println("Item popped");
        } else {
            System.out.println("Stack Empty");
        }
    }

    public void display() {
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("No elements in Stack");

        }
    }
 }
    class QueueTest{
    int size = 10;
    int[] arr = new int[size];
    int start = 0;
    int end=-1;
    int dynamicSize;

    public void push(int element) {
     if(end<size-1){
         end++;
         arr[end]=element;
         System.out.println("Element inserted");
         dynamicSize++;
     }else{
         System.out.println("Queue full");
     }
    }

    public void pop() {
        if (start >= 0) {
            start++;
            dynamicSize--;
            System.out.println("Item popped");
        } else {
            System.out.println("Queue Empty");
        }
    }

    public void display() {
        if (dynamicSize >= 0) {
            for (int i = start; i <= end; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("No elements in Stack");

        }
    }
    
}
 
