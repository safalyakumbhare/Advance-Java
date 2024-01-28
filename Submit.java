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
        b.setBounds(150, 100, 80, 30);
        

        setVisible(true);
        setSize(400,400);
        setLayout(null);
        add(b);

    }
    public static void main(String[] args) {
        new Submit();
    }    
}
