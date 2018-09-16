/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Lucifer
 */
public class DifferentOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ArrayList<String> content = new ArrayList<String>();
            File file = new File("A.txt");
            int count = 0;
            if (file.createNewFile()) {
       //Silent if
            } else {
              BufferedReader br = new BufferedReader(new FileReader(file));
 
  String st;
  while ((st = br.readLine()) != null)
  {
      count=Integer.valueOf(st);
  }
    
  }
            System.out.println(count+1);
            if(count%3==0){
                System.out.println("Google");
                
            }else if(count%2==0){
                System.out.println("Microsoft");
            }else {
                System.out.println("Sun Microsystems");
            }
            
            count+=1;
              PrintWriter printwriter = new PrintWriter(file, "UTF-8");
                clearFile();
                content.clear();
                content.add(String.valueOf(count));
                for (String obj : content) {
                    printwriter.write(obj);
                }
                printwriter.close();
        
        }

            
        catch (Exception e) {
//Silent Catch
        }

    }

    public static void clearFile() {
        try {
            FileWriter fileWriter = new FileWriter("A.txt", false);
            PrintWriter printWriter = new PrintWriter(fileWriter, false);
            printWriter.flush();
            printWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            //Silent Catch

        }
    }

}
