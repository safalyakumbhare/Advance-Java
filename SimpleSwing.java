import javax.swing.*;
public class SimpleSwing {
    public static void main(String args[]){
        JFrame jf = new JFrame();
        JLabel jl = new JLabel("Hello Swing");

        jf.setSize(400,400);
        jf.setTitle("Simple Swing");
        jf.setLayout(null);
        jl.setBounds(150, 150, 80, 60);
        jf.setVisible(true);
        jf.add(jl);
    }
    
}
