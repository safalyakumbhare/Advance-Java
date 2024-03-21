import javax.swing.*;
class login extends  JFrame{

    JLabel l;
    JTextField t;
    JButton b;

    login()
    {
        l = new JLabel("Enter  Username");
        t=new JTextField();
        b =  new JButton("Login");

        l.setBounds(50, 100, 100, 30);
        t.setBounds(180,100,100,30);
        b.setBounds(120, 150, 100, 30);

        setVisible(true);
        setSize(400,400);
        setLayout(null);
        setTitle("Login Form");
        add(l);
        add(t);
        add(b);

    }
    public static void main(String[] args) {
        new login();
    }
}