import javafx.scene.layout.Pane;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.DARK_GRAY;
import static java.awt.Color.white;

/**
 * Created by canhu on 12.04.2017.
 */
public class PanelPlayer extends JPanel {
    private JLabel lGold,lDmg,lArmor,lPunktyakcji;
    static JLabel tfGold,tfDmg,tfArmor,tfPunktyakcji,buyDmg,buyArmor;
    static JButton bAtak,bLecz, bDmg,bArmor;


    private Font serif= new Font("SansSerif", Font.BOLD, 16);
    public PanelPlayer(int width, int height,int x, int y ){
        setLocation(x,y);
        setLayout(null);
        setSize(width, height);
        setBackground(Color.gray);
        int n=16;

        lDmg= new JLabel("Obrażenia:");
        lDmg.setBounds(0,n+0,100, 20);
        lDmg.setFont(serif);
        lDmg.setHorizontalAlignment(JLabel.RIGHT);
        add(lDmg);

        tfDmg = new ValuesLabel("32");
        tfDmg.setBounds(100,n+0,100, 20);
        add(tfDmg);

        lArmor= new JLabel("Pancerz:");
        lArmor.setBounds(0,n+50,100, 20);
        lArmor.setFont(serif);
        lArmor.setHorizontalAlignment(JLabel.RIGHT);
        add(lArmor);

        tfArmor = new ValuesLabel("27");
        tfArmor.setBounds(100,n+50,100, 20);
        add(tfArmor);

        lPunktyakcji= new JLabel("PA:");
        lPunktyakcji.setBounds(0,n+100,100, 20);
        lPunktyakcji.setFont(serif);
        lPunktyakcji.setHorizontalAlignment(JLabel.RIGHT);
        add(lPunktyakcji);

        tfPunktyakcji = new ValuesLabel("3");
        tfPunktyakcji.setBounds(100,n+100,100, 20);
        add(tfPunktyakcji);

        lGold= new JLabel("Złoto:");
        lGold.setBounds(0,n+150,100, 20);
        lGold.setFont(serif);
        lGold.setHorizontalAlignment(JLabel.RIGHT);
        add(lGold);

        tfGold = new ValuesLabel("0");
        tfGold.setBounds(100,n+150,100, 20);
        add(tfGold);

        buyDmg = new JLabel("Cena:  złota");
        buyDmg.setText("Cena: "+Calculations.aPrice()+"  złota");
        buyDmg.setBounds(220,n+25,200, 20);
        buyDmg.setFont(serif);
        add(buyDmg);

        bDmg = new JButton("Att+");
        bDmg.setBounds(220,n+0,70, 30);
        bDmg.setName("Att+");
        bDmg.setFont(new Font("SansSerif", Font.BOLD, 14));
        bDmg.addActionListener(new Actions());
        bDmg.setEnabled(false);
        add(bDmg);

        buyArmor = new JLabel("Cena: 10 złota");
        buyArmor.setBounds(220,n+75,200, 20);
        buyArmor.setFont(serif);
        add(buyArmor);

        bArmor = new JButton("Def+");
        bArmor.setName("Def+");
        bArmor.setBounds(220,n+50,70, 30);
        bArmor.setFont(new Font("SansSerif", Font.BOLD, 14));
        bArmor.addActionListener(new Actions());
        bArmor.setEnabled(false);
        add(bArmor);

        bAtak = new JButton(Icons.atakicon);
        bAtak.setName("atak");
        bAtak.setBounds(30,n+200,72, 71);
        bAtak.setBackground(Color.DARK_GRAY);
        bAtak.setFont(new Font("SansSerif", Font.BOLD, 24));
        bAtak.addActionListener(new Actions());
        bAtak.setToolTipText("<html><font size='5'>Atakuj<br/>Koszt 1PA</font></html>");
        add(bAtak);

        bLecz = new JButton(Icons.leczicon);
        bLecz.setName("lecz");
        bLecz.setBounds(122,n+200,72, 72);
        bLecz.setBackground(DARK_GRAY);
        bLecz.setFont(new Font("SansSerif", Font.BOLD, 24));
        bLecz.addActionListener(new Actions());
        bLecz.setToolTipText("<html><font size='5'>Ulecz HP o 7%<br/>Koszt 2PA</font></html>");
        add(bLecz);

        JLabel border = new JLabel(Icons.playerborder);
        border.setBounds(0,1,width,height);
        add(border);}
}
