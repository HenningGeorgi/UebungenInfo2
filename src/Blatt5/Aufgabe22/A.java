package Blatt5.Aufgabe22;

import java.util.Random;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        Random rd = new Random();
        IntStream intStream = rd.ints(1000,0, 100);
        intStream.forEach(s -> s = s / 10);
        intStream = intStream.distinct();
        System.out.println("Die Summe der verbleibenden Zahlen ist: "+intStream.sum());
    }
}
