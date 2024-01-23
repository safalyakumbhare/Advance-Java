import javax.swing.*;
public class DemoJFrame extends JFrame{
    JButton jb;
    DemoJFrame()
    {
        jb = new JButton("Click");
        add(jb); //add button to the frame
        // setLayout(null);
        setSize(400,400);
        setTitle("Demo JFrame");
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
        DemoJFrame DJ = new DemoJFrame();
    }
}
