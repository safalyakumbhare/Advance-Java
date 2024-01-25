import javax.swing.*;
public class SimpleSwing {
    public static void main(String args[]){
        JFrame jf = new JFrame();
        JLabel jb = new JLabel("Hello Swing");

        jf.setSize(400,400);
        jf.setTitle("Simple Swing");
        jf.setLayout(null);
        jb.setBounds(150, 150, 80, 60);
        jf.setVisible(true);
        jf.add(jb);
    }
    
}
