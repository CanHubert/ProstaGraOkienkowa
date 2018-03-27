import javax.swing.*;
import java.awt.*;

/**
 * Created by canhu on 02.05.2017.
 */
public class Paralyzed extends  JPanel {
    static JLabel p1;
    static boolean paralyzed=false;

    public Paralyzed(){
        setSize(215,50);
        setBackground(Color.lightGray);
        setLayout(null);
        p1= new JLabel(Icons.paralyzed);
        int X=10;
        p1.setBounds(X,0,30,40);
        add(p1);
        p1.setVisible(false);


    }

    static int Paralyzed(){
        if(paralyzed)return 1;
        else return 0;
    }
}
