package Blatt7.Aufgabe3132;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class WhackNMoles extends JFrame {

    private JButton button;
    private int count;
    public WhackNMoles(int x){
        super("Whack" +x+ "Moles!");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(new GridLayout(0,3));
        for (int i = 0; i < x;i++){
            JButton button = new JButton("Button" +(i+1));
            add(button);
            button.addActionListener(e -> {
                button.setEnabled(false);
                count++;
                if(count == x){
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                    this.dispose();
                }
            });
        }
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        WhackNMoles a = new WhackNMoles(23);
    }
}

