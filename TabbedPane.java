import javax.swing.*;

public class TabbedPane {
    JFrame f;

    TabbedPane() {
        f = new JFrame();
        JTextArea ta = new JTextArea(50, 50);
        JPanel p1 = new JPanel();
        p1.add(ta);

        JPanel p2 = new JPanel();
        JButton b1 = new JButton("Click");
        p2.add(b1);

        JPanel p3 = new JPanel();
        JComboBox cb = new JComboBox();
        p3.add(cb);

        JTabbedPane tp = new JTabbedPane();

        tp.setBounds(50, 50, 200, 200);
        tp.add("main", p1);
        tp.add("visit", p2);
        tp.add("help", p3);
        f.add(tp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPane();
    }
}