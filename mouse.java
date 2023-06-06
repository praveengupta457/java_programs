import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class mouse {
    mouse(){
       final JFrame jf=new JFrame("popup");
       final JLabel jl=new JLabel();
        jl.setBounds(40,40,100,100);
        JPopupMenu pop=new JPopupMenu("edit");
        JMenuItem cut= new JMenuItem("cut");
        JMenuItem paste= new JMenuItem("paste");
        JMenuItem copy= new JMenuItem("copy");
        pop.add(cut);pop.add(copy);pop.add(paste);
        jf.add(pop);
       //jf.setDefaultCloseOperation(true);
       jf.setVisible(true);
       jf.setLayout(null);
       jf.setSize(400,400);
       jf.addMouseListener (new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
          pop.show(jf,e.getX(),e.getY());
        }
       });
        
    }
    public static void main(String[] args) {
        new mouse();
    }
}
