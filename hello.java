import javax.swing.*;
class hello extends JFrame{

    JButton b;

    hello(){

        b = new JButton("Click");

        b.setBounds(100,100,80,40);

        setVisible(true);
        setLayout(null);
        setSize(400, 300);
        add(b);
    }

    public static void main(String[] args) {
        new hello();
    }


}