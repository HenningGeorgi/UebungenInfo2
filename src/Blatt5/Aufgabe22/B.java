package Blatt5.Aufgabe22;

import java.util.function.IntSupplier;
import java.util.Random;
import java.util.stream.IntStream;

public class B {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7};
        Random rd = new Random();
        IntSupplier supplier = () -> array[rd.nextInt(array.length)];
        IntStream stream = IntStream.generate(supplier).limit(100);
        System.out.println("Die Summe ist: " + stream.reduce(Integer::sum).orElse(0));
    }
}
