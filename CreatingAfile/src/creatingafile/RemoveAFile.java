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
public class RemoveAFile {
    
   public static void removeFile(String path){
        File file=new File(path);
        if(!file.exists()){
            System.out.println(file.getPath()+" doesnt exist");
        }else if(file.isFile()){
        file.delete();
        }else{
            String[] contents=file.list();
            for(int i=0;i<contents.length;i++){
                File child=new File(file,contents[i]);
                String a=child.getPath();
                removeFile(a);             
                
                
            }
            file.delete();
        }
    }
    
}
