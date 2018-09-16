/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybillmaker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author Lucifer
 */


public class Bill {
private String Name;
private int prevReading;
private int newReading;
private String nextLine="\n";
private String month;
private int Rate=7;
public Bill(String name,String month,int prevReading,int newReading){
    Name=name;
    this.prevReading=prevReading;
    this.newReading=newReading;
    this.month=month;
}

public void createBill(){
    StringBuilder string=new StringBuilder();
    int totalReading =newReading-prevReading;
  ArrayList<String> billlist=new ArrayList<>();
   billlist.add(Name+nextLine);
    billlist.add("Electrity Bill For Month: "+month+nextLine);
    billlist.add("Prev Reading: "+prevReading+nextLine);
   billlist.add("New Reading: "+newReading+nextLine);    
   billlist.add("Total Bill : "+totalReading*7+" Rs."+nextLine);    
    System.out.println(string);
    try{
    File file=new File(Name+".txt");
    if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
    PrintWriter writer = new PrintWriter(file, "UTF-8");
    for(String obj:billlist){
        writer.println(obj);
    }


writer.close();


    }
    catch(Exception e){
        System.out.println("Some error occurred");
    }
 
    
    
}
    
}
