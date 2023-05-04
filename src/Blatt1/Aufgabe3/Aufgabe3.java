package Blatt1.Aufgabe3;

import java.util.Random;

public class Aufgabe3 {
    public static void main(String[] args) {
        // d)
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            if (coinFlip().equals("Kopf")) {
                int rdInt = rd.nextInt(20) + 1;
                System.out.println(rdInt + (isFibonacci(rdInt) ? " ist eine Fibonaccizahl" : " ist keine Fibonaccizahl"));
            } else {
                int[] v = new int[10];
                for (int c = 0;c < v.length; c++) {
                    v[i] = rd.nextInt();
                }
                System.out.println("Die zweitgrößte Zahl in dem Array v ist " + secondLargest(v));
            }
        }
    }

    // a)
    public static String coinFlip() {
        Random rd = new Random();
        return rd.nextBoolean() ? "Kopf" : "Zahl";
    }

    // b)
    public static boolean isFibonacci(int n) {
        if (n == 1) {
            return true;
        } else {
            int[] firstIFibonacci = new int[n];
            firstIFibonacci[0] = 1;
            firstIFibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                firstIFibonacci[i] = firstIFibonacci[i - 1] + firstIFibonacci[i - 2];
                if (firstIFibonacci[i] == n) return true;
            }
            return false;
        }
    }

    // c)
    public static int secondLargest(int[] nArray) {
        int secondLargest = 0;
        int largest = nArray[0];
        for(int i = 1; i < nArray.length; i++) {
            if (nArray[i] > nArray[i-1]) {
                secondLargest = largest;
                largest = nArray[i];
            }
        }

        return secondLargest;
    }
}
