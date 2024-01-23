import javax.swing.*;
public class SimpleSwing {
    public static void main(String args[]){
        JFrame jf = new JFrame();
        JButton jb = new JButton("Click");

        jf.setSize(300,300);
        jf.setTitle("Simple Swing");
        jf.setLayout(null);
        jb.setBounds(100, 120, 80, 60);
        jf.setVisible(true);
        jf.add(jb);
        // jf.add(jf);
    }
    
}
