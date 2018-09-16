/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercodetest;

/**
 *
 * @author Lucifer
 */
public class CharacterCodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String test="abcdefghijklmnopqrstuvxyz";
        char[] testChar=test.toCharArray();
        for(char c :testChar){
            int code=(int)c;
            if(code>64&&code<91){
                System.out.println(c+" = "+(code-64));
            }else{
                   System.out.println(c+" = "+(code-96));
            }
        }
        
        
    }
    
}
