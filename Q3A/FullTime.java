package com.company;

import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;

/**
 * Created by Owner on 4/27/2015.
 */
public class FullTime extends Employee {

    private double salary;

    public FullTime(){}
    public FullTime(String name, int id, double salary){ this.name = name; this.id = id; this.salary = salary;  }
    public void display(){
        System.out.println();
        System.out.println("Employee's name is: " + name);
        System.out.println("Employee's id is: " + id);
        System.out.println("Employee's salary is: " + salary);
    }
}