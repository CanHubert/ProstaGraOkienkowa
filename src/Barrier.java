import java.awt.*;

/**
 * Created by canhu on 30.04.2017.
 */
public class Barrier {
    static int hp, maxhp;
    static boolean OnOff;

    public static int getHp() {return hp;}

    public static int getMaxhp() {return maxhp;}

    static void setHP(int life){hp= life;maxhp= life;
    PanelCenter.barrierHP.setText(String.valueOf(hp));
    PanelCenter.barrierMAX.setText("/"+String.valueOf(maxhp));}

    static void barrierDurability(){
        if(hp<(maxhp/2)){
            if(hp<(maxhp/4)){
                if(hp<0){
                    PanelCenter.barrierHP.setVisible(false);
                    PanelCenter.barrierMAX.setVisible(false);
                    PanelCenter.barrier.setVisible(false);
                    PanelCon.setDisplay("Bariera została zniszczona.");
                    OnOff=false;
                    return;
                }
                PanelCenter.barrierHP.setForeground(new Color(204, 0, 0));
                PanelCenter.barrierMAX.setForeground(new Color(204, 0, 0));
                PanelCenter.barrier.setIcon(Icons.barrier3); return;
            }
            PanelCenter.barrierHP.setForeground(new Color(249, 249, 6));
            PanelCenter.barrierMAX.setForeground(new Color(249, 249, 6));
            PanelCenter.barrier.setIcon(Icons.barrier2);
        }

    }

    static void attBarrier(){
        int dmg =Values.getMonatak();
        hp=hp-dmg;
        PanelCon.setDisplay(PanelMon.monsterName()+" atakuje.\n"+"     Barriera pochłonęła "+dmg+" obrażeń.");
        PanelCenter.barrierHP.setText(String.valueOf(hp));
        barrierDurability();

    }
    static void critBarrier(){
        int dmg =Values.getMonatak()*2;//zwiekszona x2
        hp=hp-dmg;
        PanelCon.setDisplay(PanelMon.monsterName()+" uderza krytycznie!\n     Barriera pochłonęła "+dmg+" obrażeń!");
        PanelCenter.barrierHP.setText(String.valueOf(hp));
        barrierDurability();
    }

}
