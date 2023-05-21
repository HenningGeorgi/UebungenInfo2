package Blatt4.Aufgabe16;

import java.time.LocalDate;
import java.time.Period;

public class A {

    public static void main(String[] args) {
        LocalDate heute = LocalDate.now();
        LocalDate klausur = LocalDate.of(2023,8,1);
        Period spanne = Period.between(heute,klausur);
        System.out.println("Übrige Zeit: "+ spanne.getYears() + " Jahr " + spanne.getMonths() + " Monate "+spanne.getDays() + " Tage");
    }

}