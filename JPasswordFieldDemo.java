import javax.swing.*;

public class JPasswordFieldDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 50, 80, 30);
        value.setBounds(20, 100, 80, 30);
        f.add(value);
        f.add(l1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}