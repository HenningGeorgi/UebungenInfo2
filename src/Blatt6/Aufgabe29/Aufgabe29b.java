package Blatt6.Aufgabe29;


import javax.swing.*;
import java.awt.*;

public class Aufgabe29b extends JFrame {
    private JTextField oben;
    private JButton Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,Button10,clear,okay;
    public Aufgabe29b(){
        super("PIN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new BorderLayout());
        oben = new JTextField();
        oben.setEditable(false);
        add(oben, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));
        panel.add(Button1 = new JButton("7"));
        panel.add(Button2 = new JButton("8"));
        panel.add(Button3 = new JButton("9"));
        panel.add(Button4 = new JButton("4"));
        panel.add(Button5 = new JButton("5"));
        panel.add(Button6 = new JButton("6"));
        panel.add(Button7 = new JButton("1"));
        panel.add(Button8 = new JButton("2"));
        panel.add(Button9 = new JButton("3"));
        panel.add(Button10 = new JButton("0"));
        panel.add(clear = new JButton("clear"));
        panel.add(okay = new JButton("okay"));
        add(panel,BorderLayout.SOUTH);
        pack();
        setVisible(true);

    }
}
