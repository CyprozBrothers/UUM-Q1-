package com.company;
import java.util.Scanner;
import java.lang.*;


public class Main {


    public static void main(String[] args) {
        String s, r = "", school;

        String[] abrv = {"ibs", "soa", "soc", "sois", "Islamic Business School", "School of Accounting", "School of Computing", "School of International Studies"};
        Scanner in = new Scanner(System.in);

        while (true){
            school = "";
            System.out.println();
        System.out.print("Enter an email: ");
            s = in.next();
            StringBuilder  name = new StringBuilder("");

        for (int i=0; i<4; i++) {
            r = "@" + abrv[i] + ".uum.edu.my"; // if (!(s.indexOf("@") == -1) && !(s.indexOf(abrv[i]) == -1) && !(s.indexOf(".uum.edu.my") == -1))
            if (s.indexOf(r) != -1) {  school = abrv[i+4]; break;}  }
        if (school == "")
            System.out.println("Wrong Format"); else {

                for (int i = 0; i < s.length() - 15; i++) {
                    if (s.charAt(i) != '@') name.append(s.charAt(i));
                    else break;
                }

                System.out.println("Name is: " + name);
                System.out.println("School is: " + school);



            }
    }
    }
}
