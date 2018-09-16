/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordproblem;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucifer
 */
public class WordProblem {
  static ArrayList<String> list=new ArrayList<>();
   static ArrayList<String> longestWord=new ArrayList<>();
         static   int getPosition=-1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
      
       System.out.println("Press with 1 for short list and 2 for long list");
        // TODO code application logic here
         int a=s.nextInt();
         String path="src/words.txt";
         if(a==2){
             path="src/words1.txt";
         }
         
          try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
			
                                list.add(sCurrentLine);
                                        
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
   
        
          
            addData();       
           
            System.out.println("longest word"+" "+ longestWord.get(getPosition));
            
          
            longestWord.clear();
            getPosition=-1;
            addData();
            
             System.out.println("longest word"+" "+ longestWord.get(getPosition));
             
          
            
            
       
        
        
      
            
    
   
    
      
    }
   static void addData(){
            int maxSize=0;
          String previous="";
          for(String string : list){
              if(string.length()>maxSize){
                  maxSize=string.length();
              }
                 
                  
          }
          for(String string:list){
              if(string.length()==maxSize){
                  longestWord.add(string);
              }
          }
          for(String string:longestWord){
              list.remove(list.indexOf(string));
          }

         for(String string : longestWord){
                 char[] array=string.toCharArray();
                 ArrayList<String> templist=new ArrayList<>();
                 for(char c:array){
                     templist.add(String.valueOf(c));
                    
                 }
         
             for(String substring:list){
                  
                 char[] subarray=substring.toCharArray();
             if(checkWord(templist,subarray)){
                 for(char subchar:subarray){
                     
                      
                     if(templist.contains(String.valueOf(subchar))){  
                       
                        
                      
                              templist.remove(templist.indexOf(String.valueOf(subchar)));
                       
                         
                         
                        
                         
                       
                         
                     }
                 }}
                   if(templist.size()==0){
                 getPosition=longestWord.indexOf(string);
                
                 
             }
                   
             }
         
           
             
         }
         if(getPosition==-1){
             longestWord.clear();
             addData();
         }
        
        
     
    }
 static  boolean checkWord(ArrayList<String> list,char[] word){
       int previous=-1;
       ArrayList<String> checkList=new ArrayList<>();
       for(char c:word){
           checkList.add(String.valueOf(c));
       }
       for(int i=0;i<list.size();i++){
           
              if(checkList.contains(list.get(i))&&i==previous+1){
                  if(previous!=-1){
                  checkList.remove(checkList.indexOf(list.get(i)));}
                  
                   previous=i;
              }
           
          
       }
       if(checkList.size()<=1){
           return true;
       }else{
            return false;
       }
   
}
}
