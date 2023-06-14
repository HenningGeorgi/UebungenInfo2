package Blatt7.Aufgabe33;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyCounter extends JFrame implements KeyListener {
    private int count;

    public KeyCounter() {
        super("KeyCounter: 0");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        addKeyListener(this);
        setVisible(true);

    }


    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        if (key == 'p' && !(e.isShiftDown())){
            count++;
            setTitle("KeyCounter: "+count);
        }
        if(e.getKeyCode() == KeyEvent.VK_P && e.isShiftDown()) {
            count+=10;
            setTitle("keyCounter: "+count);
        }
    }

    @Override
    public void keyTyped (KeyEvent e){
    }

    @Override
    public void keyReleased (KeyEvent e){}

    public static void main(String[] args) {
        KeyCounter sac = new KeyCounter();
    }
}

