/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to continue");

        String str = in.nextLine();

        if (checkPalindrome(str)) {
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }

    }

    static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < (n / 2); i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

}
