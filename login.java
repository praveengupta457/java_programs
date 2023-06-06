import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
class page extends JFrame implements ActionListener{
    JTextField jt,jt1,jtt;
    JButton btn;
    
    page(){
     JLabel jl= new JLabel("numbr 1");
     JLabel jl1= new JLabel("number 2");
     jt=new JTextField(10);
     jt1= new JTextField(10);
     JLabel result = new JLabel("Result");

    jtt= new JTextField(10);
    btn= new JButton("ok");
    add(jl);
    add(jt);
    add(jl1);
    add(jt1);
    add(btn);
    add(result);
    add(jtt);
    btn.addActionListener((ActionListener) this);

      setVisible(true);
      setSize(400,400);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed( ActionEvent ae){
        // int num1=Integer.parseInt(jt.getText());

        // int num2=Integer.parseInt(jt1.getText());
        // int value=num1+num2;
        // jtt.setText(value+" ");
     String str=jt.getText();
    String str1=jt1.getText();
    String value=str+str1;
    jtt.setText(value); 
    }
}
public class login{
    public static void main(String[] args) {
        new page();
    }
}