import javax.swing.*;
public class InheritSwing extends JFrame {
    JLabel jl;
    InheritSwing(){
        jl = new JLabel("Hello Swing");
        jl.setBounds(150,100,80,80);
        setVisible(true);
        setSize(400,400);
        setLayout(null);
        add(jl);
    }
    public static void main(String[] args) {
        new InheritSwing();
    }
    
}
