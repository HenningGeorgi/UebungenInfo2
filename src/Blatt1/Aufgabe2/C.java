package Blatt1.Aufgabe2;

public class C {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Fehler");
            System.exit(0);
        }

        String upperCaseString = args[0].toUpperCase();
        int lastAIndex = upperCaseString.lastIndexOf("A");
        String suffix = upperCaseString.substring(lastAIndex);
        System.out.println(suffix);
    }
}
