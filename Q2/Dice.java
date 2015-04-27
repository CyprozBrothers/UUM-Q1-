package com.company;
import java.util.Random;
/**
 * Created by Owner on 4/27/2015.
 */
public class Dice {

    int x;
    public Dice(){
        x = 1;
    }

    public int rollDice(Random rand) {
        x = rand.nextInt(6) + 1;
        return  x;
    }
}