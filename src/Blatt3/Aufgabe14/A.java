package Blatt3.Aufgabe14;

import java.util.Arrays;
import java.util.Random;

public class A {
    public static int[] wuerfeln() {
        int[] Wurf = new int[5];
        Random rand = new Random();
        for (int i = 0; i < Wurf.length; i++) {
            Wurf[i] = rand.nextInt(6)+1;
        }
        return Wurf;
    }
    public static double halbeChance(int[] ergebnisse){
        double halbe = 0;
        for (int i = 0; i < ergebnisse.length; i++) {
            halbe += ergebnisse[i];
            //System.out.println("a: "+ergebnisse[i]);
            //System.out.println("i: "+halbe);
        }
        halbe = halbe/2;
        return halbe;
    }
    public static int augenSumme(int []feldchen,int x){
        int count = 0;
        for (int i = 0; i<feldchen.length;i++){
            if(feldchen[i] == x)
                count++;
        }
        return count*x;
    }
    public static int fullHouse(int[] temp) {
        Arrays.sort(temp);
        int a = 0, b = 0;
        int zahl1 = temp[0];
        int zahl2 = 0;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == zahl1)
                a++;
            if (temp[i] != zahl1 && (zahl2 == 0 || zahl2 == temp[i])) {
                if (zahl2 == 0)
                    zahl2 = temp[i];
                b++;
            }
        }
        if ((a == 1 && b == 3) || (a == 2 && b == 2))
            return 25;
        else
            return 0;
    }
    public static void main(String[] args) {
        double endergebnis = 0;
        for(int j = 1; j <6;j++) {
            int[] Runde = wuerfeln();
            System.out.print(j+".Round: ");
            for (int i : Runde)
                System.out.print(i);
            System.out.print(" wurde gewürfelt\n");
            double temp1 = halbeChance(Runde);
            System.out.println("Chance : "+temp1);
            int merk = 0;
            for (int i = 1; i < 7; i++) {
                int temp2 = augenSumme(Runde, i);
                if (merk < temp2)
                    merk = temp2;
            }
            System.out.println("augensumme: "+merk);
            int last = fullHouse(Runde);
            System.out.println("Fullhosue: "+last);
            double biggest;
            biggest = last > (temp1>merk ? temp1:merk) ? last:((temp1>merk) ? temp1:merk);
            if(biggest == temp1)
                System.out.println("Beste Möglichkeit chance: "+biggest);
            if(biggest == merk)
                System.out.println("Beste Möglichkeit augensumme: "+biggest);
            if(biggest == last)
                System.out.println("Beste Möglichkeit Fullhouse: "+biggest);

            endergebnis += biggest;
        }
        System.out.println();
        System.out.println("Die Gesamtpunktzahl ist: "+endergebnis);
    }
}
