package Blatt7.Aufgabe34;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MausHighligther extends JFrame implements MouseMotionListener {

    private int mouseX;
    private int mouseY;
    private int radius = 15;

    public MausHighligther() {
        super("Mouse Highlighter");
        addMouseMotionListener(this);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(mouseX - radius, mouseY - radius, 2 * radius, 2 * radius);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();}

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public static void main(String[] args) {
        MausHighligther h = new MausHighligther();
    }
}