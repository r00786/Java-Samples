/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Program to read and copy data using byte[]
public int available throws IOException 
with the help of this method all data of a file can be read at one attempt
 */
package copypastetwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Lucifer
 */
public class CopyPasteTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        long t1 = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        byte[] b = new byte[fis.available()];
        fis.read(b);
        fos.write(b);
        long t2 = System.currentTimeMillis();
        long t = t2 - t1;
        System.out.println("time taken " + t +" milliseconds");
    }

}
