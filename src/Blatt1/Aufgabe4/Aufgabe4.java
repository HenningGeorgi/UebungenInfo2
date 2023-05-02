package Blatt1.Aufgabe4;

public class Aufgabe4 {
    public String longestPrefixWithoutRepetition(String wort) {
        String prefix = "";
        char ch;
        for (int i = 0; i < wort.length(); i++) {
            ch = wort.charAt(i);
            String temp = "" + ch;
            if (prefix.contains(temp)) {
                return prefix;
            } else {
                prefix = prefix + ch;
            }
        }
        return prefix;
    }

    public String reverseAllWords(String words) {

        String reversedAll = "";
        char ch;
        String[] kurz = words.split(" ");
        for(int i = 0; i < kurz.length; i++) {
            String reversed = "";
            for (int j = 0; j < kurz[i].length(); j++) {
                ch = kurz[i].charAt(j);
                reversed = ch + reversed;
            }
            reversedAll = reversedAll + reversed +  " ";
        }
        return reversedAll;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Fehler");
            System.exit(-1);
        }
        String words = "";
        for (int i = 0; i < args.length; i++) {
            words = words + args[i] + " ";
        }
        Aufgabe4 a = new Aufgabe4();
        for (int i = 1; i <= args.length; i++) {
            if(i % 2 == 1) {
                System.out.println(a.longestPrefixWithoutRepetition(args[i-1]));
            } else {
                System.out.println(a.reverseAllWords(args[i-1]));
            }
        }
    }
}
