package Blatt5.Aufgabe2324;

import java.util.ArrayList;

public class Student {
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {
        setName(name);
        setMatrikelnummer(matrikelnummer);
    }

    boolean checkName(String name) {
        if (name == null || name.trim().length() == 0) return false;
        return name.matches("\\p{Upper}.*");
    }

    boolean checkMatrikelnummer(int matrikelnummer) {
        return Integer.toString(matrikelnummer).matches("\\d{7}");
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setName(String name) {
        if (!checkName(name)) {
            throw new IllegalArgumentException();
        }
        this.name = name.trim();
    }

    public void setMatrikelnummer(int matrikelnummer) {
        if (!checkMatrikelnummer(matrikelnummer)) {
            throw new IllegalArgumentException();
        }
        this.matrikelnummer = matrikelnummer;
    }

    public void ausgabe() {
        System.out.println("(" + getMatrikelnummer() + ", " + getName() + ")");
    }
}
