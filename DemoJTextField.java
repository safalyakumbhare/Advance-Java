import javax.swing.*;
import java.awt.*;
class DemoJTextField extends JFrame
{
    JTextField t;
    JLabel l1, l2;
    JButton b;
    JTextArea ta;
    JCheckBox cb1, cb2;
    JRadioButton rb1, rb2;
    JList l;
    JComboBox cb;
    String week[]= { "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    JScrollPane p;

    DemoJTextField()
    {
		setLayout(new FlowLayout());
		t = new JTextField("Hello");
		l1 = new JLabel("First name");
		l2 = new JLabel("Address");
		ta = new JTextArea("bjhh",4,10);
		p = new JScrollPane(ta);

		b = new JButton("Hello");

        JLabel l3 = new JLabel("Hobby");
        cb1 = new JCheckBox("Cricket");
        cb2 = new JCheckBox("Chess");

        JLabel l4 = new JLabel("Gender");
        ButtonGroup bg = new ButtonGroup();
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        bg.add(rb1);
        bg.add(rb2);


		add(l1); add(t);
		add(l2); add(p);

		add(l3); add(cb1); add(cb2);
		add(l4); add(rb1); add(rb2);

	    l = new JList(week);

	    cb = new JComboBox();
	    cb.addItem("Nagpur");
	    cb.addItem("Mumbai");
	    cb.addItem("Pune");

	    add(l); add(cb);
		add(b);
		setVisible(true);
		setSize(300, 300);
    }
    public static void main(String s[])
    {
		DemoJTextField obj = new DemoJTextField();
    }
}