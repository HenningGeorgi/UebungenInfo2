package Blatt1.Aufgabe1;

import java.util.Random;
import java.lang.Math;

public class D {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            Random rd = new Random();
            boolean b = rd.nextBoolean();
            if (b) {
                int n = (int) (Math.random() * 1000 + 1);
                System.out.println("Die Wurzel der ganzzahligen Zufallszahl " + n + " ist " + Math.sqrt(n));
            }
        }
    }
}