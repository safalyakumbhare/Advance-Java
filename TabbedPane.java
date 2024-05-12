import javax.swing.*;
public class TabbedPane extends JFrame{
    TabbedPane() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("Tap 1", p1);
        tp.add("Tap 2", p2);
        tp.add("Tap 3", p3);
        add(tp);
        setTitle("Tabbed Pane");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPane();
    }
}
