package EventHandling;
/* 5a. Check these two sample programs for event handling. Instead of applets frames are used. */

import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample2 extends Frame implements
MouseListener{
    MouseListenerExample2(){
        addMouseListener(this);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseEntered(MouseEvent e) {}//does nothing.
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public static void main(String[] args) {
        new MouseListenerExample2(); //does nothing
    }

}

