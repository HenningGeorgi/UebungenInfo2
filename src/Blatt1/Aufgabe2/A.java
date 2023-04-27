package Blatt1.Aufgabe2;

public class A {
    public static void main(String[] args) {
        System.out.println("Anzahl der Komanndozeilenparameter: " + args.length);
        if (args.length > 1) {
            System.out.println("Das Zeichen 't' kommt " + charCount(args[1], 't') + " mal vor.");
        }
    }

    public static int charCount(String s, Character c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) counter++;
        }

        return counter;
    }
}
