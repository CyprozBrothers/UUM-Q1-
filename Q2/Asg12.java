package com.company;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;


public class Main {


    public static void main(String[] args) {
        int n, x;
        Dice d = new Dice();
        int[] arr = {0, 0, 0, 0, 0, 0};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter N > ");
        n = in.nextInt();
        Random rand = new Random();

        for (int i = 0; i<n; i++) {
             x = d.rollDice(rand);
            arr[x-1]++;
        }

        for (int i = 0; i<6; i++)
            System.out.println("No " + (i+1) + " = " + arr[i]);

    }
}