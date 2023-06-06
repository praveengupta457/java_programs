import java.awt.*;
public class ui extends Frame{
     ui(){
        Button b=new Button("click here");
        b.setBounds(60,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("this is our awt class");
        setLayout(null);
        setVisible(true);
     }
    public static void main(String[] args) {
    ui u=new ui();
}
}