package Blatt6.Aufgabe29;


import javax.swing.*;
import java.awt.*;

public class Aufgabe29a extends JFrame {
    public Aufgabe29a(){
        super("Aufgabe29a");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.LIGHT_GRAY);
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel accountNumberLabel = new JLabel("Kontonummer");
        accountNumberLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        northPanel.add(accountNumberLabel);
        JTextField accountNumberTextField = new JTextField(20);
        accountNumberTextField.setFont(new Font("Arial", Font.PLAIN, 20));
        northPanel.add(accountNumberTextField);
        add(northPanel, BorderLayout.NORTH);

        // Create the south panel with the Ok and Cancel buttons
        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.GRAY);
        southPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton okButton = new JButton("Okay");
        southPanel.add(okButton);
        JButton cancelButton = new JButton("Abbrechen  ");
        southPanel.add(cancelButton);
        add(southPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
}
