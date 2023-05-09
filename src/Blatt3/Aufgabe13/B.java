package Blatt3.Aufgabe13;

import java.util.Arrays;
import java.util.Random;

public class B {
    public static void main(String[] args) {
        char[] zufallarr = new char[30];
        Random rd = new Random();
        for (int i = 0; i < zufallarr.length; i++) {
            zufallarr[i] = (char) ('A' + rd.nextInt(26));
        }
        Arrays.sort(zufallarr);
        //System.out.print(Arrays.toString(zufallarr));
        if (Arrays.binarySearch(zufallarr, 'X') < 0) {
            System.out.println("X kommt nicht vor");
            System.out.println("es sind " + (Math.abs(Arrays.binarySearch(zufallarr, 'X'))-1) + " Buchstaben kleiner als X");
        }else
            System.out.println("X kommt an der " + (Arrays.binarySearch(zufallarr,'X')+1) + ".Stelle vor");
    }
}