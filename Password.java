import javax.swing.*;
public class Password extends JFrame{
    JPasswordField p;
    JLabel l;
    Password()
    {
        p = new JPasswordField("Admin");
        l = new JLabel("Password");
        l.setBounds(20, 50, 80, 80);
        p.setBounds(20, 120, 80, 20);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("JPassword");
        add(l);
        add(p);
    }
    public static void main(String[] args) {
        new Password();
    }
}
