import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventDemo extends JFrame implements ActionListener {

    private JLabel l;

    public ActionEventDemo() {
        setTitle("Action Event Demo");
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        JButton b = new JButton("Click Me!");
        b.addActionListener(this);
        add(b);
        b.setBounds(50,50,200,50);
        l.setBounds(50,10,200,50);
        l = new JLabel("No action yet");
        add(l);
        
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}
