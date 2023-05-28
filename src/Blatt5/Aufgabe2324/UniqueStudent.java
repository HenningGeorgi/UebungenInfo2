package Blatt5.Aufgabe2324;

import java.util.HashMap;

public class UniqueStudent extends Student {
    private static HashMap<Integer, UniqueStudent> students = new HashMap<>();

    public UniqueStudent(String name, int matrikelnummer) throws DuplicateException {
        super(name, matrikelnummer);
        if (students.containsKey(matrikelnummer)) throw new DuplicateException("Matrikelnummer", String.valueOf(matrikelnummer));
    }

    public static UniqueStudent findUniqueStudent(int matrikelnummer) {
        return students.getOrDefault(matrikelnummer, null);
    }
}
