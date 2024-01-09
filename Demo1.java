import java.awt.*;
import javax.swing.*;
class Demo1 extends JFrame {
    JTextField t;
    JButton b;
    Demo1()
    {
        // Container c = getContentPane();
        t = new JTextField();
        b = new JButton();
        add(t);
        add(b);
        setVisible(true);
        setSize(50, 50);
    }
    public static void main(String str[]) {
        Demo1 obj = new Demo1();
    }
}