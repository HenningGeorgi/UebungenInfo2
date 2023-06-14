package Blatt7.Aufgabe3132;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;


public class TitleChanger extends JFrame {

    private JButton b1,b2,b3,b4;
    public TitleChanger(){
        super("TitleChanger");
        setSize(350,100);
        setLayout(new GridLayout(2,2));
        add(b1 = new JButton("Button 1"));
        add(b2 = new JButton("Button 2"));
        add(b3 = new JButton("Button 3"));
        add(b4 = new JButton("Button 4"));

        b1.addActionListener(e -> setTitle("Title changed by Button 1"));
        b2.addActionListener(e -> setTitle("Title changed by Button 2"));
        b3.addActionListener(e -> setTitle("Title changed by Button 3"));
        b4.addActionListener(e -> setTitle("Title changed by Button 4"));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        TitleChanger r = new TitleChanger();
    }

}
