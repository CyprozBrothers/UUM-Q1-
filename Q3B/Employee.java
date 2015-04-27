package com.company;

/**
 * Created by Owner on 4/27/2015.
 */
public class Employee extends Person {

    protected int id;

    public Employee(){}
    public Employee(String name, int id){ this.name = name; this.id = id; }
    public void display(){
        System.out.println();
        System.out.println("Employee's name is: " + name);
        System.out.println("Employee's id is: " + id);
    }

    public boolean equals(Employee  emp){
        if ((this.name == emp.name) && (this.id == emp.id))
            return true; else return false;
    }
}
