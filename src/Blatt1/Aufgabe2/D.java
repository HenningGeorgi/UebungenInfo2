package Blatt1.Aufgabe2;

public class D {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Fehler");
        }

        StringBuilder str = new StringBuilder();
        for (String arg : args) {
            str.append(arg.replaceAll("STOP", ".")).append("\n");
        }
        System.out.print(str);
    }
}
