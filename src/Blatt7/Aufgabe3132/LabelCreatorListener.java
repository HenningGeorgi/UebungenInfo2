package Blatt7.Aufgabe3132;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class LabelCreatorListener implements ActionListener {

    private JPanel panel;
    private JLabel label;
    private Color color;
    public LabelCreatorListener(JPanel panel) {
        this.panel = panel;
    }
    public void actionPerformed(ActionEvent e) {
        label = new JLabel(LocalTime.now().format(DateTimeFormatter
                .ofPattern("HH:mm:ss")));
        Random obj = new Random();
        int rand_num = obj.nextInt(0xffffff + 1);
        label.setForeground(color = new Color(rand_num));
        panel.add(label);
        panel.revalidate();
    }
}



