/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingafile;

import java.io.File;

/**
 *
 * @author Lucifer
 */
public class CreatingAfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file =new File("rohit");
//        if(file.exists()){
//           System.out.println("File already exists");
//            
//        }else if(file.mkdir()){
//            System.out.println("File created");
//            
//        }else{
//            System.out.println("cannot be created");
//        }
         RemoveAFile.removeFile(file.getPath());
    }
  
    
}
