package Blatt1.Aufgabe1;

class A {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int n = 1; n <= i; i++) {
                if (i % n == 0) {
                    System.out.print(i+", ");
                }
            }
            System.out.print('\n');
        }
    }
}
