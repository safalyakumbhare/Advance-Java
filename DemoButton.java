import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;
class DemoButton extends JFrame implements ActionListener{
    JButton b;
    JTextField t;
    DemoButton()
    {
        setLayout(new FlowLayout());
        setTitle("ActionEvent Demo");
        b = new JButton("Click Me");
        t = new JTextField(20);
        add(t);
        add(b);
        b.addActionListener(this);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        t.setText("Hello");
    }
    public static void main(String[] args) {
        DemoButton b = new DemoButton();
    }
    
}
