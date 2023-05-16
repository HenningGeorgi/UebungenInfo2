package Blatt3.Aufgabe14;

import java.util.Random;

public class Aufgabe14 {
    // e)
    public static void main(String[] args) {
        System.out.println("5 Runden Kniffel spielen:\n");

        int endergebnis = 0;
        for (int runde = 0; runde < 5; runde++) {
            int[] wurf = wuerfeln();

            System.out.print((runde + 1) + ". Runde: ");
            for (int augenZahl : wurf) System.out.print(augenZahl + ", ");
            System.out.println();

            int maxAugenSumme = 0;
            int zahl = -1;
            for (int x = 1; x <= 6; x++) {
                int punkte = augenSumme(wurf, x);
                if (punkte > maxAugenSumme) {
                    maxAugenSumme = punkte;
                    zahl = x;
                }
            }

            if (maxAugenSumme > halbeChance(wurf) && maxAugenSumme > fullHouse(wurf)) {
                System.out.println("Augensumme von " + zahl + ": " + maxAugenSumme + " Punkte");
                endergebnis += maxAugenSumme;
            } else if (halbeChance(wurf) > fullHouse(wurf)) {
                int punkte = halbeChance(wurf);
                System.out.println("Chance: " + punkte + " Punkte");
                endergebnis += punkte;
            } else {
                int punkte = halbeChance(wurf);
                System.out.println("Full House: " + punkte + " Punkte");
                endergebnis += punkte;
            }
        }

        System.out.println("\nErreichte Gesamtpunktzahl: " + endergebnis);
    }

    // a)
    public static int[] wuerfeln() {
        Random rd = new Random();
        int[] wurf = new int[5];
        for (int i = 0; i < wurf.length; i++) {
            wurf[i] = rd.nextInt(6) + 1;
        }

        return wurf;
    }

    // b)
    public static int halbeChance(int[] wurf) {
        int sum = 0;
        for (int augenZahl : wurf) {
            sum += augenZahl;
        }

        return sum / 2;
    }

    // c)
    public static int augenSumme(int[] wurf, int x) {
        int augenSumme = 0;
        for (int augenZahl : wurf) {
            if (augenZahl == x) augenSumme += x;
        }

        return augenSumme;
    }

    // d)
    public static int fullHouse(int[] wurf) {
        int ersteZahl = wurf[0];
        int zweiteZahl = 0;
        int anzErsteZahl = 1;
        int anzZweiteZahl = 0;

        for (int augenZahl : wurf) {
            if (augenZahl == ersteZahl) {
                anzErsteZahl++;
            } else if (augenZahl == zweiteZahl){
                anzZweiteZahl++;
            } else {
                zweiteZahl = augenZahl;
                anzZweiteZahl++;
            }
        }

        return ((anzErsteZahl == 2 && anzZweiteZahl == 3) || anzErsteZahl == 3 && anzZweiteZahl == 2) ? 25 : 0;
    }
}
