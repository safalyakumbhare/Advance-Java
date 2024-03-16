import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class MouseListenerExample extends Frame implements MouseListener, MouseMotionListener {
    JLabel l;

    MouseListenerExample() {
        addMouseListener(this);
        addMouseMotionListener(this);

        l = new JLabel();
        l.setBounds(20, 50, 200, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // MouseListeners methods
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Dab Gaya");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Aaya");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Gaya Khatam Bye Bye");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Daba Hua Hai");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Drag krke Choda");
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Drag hora hai");
    }

    // MouseMotionListener methods
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Hilaya");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
