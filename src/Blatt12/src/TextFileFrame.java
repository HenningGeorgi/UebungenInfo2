package Blatt12.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFileFrame extends JFrame implements ActionListener {
    private String filename = "output.txt";
    private PrintWriter writer;
    private JTextField textField;

    public TextFileFrame() {
        super("Text file frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField = new JTextField(40);
        add(textField, BorderLayout.WEST);
        JButton writeButton = new JButton("Write to file");
        writeButton.addActionListener(this);
        add(writeButton, BorderLayout.EAST);
        try {
            writer = new PrintWriter(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                writer.close();
            }
        });
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        writer.println(textField.getText());
    }

    public static void main(String[] args) {
        new TextFileFrame();
    }
}
