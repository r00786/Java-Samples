/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Program to copy and paste to a file by reading data line by line
*/
package copypaste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author Lucifer
 */
public class CopyPaste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fis = new FileInputStream("a.txt");

        FileOutputStream fos = new FileOutputStream("b.txt");
        long t1 = System.currentTimeMillis();
        while (true) {
            int b = fis.read();
            if (b == -1) {
                break;
            } else {
                fos.write(b);
            }
        }
        long t2 = System.currentTimeMillis();

        fos.close();
        fis.close();
        long t = t2 - t1;

        System.out.println("Successfully copied in " + t + " milliseconds");

        // TODO code application logic here
    }

}

class LineByLine{
    public LineByLine(){
        
    }
    public void read() throws FileNotFoundException, IOException{
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        
        PrintStream ps=new PrintStream(new FileOutputStream("b.txt"));
        long t2 =System.currentTimeMillis();
        while(true){
            String line =br.readLine();
            if(line==null){
                break;
            }
            ps.println(line);
        }
        long t3=System.currentTimeMillis();
        
        long t=t3-t2;
        System.out.println("time taken is "+t);
    }
}
