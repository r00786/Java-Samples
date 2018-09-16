/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Lucifer
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DerivedClass dv;
        dv = new DerivedClass(5,6,8);
        dv.display();
//        BaseClass bv=new BaseClass(7,8);
//        bv.display();
    }
    

    
}
    class DerivedClass extends BaseClass{
    
        public  DerivedClass(int x, int y,int z) {
            super(x, y);
            System.out.println(super.integer);
        }
//        @Override
//        public void display(){
//            System.out.println("in overided method");
//        }
    
}

