package Blatt7.Aufgabe34;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class LineFrame extends JFrame {
    public LineFrame() {
        super("Line Frame");
        LinePanel linePanel = new LinePanel();
        add(linePanel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        LineFrame lineFrame = new LineFrame();
    }
}
