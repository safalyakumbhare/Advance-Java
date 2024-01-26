import javax.swing.*;
import java.awt.*;
public class InheritSwing extends JFrame {
    JLabel jl;
    InheritSwing(){
        jl = new JLabel("Hello Swing");
        jl.setBounds(100,100,80,80);
        setVisible(true);
        // setTitle(getTitle());
        setSize(400,400);
        setLayout(null);
        add(jl);
    }
    public static void main(String[] args) {
        new InheritSwing();
    }
    
}
