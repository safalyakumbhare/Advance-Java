import javax.swing.*;
public class DemoJFrame extends JFrame{
    DemoJFrame()
    {
        JButton jb = new JButton("Click");
        add(jb); //add button to the frame
        // setLayout(null);
        setSize(400,400);
        setVisible(true);
        setTitle("Demo JFrame");
    }
    public static void main(String[] args) {
        DemoJFrame DJ = new DemoJFrame();
    }
}
