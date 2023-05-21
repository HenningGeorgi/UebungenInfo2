package Blatt4.Aufgabe19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class A {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(args));
        UnaryOperator<String> upperCase = String::toUpperCase;
        stringList.forEach(upperCase::apply);
        stringList.removeIf(s -> (s.startsWith("A")));
        stringList.forEach(System.out::println);
    }
}
