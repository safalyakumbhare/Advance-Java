import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeDrawer extends JFrame {
    private JPanel drawArea;

    public ShapeDrawer() {
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menu
        JMenu menu = new JMenu("Shapes");
        menuBar.add(menu);

        // Create menu items and add to menu
        JMenuItem rectangleItem = new JMenuItem("Rectangle");
        menu.add(rectangleItem);
        JMenuItem ovalItem = new JMenuItem("Oval");
        menu.add(ovalItem);

        // Add action listeners to menu items
        rectangleItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawArea.getGraphics().drawRect(50, 50, 100, 50);
            }
        });

        ovalItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawArea.getGraphics().drawOval(50, 50, 100, 50);
            }
        });

        // Create draw area
        drawArea = new JPanel();
        add(drawArea, BorderLayout.CENTER);

        // Set menu bar
        setJMenuBar(menuBar);

        // Set frame attributes
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}
