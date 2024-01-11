import java.awt.Color;  
import java.awt.Graphics;  
import javax.swing.JComponent;  
import javax.swing.JFrame;  

class MyJComponent extends JComponent 
{  
      public void paint(Graphics g) 
      {  
        g.setColor(Color.green);  
        g.fillRect(30, 30, 100, 100);  
      }  
}  
public class Jcom 
{  
      public static void main(String[] arguments) 
      {  
        MyJComponent com = new MyJComponent();    
        JFrame frame = new JFrame("JComponent Example");  
        frame.setSize(300,200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.add(com);          // add the JComponent to main frame  
        frame.setVisible(true);  
      }  
}
