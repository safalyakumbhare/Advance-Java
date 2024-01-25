import javax.swing.*;
public class ConSwing {
    JFrame jf;
    ConSwing(){
        jf = new JFrame();
        JButton jb = new JButton("Click");
        jb.setBounds(100,100,81,91);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.add(jb);

    }
    public static void main(String[] args) {
        ConSwing cs = new ConSwing();
    }
}
