import javax.swing.*;
class DemoJLabel extends JFrame{
    JLabel l;
    DemoJLabel()
    {
        l = new JLabel("Hello Swing");
        l.setBounds(100, 90, 100, 30);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        add(l);

    }
    public static void main(String[] args) {
        new DemoJLabel();
    }
}
