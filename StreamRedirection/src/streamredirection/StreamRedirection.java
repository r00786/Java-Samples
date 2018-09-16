/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Program for redirection of printStream to a file 
*/
package streamredirection;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Lucifer
 */
public class StreamRedirection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintStream pw=new PrintStream(new FileOutputStream("a.txt"));
        System.out.println("Enter text and end to terminate");
        /*
        reference of console is saved 
        */
        PrintStream temp=System.out;
        /*
        Stream is redirected to file 
        */
        System.setOut(pw);
        while(true){
            String line =br.readLine();
            if(line.equalsIgnoreCase("end"))
                break;
            /*
            line is written into file as the stream is redirected 
            */
            System.out.println(line);
        }
        pw.close();
        br.close();
        System.setOut(temp);
        System.out.println("Successfully done");
    }
    
}
