package Blatt2.Aufgabe6;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl zwischen 0 und 50 ein:");
        System.out.println(sc.nextInt());
        sc.close();

        // Bei einer anderen Eingabe als eine Zahl wird von java.util eine InputMismatchException geworfen
    }
}
