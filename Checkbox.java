import javax.swing.*;
public class Checkbox extends JFrame {
    JCheckBox cb;
    Checkbox(){
        cb = new JCheckBox("Cricket");
        cb.setBounds(20,20,80,80);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("JCheckbox");
        add(cb);
    }
    public static void main(String[] args) {
        new Checkbox();
    }
    
}
