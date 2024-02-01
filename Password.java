import javax.swing.*;
public class Password extends JFrame{
    JPasswordField p;
    JLabel l;
    JButton b;
    Password()
    {
        b = new JButton("Login");
        p = new JPasswordField("Admin");
        l = new JLabel("Password");
        b.setBounds(20,160 , 80, 20);
        l.setBounds(20, 50, 80, 80);
        p.setBounds(20, 120, 100, 20);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("JPassword");
        add(l);
        add(p);
        add(b);
    }
    public static void main(String[] args) {
        new Password();
    }
}
