import javax.swing.*;

class textfield extends JFrame {
    JTextField xyz;

    textfield() {
        xyz = new JTextField();
        xyz.setBounds(100, 100, 400, 50);
        setVisible(true);
        setLayout(null);
        setSize(400, 400);
        setTitle("ram");
        add(xyz);

    }
    public static void main(String[] args) {
        textfield add=new textfield();
    }
}