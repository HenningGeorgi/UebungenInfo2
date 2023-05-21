package Blatt4.Aufgabe16;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;


public class C {
    public static LocalTime zufallszeit(){
        Random random = new Random();
        LocalTime time = LocalTime.of(random.nextInt(24), random.nextInt(60));
        return time;
    }

    public static void main(String[] args) {
        LocalTime a = zufallszeit();
        LocalTime b = zufallszeit();
        LocalTime t1,t2;
        if(a.isBefore(b) == true){
            t1 = a;
            t2 = b;
        } else {
            t1 = b;
            t2 = a;
        }
        System.out.println("Zufallszeiten sortiert: "+t1+"\t"+t2);

        int temp = 0;
        while((temp = (int) t1.until(t2, ChronoUnit.MINUTES)) > 15){
            LocalTime neu = zufallszeit();
            //System.out.println("alle versuche ist: " + neu);
            if((neu.isBefore(t2) == true && neu.isAfter(t1) == true)){
                t2 = neu;
                System.out.println("Neues t2 ist: " + t2);
            }
        }
        System.out.println("Am Ende \n1.Zeit: "+t1+"\n"+"2.Zeit: "+t2);
    }
}
