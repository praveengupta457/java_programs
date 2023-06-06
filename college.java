import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class regn extends JFrame implements ActionListener{
    JButton btn;
    JTextField name1,std1,area1,gender1;
         regn(){
    JFrame frame=new JFrame("EVENT FORM");
        frame.setVisible(true);
        frame.setLayout(null);
      frame.setSize(600,600);


        JLabel name=new  JLabel("Name");
        name.setBounds(40,20,100,20);
        frame.add(name);

        JTextField name1=new JTextField("");
        frame.add(name1);
            name1 .setBounds(160,20,100,20);

         JLabel std=new JLabel("Class");
         std.setBounds(40,50,100,20);
         frame.add(std);

         JTextField std1=new JTextField();
         frame.add(std1);
              std1.setBounds(160,50,100,20);

              JLabel gender=new JLabel("Gender");
         gender.setBounds(40,80,100,20);
         frame.add(gender);
         JTextField gender1=new JTextField("");
         frame.add(gender1);
              gender1.setBounds(160,80,100,20);


         JLabel area=new JLabel("Area of interest");
         area.setBounds(40,110,100,20);
         frame.add(area);
         JTextField area1 =new JTextField("");
         frame.add(area1);
              area1.setBounds(160,110,100,20);

         JButton btn=new JButton("register");
         btn.setBounds(140,140,100,20);
         frame.add(btn);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         btn.addActionListener(this);
         }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn){

                int x=0;
                String s1= name1.getText();
                String s2=  std1 .getText();
                String s3=  gender1 .getText();
                String s4=   area1.getText();
                
                try{
                   Class.forName("com.jdbc.myssql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
                PreparedStatement ps=con.prepareStatement("inseet into details(?,?,?,?)");
                ps.setString(1,s1);
                ps.setString(2,s2);
                ps.setString(3,s3);
                ps.setString(4,s4);
                ResultSet rs=ps.executeQuery();
                x++;
                if(x>0){

                JOptionPane.showMessageDialog(btn,"Data Registered Successfully");
                con.close();
             }
            }
             catch(SQLException e1){
                System.out.println(e1);
             }
            }
             else{
                JOptionPane.showMessageDialog(btn,"Data didnt register");
             
            }
        }
        
        }
    
public class college {
    public static void main(String[] args) {
        new regn();
    }
}
