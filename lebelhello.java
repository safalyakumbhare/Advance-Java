import javax.swing.*;

class labelhello extends JFrame {
    JLabel l;

    labelhello() {
        l = new JLabel("Hello Java GUI");
        l.setBounds(100, 0, 250, 30);
        setVisible(true);
        setSize(300, 300);
        setLayout(null);

        add(l);
    }
    public static void main(String[] args) {
        labelhello obj = new labelhello();
    }
}