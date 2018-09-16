/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empsaver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Lucifer
 */
public class EmpSaver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emp e1 = new Emp("Amit", "Trainee", 5000);
        Emp e2 = new Emp("Raman", "Accouuntant", 25000);
        System.out.println("Following object will be serialized");
        e1.display();
        e2.display();
        System.out.println("Serializing...");
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("emp.obj"));
            os.writeObject(e1);
            os.writeObject(e2);
            System.out.println("Succesfully Serialized");
            os.close();
            deserialize();
        } catch (Exception e) {

        }

    }
    public static void deserialize(){
                System.out.println("Deserializing...");
        
      
        try {
          ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emp.obj"));
            Emp e1=(Emp)ois.readObject();
            Emp e=(Emp)ois.readObject();
            e1.display();
            e.display();
            ois.close();
        } catch (Exception e) {

        }
        System.out.println("Successfully Deserialized..");
    }

}
