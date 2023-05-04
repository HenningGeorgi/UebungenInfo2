package Blatt2.Aufgabe6;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        for (String arg : args) {
            Scanner sc = new Scanner(arg);
            int sum = 0;
            sc.findAll("\\d+");
            System.out.println(sum);
            sc.close();
        }
    }
}
