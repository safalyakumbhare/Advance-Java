import java.awt.*;
import javax.swing.*;

/*<applet code="JAppletDemo.class" width="200" height="200"></applet> */
public class JAppletDemo extends JApplet {

    JButton b;
    JTextField tf;

    public void init() {
        tf = new JTextField();
        tf.setBounds(20, 40, 100, 20);

        b = new JButton("Click");
        b.setBounds(60, 100, 70, 40);

        add(b);
        add(tf);
        setLayout(null);
    }
}
