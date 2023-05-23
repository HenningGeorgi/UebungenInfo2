package Blatt5.Aufgabe22;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C {
    Random rd = new Random();
    Supplier<Character> supplier = () -> (char) ('a' + rd.nextInt(26));
    int randomLength = rd.nextInt(5, 11);
}
