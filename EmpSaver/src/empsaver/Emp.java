/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empsaver;

import java.io.Serializable;

/**
 *
 * @author Lucifer
 */
public class Emp implements Serializable {

    private String name, job;
    private int salary;

    public Emp(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void display() {
        System.out.println(name + "\t" + job + "\t" + "\t" + salary);
    }

}
