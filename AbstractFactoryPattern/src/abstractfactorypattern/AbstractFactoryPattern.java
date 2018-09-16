/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;



/**
 *
 * @author Lucifer
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computer pc =ComputerBuilder.buildComputer(new Pc("123","156"));
        Computer server =ComputerBuilder.buildComputer(new Server("1567","158906"));
        System.out.println("Pc : "+pc);
        System.out.println("Pc : "+server);
        
    }
    
}
