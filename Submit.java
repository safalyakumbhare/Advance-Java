import javax.swing.*;
public class Submit extends JFrame{
    JButton b;
    JLabel l;
    JTextField t;
    Submit()
    {
        b = new JButton("Submit");
        l=new JLabel("Enter Your Name");
        t=new JTextField(10);
        b.setBounds(150, 200, 80, 30);
        l.setBounds(130, 100, 150, 30);
        t.setBounds(90, 150, 200, 30);
        
        setTitle("Submit Form");
        setVisible(true);
        setSize(400,400);
        setLayout(null);
        add(l);
        add(t);
        add(b);

    }
    public static void main(String[] args) {
        new Submit();
    }    
}
