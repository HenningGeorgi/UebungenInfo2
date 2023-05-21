package Blatt4.Aufgabe16;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class B {

    public static void main(String[] args) {
        LocalDate aktuelle = LocalDate.now();
        int tage = aktuelle.lengthOfMonth()-aktuelle.getDayOfMonth();
        System.out.println("Bis Monatsende: "+(tage));
        int countSa = 0;
        int countSo = 0;
        for (int i = 0;i < tage;i++){
            DayOfWeek z = aktuelle.plusDays(i).getDayOfWeek();
            if(z == DayOfWeek.SATURDAY)
                countSa++;
            if(z == DayOfWeek.SUNDAY)
                countSo++;
        }
        System.out.println("Anzahl der Samstage noch: " + countSa);
        System.out.println("Anzahl der Sonntage noch: " + countSo);
    }
}