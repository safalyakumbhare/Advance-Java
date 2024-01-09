import java.awt.*;
class Demo2 extends Frame{

    TextField t;
    Button b;
    Demo2()
    {
        t = new TextField();
        b = new Button("Click");
        add(t);
        add(b);
        setVisible(true);
        setSize(100, 100);
    }
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
    }
}
