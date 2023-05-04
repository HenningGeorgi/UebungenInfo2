package Blatt2.Aufgabe6;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl zwischen 0 und 50 ein:");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n >= 0 && n <= 50) System.out.println(n);
        } else {
            System.err.println("Eingabefehler: Benutzereingabe ist keine ganze Zahl!");
            System.exit(-1);
        }
        sc.close();
    }
}
