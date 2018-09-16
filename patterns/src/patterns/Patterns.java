/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author Lucifer
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <4- i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
          for (int i = 1; i < 4; i++) {
            for (int j = 0; j <4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
