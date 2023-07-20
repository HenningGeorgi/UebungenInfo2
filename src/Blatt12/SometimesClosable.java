package Blatt12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SometimesClosable extends JFrame implements ActionListener, Runnable {
    private static Thread t;
    private final JButton closeButton = new JButton("Close");
    private boolean enabled = false;

    public SometimesClosable() {
        super("Try to close me!");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        closeButton.addActionListener(this);
        add(closeButton, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    @Override
    public void run() {
        while (!t.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                t.interrupt();
            }
            closeButton.setEnabled(enabled);
            enabled = !enabled;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        onClose();
    }

    private void onClose() {
        dispose();
        System.exit(0);
    }

    public static void main(String[] args) {
        SometimesClosable s = new SometimesClosable();
        t = new Thread(s);
        t.start();
    }
}
