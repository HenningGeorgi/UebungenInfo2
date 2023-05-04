package Blatt2.Aufgabe7;

import java.util.Random;

public class C {
    public static void main(String[] args) {
        Random rd = new Random();
        double a = rd.nextDouble();
        Double wrapperA = Double.valueOf(a);
        int e = rd.nextInt(1000);
        double x = wrapperA.doubleValue() * (10^e);
        Double wrapperX = Double.valueOf(x);
        System.out.println("Inhalt von wrapperX ist unendlich? " + wrapperX.isInfinite());
        String stringX = String.valueOf(x);
        System.out.println(stringX);
        stringX = wrapperX.toString(wrapperX);
        System.out.println(stringX);
    }
}
