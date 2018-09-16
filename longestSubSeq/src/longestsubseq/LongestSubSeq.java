/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubseq;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lucifer
 */
public class LongestSubSeq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value = 0;
        int prevVal = 0;
        int sum = 0;
        ArrayList<Integer> subsequences = new ArrayList<>();
        int[] arr = {4, 5, 6, 7, 14, 15,100,101};
        int highestValue = 0;

        for (int i = 0; i < arr.length; i++) {
            value = arr[i];

            if (i != 0) {
                if (prevVal + 1 == value) {
                    if (sum == 0) {
                        sum =  value + prevVal;
                    } else {
                        sum = sum + value;
                    }
                    subsequences.add(sum);
                } else {
                    sum = 0;
                }
                if (arr[i] > arr[i - 1]) {
                    highestValue = arr[i];
                }
            }

            prevVal = arr[i];
        }
        Collections.sort(subsequences);
        Collections.reverse(subsequences);

        if (!subsequences.isEmpty()) {
            System.out.println(subsequences.get(0));
        } else {
            System.out.println(highestValue);
        }

    }

}
