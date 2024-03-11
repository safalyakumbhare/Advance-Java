import java.applet.Applet;  
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAppletDemo extends Applet implements ActionListener {  
    TextField tf;  
    Button b;  
  
     JAppletDemo(){  
        tf = new TextField();  
        tf.setBounds(30,40,150,20);  
      
        b = new Button("Click");  
        b.setBounds(80,150,60,50);  
      
        add(b);  
        add(tf);  
        b.addActionListener(this);  
      
        setLayout(null);  
    }  
  
    public void actionPerformed(ActionEvent e){  
        tf.setText("Welcome");  
    }
    public static void main(String[] args) {
        new JAppletDemo();

    }  
}  
