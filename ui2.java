import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import javax.swing.JComboBox;
import javax.swing.JFrame;
//import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.applet.*;
import javax.swing.JLabel;
public class ui2 implements ActionListener{
    List ll;
    JTextField ta;
   // private static final String EXIT_ON_CLOSE = null;
    ui2(){
         JFrame f=new JFrame();
         Label l=new Label ("employee id:");
         Button b=new Button("submit");
         TextField t=new TextField("enter your text");
         String gender[]={"select gender","male","female"};
         l.setBounds(20,80,80,30);
         f.setSize(200,200);
         t.setBounds(20,100,80,30);
         b.setBounds(100,100,70,25);
         Choice c= new Choice();
         c.addItem("fruits you like");
         c.addItem("apples");
         c.addItem("grapes");
         c.addItem("guava");
         c.addItem("blackberry");
         c.setBounds(50,50,100,100);
         JTextField ta=new JTextField();
         ta.setBounds(80,60,100,120);
         //c.addActionListener(this);
         List ll=new List();
              ll.add("one");
              ll.add("two");
              ll.add("three");
              ll.add("four");
              ll.setBounds(100,100,100,100);
             ll.addActionListener(this);
         JLabel jl= new JLabel("gender");
         CheckboxGroup ch= new CheckboxGroup();
          Checkbox ch1= new Checkbox("male",ch,true);
          Checkbox ch2= new Checkbox("female",ch,false);
          //TextField tff= new TextField();
         f.setTitle("first page");
         f.setLayout(new FlowLayout());
         JComboBox cb=new JComboBox(gender);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setVisible(true);
         f.add(l);
         f.add(t);
         f.add(c);
         f.add(jl);
         f.add(ch2);
         f.add(ch1);
         f.add(cb);
         f.add(ll);
         f.add(b);
         f.add(ta);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==ll){
        ta.setText("list item is selected");
        }

    }
public static void main(String[] args) {
    ui2 ui=new ui2();
}
}

//frame.