import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.*;

public class tsetJscroll {

    GridLayout grid;

    tsetJscroll(){
        JFrame jf=new JFrame("Test jscrollpane");
        JPanel jp=new JPanel(grid=new GridLayout(3,2,5,5));
        jf.add(jp);
        for(int i=1;i<=205;i++){
        JButton btn=new JButton(String.valueOf(i)); 
        jp.add(btn);

        }
        JScrollPane jsp=new JScrollPane(jp);
        jf.setContentPane(jsp);

        jf.setSize(150,100);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new tsetJscroll();
    }
    
}
