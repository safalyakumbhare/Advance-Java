import javax.swing.*;
class lebelhello extends JFrame
{
    JLabel abc;
    lebelhello()
    {
        abc=new JLabel("Lambu");
        abc.setBounds(100,100,1000,50);
        setVisible(true);
        setLayout(null);
        setSize(300,350);
        setTitle("PRAJAKTA");
         add(abc);
    }

    public static void main(String[] args) {
        lebelhello xyz=new lebelhello();
    }
}