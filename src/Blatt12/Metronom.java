package Blatt12;

public class Metronom extends Thread {
    private final int x;
    public Metronom(int x) {
        if (x <= 0)
            throw new IllegalArgumentException("x muss eine natürliche Zahl sein");
        this.x = x;
    }

    public void run() {
        int n = 1;
        while (!this.isInterrupted() && x >= n) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(n++);
        }
    }

    public static void main(String[] args) {
        Metronom m = new Metronom(5);
        m.start();
    }
}
