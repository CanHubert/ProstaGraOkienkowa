import javax.swing.*;
import java.awt.*;

import static java.awt.Color.white;

/**
 * Created by canhu on 12.04.2017.
 */
public class PanelMon extends JPanel {
    public static JLabel lMonHP, lMonMaxHP,potwor;
    private JLabel lMonLife,lMonDmg,lMonArmor;
    static JLabel tfMonDmg,tfMonArmor;
    static JTextArea skills;


    static String monsterName(){
        return PanelMon.potwor.getText();
    }


    public PanelMon(int width, int height,int x, int y){
        setLayout(null);
        setSize(width,height);
        setLocation(x,y);
        setBackground(Color.lightGray);

        lMonHP = new JLabel("1000");
        lMonHP.setBounds(100,100,100, 20);
        lMonHP.setFont(new Font("SansSerif", Font.BOLD, 24));
        lMonHP.setHorizontalAlignment(JLabel.RIGHT);
        lMonHP.setForeground(new Color(0, 128, 43));
        add(lMonHP);

        lMonMaxHP = new JLabel("/1000");
        lMonMaxHP.setBounds(200,100,200, 20);
        lMonMaxHP.setFont(new Font("SansSerif", Font.BOLD, 24));
        lMonMaxHP.setHorizontalAlignment(JLabel.LEFT);
        lMonMaxHP.setForeground(new Color(0, 128, 43));
        add(lMonMaxHP);

        potwor = new JLabel("Stats");
        potwor.setBounds(40,10,width, 40);
        potwor.setFont(new Font("SansSerif", Font.BOLD, 28));
        potwor.setForeground(Color.RED);
        potwor.setHorizontalAlignment(JLabel.LEFT);
        add(potwor);

        lMonLife= new JLabel("Życie: ");
        lMonLife.setBounds(0,100,100, 20);
        lMonLife.setFont(new Font("SansSerif", Font.BOLD, 16));
        lMonLife.setHorizontalAlignment(JLabel.RIGHT);
        add(lMonLife);

        lMonDmg= new JLabel("Obrażenia:");
        lMonDmg.setBounds(0,150,100, 25);
        lMonDmg.setFont(new Font("SansSerif", Font.BOLD, 16));
        lMonDmg.setHorizontalAlignment(JLabel.RIGHT);
        add(lMonDmg);

        tfMonDmg = new ValuesLabel("12");
        tfMonDmg.setBounds(100,150,100, 25);
        tfMonDmg.setVerticalAlignment(SwingConstants.CENTER);
        add(tfMonDmg);

        lMonArmor= new JLabel("Pancerz:");
        lMonArmor.setBounds(0,200,100, 25);
        lMonArmor.setFont(new Font("SansSerif", Font.BOLD, 16));
        lMonArmor.setHorizontalAlignment(JLabel.RIGHT);
        add(lMonArmor);

        tfMonArmor = new ValuesLabel("3");
        tfMonArmor.setBounds(100,200,100, 25);
        add(tfMonArmor);

        skills = new JTextArea("skille");
        skills.setBounds(50,300,200,200);
        skills.setBackground(new Color(192,192,192));
       // skills.setFont(new Font("Amazone", Font.ITALIC, 16));
        skills.setFont(new Font("Lucida Calligraphy", Font.ITALIC, 16));
        skills.setEditable(false);
         add(skills);

        JLabel border= new JLabel(Icons.monborder);
        border.setBounds(0,0,width,height);
        add(border);}

    public PanelMon() {
    }
    static public void NameSet(String s){
        potwor.setText(s);
    }


}
