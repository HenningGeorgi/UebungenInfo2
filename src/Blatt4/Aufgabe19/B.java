package Blatt4.Aufgabe19;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class B {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 5000; i++) {
            integerList.add(rd.nextInt(10000));
        }
        integerList.forEach(s -> {
            if (s % 2 == 0) s *= s;
        });
        Predicate<Integer> isPrime = x -> {
            if (x <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
        integerList.removeIf(isPrime);
        integerList.forEach(System.out::println);
    }
}
