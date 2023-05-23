package Blatt5.Aufgabe2324;

public class Student {
    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer) {

    }

    boolean checkName(String name) {
        if (name == null || name.length() == 0) return false;
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
        this.name = name;
    }

    public String getStudentString() {
        return "("+matrikelnummer+", "+name+")";
    }

    public void setMatrikelnummer(int matrikelnummer) {
        if (!checkMatrikelnummer(matrikelnummer)) {
            throw new IllegalArgumentException();
        }
        this.matrikelnummer = matrikelnummer;
    }
}
