package Blatt5.Aufgabe2324;

public class DuplicateException extends Exception {
    public DuplicateException(String attribute, String value) {
        super(attribute + " already taken: " + value);
    }
}
