import javax.swing.*;
import java.awt.*;
public class Submit extends JFrame{
    JButton b;
    JLabel l;
    JTextField t;
    Submit()
    {
        b = new JButton("Submit");
        l=new JLabel("Enter Your Name");
        t=new JTextField(10);
        b.setBounds(50, 50, 80, 30);
        l.setBounds(130, 100, 150, 30);
        t.setBounds(80, 80, 200, 30);
        

        setVisible(true);
        setSize(400,400);
        setLayout(null);
        add(l);

    }
    public static void main(String[] args) {
        new Submit();
    }    
}
