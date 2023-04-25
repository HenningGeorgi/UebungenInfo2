package Blatt1.Aufgabe1;

import java.lang.Math;

public class B {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        int counter = 1;
        while (randomNumber < 0.999) {
            randomNumber = Math.random();
            counter++;
        }
        System.out.println(counter);
    }
}
