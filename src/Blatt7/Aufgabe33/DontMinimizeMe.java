package Blatt7.Aufgabe33;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class DontMinimizeMe extends JFrame implements WindowStateListener {
    private JButton button;
    private int count;
    public DontMinimizeMe(){
        super("Don't minimize me!");
        setSize(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0,3));
        addWindowStateListener(this);
        setVisible(true);
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        if (e.getNewState() == ICONIFIED) {
            button = new JButton("Ouch");
            add(button);
            count++;
            setVisible(true);
        }
        if(e.getNewState() == NORMAL){
            if(count >= 3 && count <7)
                setTitle("Stop iconifying me");
            if(count > 6)
                setTitle("Dude, seriously, stop");
        }
    }

    public static void main(String[] args) {
        DontMinimizeMe n = new DontMinimizeMe();
    }
}
