package Blatt7.Aufgabe3132;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;


public class LabelCreator extends JFrame {

    private JPanel panel;
    private JButton button;
    public LabelCreator(){
        super("Label Creator");
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(panel = new JPanel(),BorderLayout.CENTER);
        button = new JButton("Add new label");
        button.addActionListener(new LabelCreatorListener(panel));
        add(button,BorderLayout.SOUTH);
        setVisible(true);

    }

    public static void main(String[] args) {
        LabelCreator e = new LabelCreator();
    }
}
