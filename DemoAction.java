import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoAction extends JFrame implements  ActionListener {
    JButton b;
    JLabel l;
    JTextField t;
    DemoAction(){
        b = new JButton("Click Me");
        l = new JLabel("Label");
        t = new JTextField(10);
        b.setBounds(80,80,100,20);
        l.setBounds(80,120,100,30);
        t.setBounds(80,30,100,20);
        
        b.addActionListener(this);
        
        setSize(300,300);
        setVisible(true);
        setLayout(null);

        
        add(b);
        add(l);
        add(t);


    }
    public void actionPerformed (ActionEvent e) {
        l.setText("Hello Label");
        t.setText("Hello TextField");
    }
    public static void main(String[] args) {
        new DemoAction();
    }
}
