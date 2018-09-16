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
public abstract class Computer {

  private  String hdd;
  private  String ram;

    public Computer(String hdd, String ram) {
        this.ram = ram;
        this.hdd = hdd;
    }

    public abstract String getRam();

    public abstract void setRam(String ram);

    public abstract String getHdd();

    public abstract void setHdd(String hdd);
    
     @Override
    public String toString(){
        return "RAM= "+this.ram+", HDD="+this.hdd;
    }

}
