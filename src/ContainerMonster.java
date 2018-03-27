import javax.swing.*;
import java.awt.*;

import static java.awt.Color.white;

/**
 * Created by canhu on 12.04.2017.
 */
public class ContainerMonster extends PanelMon {



    public ContainerMonster(int width, int height,int x, int y){
        super( width,  height, x,  y);


        skills.setText("Regeneration(10%)\nDouble Attack(30%)\nDouble Turn(10%)");
        Poisoned p =new Poisoned();
        p.setLocation(0,240);
        add(p);
        Poisoned.Stack(0);
        Paralyzed par = new Paralyzed();
        par.setLocation(0,240);
        add(par);


    }
    static public void Stats(int hp, int att , int def){

        lMonHP.setText(String.valueOf(hp));
        lMonMaxHP.setText("/"+String.valueOf(hp));
        tfMonDmg.setText(String.valueOf(att));
        tfMonArmor.setText(String.valueOf(def));

    }
}
