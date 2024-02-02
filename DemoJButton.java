import javax.swing.*;

public class DemoJButton extends JFrame {
    JButton b;

    public DemoJButton() {
        b = new JButton("Click Me");
        b.setBounds(81, 90, 100, 30);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        add(b);
    }

    public static void main(String[] args) {
        new DemoJButton();
    }
}
