/**
 * Created by canhu on 26.04.2017.
 */
public class Mage extends Characters{

    public Mage(int width, int height, int x, int y) {
        super(width, height, x, y);


        skill1.setIcon(Icons.mage1);
        skill2.setIcon(Icons.mage2);
        skill3.setIcon(Icons.mage3);
        skill4.setIcon(Icons.mage4);

        skill1.addActionListener(new MageListeners());
        skill2.addActionListener(new MageListeners());
        skill3.addActionListener(new MageListeners());
        skill4.addActionListener(new MageListeners());
    }

    static void nextlevel(){
        PanelPlayer.tfDmg.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfDmg.getText())+7 )));
       // PanelPlayer.tfArmor.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfArmor.getText())+0 )));
        HeaderPanel.lHP.setText(Integer.toString((Integer.parseInt(HeaderPanel.lHP.getText())+25 )));
        Values.setMaxhpUp(25);
        PanelCon.setDisplay("HP +25");
        PanelCon.setDisplay("Atak +7");
        //PanelCon.setDisplay("Obrona +1");
    }
}
