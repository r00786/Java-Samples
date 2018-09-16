/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofirst;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Lucifer
 */
public class IOFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        BufferedInputStream bis = new BufferedInputStream(System.in);
//        BufferedReader bs = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
//
//        String g=bs.readLine();
//        System.out.println(g);
        FileInputStream fis = new FileInputStream("a.txt");

    int byteLength=50; //bytecount of the file-content
    byte[] filecontent = new byte[7];
 int bs=fis.read(filecontent);
 for(byte b: filecontent){
     System.out.println((char)b);
     
     PrintStream ps=new PrintStream(new FileOutputStream("a.txt"));
     ps.println("ritik is bad boy he dont know anything  he is a shy boy ");
 }

    }

}
