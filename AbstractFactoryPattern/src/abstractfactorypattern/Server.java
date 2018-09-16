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
public class Server extends Computer implements ComputerFactory {

    String hdd;
    String ram;

    public Server(String hdd, String ram) {
        super(hdd, ram);
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String getHdd() {
        return hdd;
    }

    @Override
    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Server(hdd, ram);
    }

}
