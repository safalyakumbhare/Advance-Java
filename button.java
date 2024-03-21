import javax.swing.*;
class button extends JFrame
{
    JButton pqr;
    button()
    {
        pqr=new JButton("Hello User");
        pqr.setBounds (100,100,200,300);
        setVisible(true);
        setLayout(null);
        setSize(300,200);
        setTitle("VMV");
    add(pqr);
    }
    public static void main(String[] args) {
        textfield pqr=new textfield();
    }
    
}
