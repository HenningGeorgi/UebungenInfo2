package Blatt5.Aufgabe2324;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;



public class A23_24d_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(Pattern.compile("[\\r\\n]+"));
        ArrayList<UniqueStudent> uniqueStudents = new ArrayList<>();
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Name: ");
                String name = input.next();
                System.out.println("Matrikelnummer: ");
                int matrikelnummer = input.nextInt();
                try {
                    uniqueStudents.add(new UniqueStudent(name, matrikelnummer));
                } catch (DuplicateException e) {
                    System.err.println("Ein Student mit dieser Matrikelnummer ist bereits vorhanden");
                }
            }
        } catch (Exception e) {
            System.err.println("Ungueltige Eingabe");
        }

        System.out.println("Geben Sie eine Matrikelnummer ein: ");
        int searchMatrikelnummer = input.nextInt();
        UniqueStudent foundStudent = UniqueStudent.findUniqueStudent(searchMatrikelnummer);
        if(uniqueStudents.size() > 0) System.out.println("Student " + foundStudent.getName() + " mit der Matrikelnummer " + foundStudent.getMatrikelnummer() + " wurde gefunden.");
        input.close();
    }
}
