package Blatt7.Aufgabe33;

import javax.swing.JOptionPane;

public class CountDown {

    public CountDown() {
        int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Bitte eine natürliche Zahl eingeben"));
        for (int i = eingabe; i > 0; i--){
            JOptionPane.showMessageDialog(null,"CountDown: " +i);
        }
    }

    public static void main(String[] args) {
        CountDown c = new CountDown();
    }
}
