import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class A implements ActionListener {
    private static final String EXIT_ON_CLOSE = null;
    JFrame jf;
    JTextField jt,jt1;
    JButton btn;
    A(){
        jf=new JFrame();
        jt=new JTextField();
        jt.setBounds(40,40 ,80,20);
        jt1=new JTextField();
        jt1.setBounds(40,70,150,20);
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setLayout(null);
        //.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn=new JButton("ok");
        btn.setBounds(40,100,60,30);
        btn.addActionListener( this);
        jf.add(jt);
        jf.add(jt1);
        jf.add(btn);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String str=jt.getText();
        jt1.setText(str+"");
        
    }
}

public class normal {
    public static void main(String[] args) {
        new A();
    }
}
