package Blatt5.Aufgabe2324;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class A23_24b_main {
    public static void main(String[] args) {
        Student student = new Student("Henning", 2188889);
        student.ausgabe();
        Scanner input = new Scanner(System.in);
        input.useDelimiter(Pattern.compile("[\\r\\n]+"));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        try {
            while (true) {
                System.out.println("Neuen Studenten hinzufügen");
                System.out.print("Name:");
                String name = input.next();
                System.out.print("Matrikelnummer:");
                int matrikelnummer = input.nextInt();
                students.add(new Student(name, matrikelnummer));
            }
        } catch (Exception e) {
            System.out.println("Ungueltige Eingabe");
        }
        students.forEach(Student::ausgabe);
    }
}