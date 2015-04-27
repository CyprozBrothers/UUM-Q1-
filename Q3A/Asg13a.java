package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "";
        int id = 0;
        double salary = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("+++++++++ Creating a FullTime Employee +++++++++");
        System.out.println();
        System.out.print("Enter a name: ");
        name = in.next();
        System.out.print("Enter an ID: ");
        id = in.nextInt();
        System.out.print("Enter a salary: ");
        salary = in.nextDouble();

        FullTime a = new FullTime(name, id, salary);
        a.display();

        System.out.println();
        System.out.println("+++++++++ Creating a PartTime Employee +++++++++");
        System.out.println();
        System.out.print("Enter a name: ");
        name = in.next();
        System.out.print("Enter an ID: ");
        id = in.nextInt();

        PartTime b = new PartTime();
        Employee c = new Employee();
        c = b;
        c.name = name; c.id = id;
        PartTime d = (PartTime) c;

        b.display();
    }
}