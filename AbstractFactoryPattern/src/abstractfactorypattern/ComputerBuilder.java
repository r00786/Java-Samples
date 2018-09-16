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
public class ComputerBuilder {
    public static Computer buildComputer(ComputerFactory factory){
        return factory.createComputer();
    } 
    
}
