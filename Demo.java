import javax.swing.*;
import java.awt.*;
public class Demo extends JFrame {
    JLabel l;
    Demo(){
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        l = new JLabel("Hello");
        add(l);
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}
