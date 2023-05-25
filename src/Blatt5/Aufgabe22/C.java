package Blatt5.Aufgabe22;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C {
    public static void main(String[] args) {
        Random rd = new Random();
        Supplier<Character> supplier = () -> (char) ('a' + rd.nextInt(26));
        Stream<String> stringStream = Stream.generate(() -> {
            StringBuilder word = new StringBuilder();
            int randomLength = rd.nextInt(5, 11);
            word.append(String.valueOf(supplier).repeat(randomLength));
            return word.toString();
        }).limit(500);

        IntStream lengthStream = stringStream.mapToInt(String::length);
        double mean = lengthStream.average().orElseThrow();
        System.out.println(mean);
    }
}