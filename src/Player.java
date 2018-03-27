import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.white;

/**
 * Created by canhu on 08.04.2017.
 */
public class Player extends JPanel implements ActionListener {
//
 private JLabel lGold,lDmg,lArmor,lPunktyakcji,buyDmg,buyArmor;


    public JButton bAtak,bLecz,bDef,bDmg,bArmor;




    Font serif= new Font("SansSerif", Font.BOLD, 16);


    public Player(String a){
        setLayout(null);






        buyDmg = new JLabel("Cena: 10 złota");
        buyDmg.setBounds(250,150,200, 20);
        buyDmg.setFont(serif);
        add(buyDmg);

        bDmg = new JButton("Zwiększ atak");
        bDmg.setBounds(250,180,150, 20);
        bDmg.addActionListener(this);
        bDmg.setEnabled(false);
        add(bDmg);

        buyArmor = new JLabel("Cena: 20 złota");
        buyArmor.setBounds(250,210,200, 20);
        buyArmor.setFont(serif);
        add(buyArmor);

        bArmor = new JButton("Zwiększ pancerz");
        bArmor.setBounds(250,240,150, 20);
        bArmor.addActionListener(this);
        bArmor.setEnabled(false);
        add(bArmor);





        bDef = new JButton("Broń się: 2PA");
        bDef.setBounds(250,500,130, 20);
      //  bDef.addActionListener(this);
        add(bDef);
    }


    @Override
    public  void actionPerformed(ActionEvent e) {
        Object source= e.getSource();
        if(source==bAtak){
            //con.taZdarzenia.setText(con.taZdarzenia.getText()+"Zadałeś "+" obrażeń\n");
        }


    }

    public Player(){};

}
