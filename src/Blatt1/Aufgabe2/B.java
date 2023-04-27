package Blatt1.Aufgabe2;

public class B {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.err.println("Fehler");
            System.exit(0);
        }

        int sum = 0;
        for (String arg : args) {
            sum += arg.length();
        }
        int mean = sum/args.length;
        System.out.println("Durchschnittslänge aller Kommandozeilenparameter: " + mean);
    }
}
