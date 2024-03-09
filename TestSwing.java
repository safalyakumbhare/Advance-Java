import javax.swing.*;
public class TestSwing extends JFrame {

    JButton b;
    JTextField t;

    TestSwing()
    {
        b = new JButton("Submit");
        t = new JTextField(10);

        b.setBounds(81,81,80,23); // x y w
        t.setBounds(80, 50, 100, 20);
        setSize(250,250);
        setLayout(null);
        setVisible(true);
        add(b);
        add(t);

    }
    public static void main(String[] args) {
        new TestSwing();
    }
    
}
