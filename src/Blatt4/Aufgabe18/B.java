package Blatt4.Aufgabe18;

import java.util.HashMap;
import java.util.Random;

public class B {
    public static HashMap<Integer, Float> averageRelativeDeltaFromMean(HashMap<Integer, Integer> map) {
        //Durchschnitt von allen berechnet
        HashMap<Integer, Float> abweichung = new HashMap<>();
        HashMap<Integer, Float> rueckgabe = new HashMap<>();
        float avg = 0;
        for (int i = 0; i < map.keySet().size(); i++) {
            avg += map.get(i);
            //    System.out.print(i+": "+avg+"\t");
        }
        avg = avg / map.keySet().size();//sollte passen


        //relative absolute Abweichung von jeden key berechnet
        float relabsAbweichung = 0;
        for (int i = 0; i < map.keySet().size(); i++) {
            relabsAbweichung = Math.abs((map.get(i) - avg)) / avg;
            abweichung.put(i, relabsAbweichung);
        }
        //sollte passen

        //Durchschitt der relativen Häufigkeit berechnet
        float avgfinal = 0;
        for(int i = 0; i < abweichung.keySet().size();i++)
            avgfinal += abweichung.get(i);
        avgfinal = avgfinal / abweichung.keySet().size();

        for (int i = 0; i < abweichung.keySet().size();i++)
            rueckgabe.put(i,map.get(i) /   avgfinal); // math.abs kann auch fehlen    ka
        return rueckgabe;
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
            map.put(i,0);
        Random rd = new Random();
        for (int i = 0;i < 10;i++) {
            int zufall = rd.nextInt(10);
            map.replace(zufall,map.get(zufall)+1);
            System.out.print(zufall);
        }
        //System.out.println(map);
        System.out.println("Berechne durchschnittliche ..."+averageRelativeDeltaFromMean(map));



    }
}
