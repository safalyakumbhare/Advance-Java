import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Example {
	JFrame f;

	Example()
    {
f = new JFrame();
	DefaultMutableTreeNode country = new DefaultMutableTreeNode("India");
	DefaultMutableTreeNode state = new DefaultMutableTreeNode("States");
	country.add(state);
	DefaultMutableTreeNode wb = new DefaultMutableTreeNode("West Bengal");
	DefaultMutableTreeNode del = new DefaultMutableTreeNode("Delhi");
	DefaultMutableTreeNode ap = new DefaultMutableTreeNode("Andhra Pradesh");
	DefaultMutableTreeNode tn = new DefaultMutableTreeNode("Tamil Nadu");
	
	state.add(wb);
	state.add(del);
	state.add(ap);
	state.add(tn);
	JTree jt = new JTree(country);
	f.add(jt);
	f.setSize(200,200);
	f.setVisible(true);
    }

	public static void main(String[] args) {
		new Example();
	}
}
