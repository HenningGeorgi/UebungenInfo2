package Blatt1.Aufgabe1;

public class C {
    public static void main(String[] args) {
        int lineCount = 1;
        int c = 1;
        for (int i = 1; i <= 500; i++) {
            System.out.print("j");
            c++;
            if(c % (lineCount * 5) == 0) {
                System.out.println();
                lineCount++;
                c = 1;
            }
        }
    }
}