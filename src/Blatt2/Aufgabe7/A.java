package Blatt2.Aufgabe7;

import java.util.Random;

public class A {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt();
        System.out.println("Ganze Zufallszahl: " + x);
        System.out.println("Umdrehen der Reihenfolge der Bits ergibt: " + Integer.reverse(x));
        System.out.println("Umdrehen der Reihenfolge der Bytes: " + Integer.reverseBytes(x));
        System.out.println("Zahl mit höchstens ein höchstwertiges Bit von 1: " + Integer.highestOneBit(x));
    }
}
