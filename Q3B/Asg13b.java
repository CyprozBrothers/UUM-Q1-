package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "";
        int id = 0;
        double salary = 0.0;
        Scanner in = new Scanner(System.in);

        Employee emp1 = new Employee("Batman", 999);
        Employee emp2 = new Employee("Batman", 111);

        FullTime emp3 = new FullTime("Gaara", 333, 4000);
        FullTime emp4 = new FullTime("Gaara", 333, 4000);

        System.out.println();
        if (emp1.equals(emp2)) System.out.println("Employee 1 is equal to Employee 2.");
        else System.out.println("Employee 1 is NOT equal to Employee 2!");

        System.out.println();
        if (emp3.equals(emp4)) System.out.println("FullTime Employee 1 is equal to FullTime Employee 2.");
        else System.out.println("FullTime Employee 1 is NOT equal to FullTime Employee 2!");


    }
}
