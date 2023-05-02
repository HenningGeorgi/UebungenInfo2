package Blatt1.Aufgabe2;

public class D {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Fehler");
            System.exit(-1);
        }

        String str = new String();
        for (String arg : args) {
            if(arg.compareTo("STOP") == 0) {
                str += ". ";
            } else {
                str = str + arg + " ";
            }
        }
        System.out.print(str + "\n");
    }
}
