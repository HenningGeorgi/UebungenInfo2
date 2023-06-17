package Blatt7.Aufgabe34;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class LinePanel extends JPanel implements MouseListener, MouseMotionListener {
    private ArrayList<Point> points;

    public LinePanel() {
        points = new ArrayList<>();
        setPreferredSize(new Dimension(300,300));
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        points.add(new Point(x, y));
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        points.add(new Point(x, y));
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        Point aktuel = e.getPoint();
        points.remove(points.size()-1);
        points.add(aktuel);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(points.size() > 0){
            Point davor = points.get(points.size()-1);
            Point aktuel = getMousePosition();
            if(aktuel != null){
                g.drawLine(davor.x,davor.y,aktuel.x,aktuel.y);
            }
        }
        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            g.fillOval(p.x - 2, p.y - 2, 4, 4);
        }

        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}

