import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoAction extends JFrame implements ActionListener {
    JButton b;
    JLabel l;
    DemoAction() {
        b = new JButton("Click Me");
        l = new JLabel("Label");
        b.setBounds(80, 80, 100, 20);
        l.setBounds(80, 120, 100, 30);
        b.addActionListener(this);
        setSize(300, 300);
        setVisible(true);
        setLayout(null);
        add(b);
        add(l);
    }
    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked");
    }
    public static void main(String[] args) {
        new DemoAction();
    }
}
