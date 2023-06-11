package Blatt5.Aufgabe22;

import java.util.Random;
import java.util.stream.IntStream;

public class A {
    public static void main(String[] args) {
        Random rd = new Random();
        IntStream intStream = IntStream.of(rd.ints(1000,0,100)
                .filter(i -> i % 10 == 0)
                .distinct()
                .sum());
        intStream.forEach(System.out::println);
    }
}
