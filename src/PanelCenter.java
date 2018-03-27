import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Created by canhu on 12.04.2017.
 */
public class PanelCenter extends JPanel {
   static JLabel avatar,war,mage,assasin,bladeknight,ork,darkk,dragon,hunter,barrier,barrierHP,barrierMAX;
   static int turn=1;
   public static Random rnd= new Random();

    public PanelCenter(int width, int height,int x, int y){
        setLayout(null);
        setSize(width,height);
        setLocation(x,y);
        setBackground(Color.DARK_GRAY);
        JLabel ramka= new JLabel(Icons.ramka);
        ramka.setBounds(0,0,900,500);
        add(ramka);

//        war= new JLabel(Icons.warrior);
//        war.setBounds(10,50,134,220);
//        war.setVisible(false);
//        add(war);

        bladeknight= new JLabel(Icons.bladeknight);
        bladeknight.setBounds(-10,50,346,220);
        bladeknight.setVisible(false);
        add(bladeknight);

        mage= new JLabel(Icons.mage);
        mage.setBounds(10,50,217,220);
        mage.setVisible(false);
        add(mage);

        barrier= new JLabel(Icons.barrier1);
        barrier.setBounds(40,-40,300,350);
        barrier.setVisible(false);
        add(barrier);

        barrierHP = new JLabel();
        //barrierHP.setText(null);
        barrierHP.setBounds(165,320,100, 20);
        barrierHP.setFont(new Font("SansSerif", Font.BOLD, 24));
        barrierHP.setHorizontalAlignment(JLabel.RIGHT);
        barrierHP.setForeground(new Color(10,35,242));
        add(barrierHP);

        barrierMAX= new JLabel();
        barrierMAX.setBounds(265,320,100,20);
        barrierMAX.setFont(new Font("SansSerif", Font.BOLD, 24));
        barrierMAX.setHorizontalAlignment(JLabel.LEFT);
        barrierMAX.setForeground(new Color(10,35,242));
        add(barrierMAX);

        assasin= new JLabel(Icons.assasin);
        assasin.setBounds(10,50,161,220);
        assasin.setVisible(false);
        add(assasin);

        ork= new JLabel(Icons.ork);
        ork.setBounds(630,70,300,280);
        ork.setVisible(false);
        add(ork);

        darkk= new JLabel(Icons.darkK);
        darkk.setBounds(530,130,362,220);
        darkk.setVisible(false);
        add(darkk);

        dragon= new JLabel(Icons.dragon2);
        dragon.setBounds(400,80,573,305);
        dragon.setVisible(false);
        add(dragon);

        hunter= new JLabel(Icons.hunter);
        hunter.setBounds(555,70,450,260);
        hunter.setVisible(false);
        add(hunter);


        //tło musi być na końcu
        avatar= new JLabel(Icons.tlo);
        avatar.setBounds(0,0,900,500);
        add(avatar);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int x = e.getX();
                int y= e.getY();
                System.out.println(x+","+y);
            }
        });

    }
}
