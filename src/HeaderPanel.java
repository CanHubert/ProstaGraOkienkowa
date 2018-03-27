import javax.swing.*;
import java.awt.*;

/**
 * Created by canhu on 12.04.2017.
 */
public class HeaderPanel extends JPanel{

    static JLabel lNrpoz,lExpPoints,lHP,lMaxHP,lNext, border;
    final static JLabel name= new JLabel();


    public HeaderPanel(int width, int height,int x, int y, String s){
        setLocation(x,y);
        setLayout(null);
        setSize(width,height);
        setBackground(Color.pink);
        Font serif= new Font("SansSerif", Font.BOLD, 16);

        name.setText(s);
        name.setBounds(20,10,width,35);
        name.setFont(new Font("SansSerif", Font.BOLD, 28));
        name.setForeground(Color.BLUE);
       // name.setHorizontalAlignment(JLabel.CENTER);
        add(name);

        JLabel lPoziom = new JLabel("Poziom:");
        lPoziom.setBounds(0,50,100, 20);
        lPoziom.setFont(serif);
        lPoziom.setHorizontalAlignment(JLabel.RIGHT);
        add(lPoziom);

        lNrpoz = new JLabel("1");
        lNrpoz.setBounds(100,50,50, 20);
        lNrpoz.setFont(new Font("SansSerif", Font.BOLD, 20));
        lNrpoz.setHorizontalAlignment(JLabel.LEFT);
        add(lNrpoz);

        JLabel lExp = new JLabel("EXP:");
        lExp.setBounds(150,50,50, 20);
        lExp.setFont(serif);
        lExp.setHorizontalAlignment(JLabel.RIGHT);
        add(lExp);

        lExpPoints = new JLabel("0");
        lExpPoints.setBounds(200,50,70, 20);
        lExpPoints.setFont(new Font("SansSerif", Font.BOLD, 20));
        lExpPoints.setHorizontalAlignment(JLabel.LEFT);
        add(lExpPoints);

        lNext = new JLabel();
        lNext.setBounds(300,50,100,20);
        //lNext.setText(Calculations.printexp());
        lNext.setHorizontalAlignment(JLabel.LEFT);
        lNext.setFont(new Font("SansSerif", Font.BOLD, 17));
        add(lNext);

        JLabel lLife= new JLabel("Życie: ");
        lLife.setBounds(0,100,100, 20);
        lLife.setFont(serif);
        lLife.setHorizontalAlignment(JLabel.RIGHT);
        add(lLife);

        lHP = new JLabel("800");
        lHP.setBounds(100,100,100, 20);
        lHP.setFont(new Font("SansSerif", Font.BOLD, 24));
        lHP.setHorizontalAlignment(JLabel.RIGHT);
        lHP.setForeground(new Color(0, 128, 43));
        add(lHP);

        lMaxHP= new JLabel("/800");
        lMaxHP.setBounds(200,100,100,20);
        lMaxHP.setFont(new Font("SansSerif", Font.BOLD, 24));
        lMaxHP.setHorizontalAlignment(JLabel.LEFT);
        lMaxHP.setForeground(new Color(0, 128, 43));
        add(lMaxHP);

        //JLabel border = new JLabel(Icons.headerborder);
        border = new JLabel(Icons.headerwarrior);
        border.setLocation(0,0);
        border.setSize(width,height);
        add(border);}


}
