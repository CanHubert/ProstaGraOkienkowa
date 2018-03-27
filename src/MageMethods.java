import java.awt.*;
import java.util.Random;

/**
 * Created by canhu on 30.04.2017.
 */
public class MageMethods {
    private static int dmg = Values.getAtak();

    static void skill1(){
        int i=SkillsPoints.skill1level;
        int x, combo=0;
        Random rand = new Random();
        do {
            Methods.dealDMG((dmg * (10 + i) / 10 + (i * 20)));

            x= rand.nextInt(100);

        }while (x < ((10-combo++) + (5 * i)));
        if(combo>1) {PanelCon.setDisplay("Combo "+combo+"!");}
        Methods.dropGold(2);
        Characters.skill1.setEnabled(false);
        Characters.s1cd=1;
        Characters.cd1.setText("("+String.valueOf(Characters.s1cd)+")");
        Methods.useAP(1);
        Methods.expgain(2*combo);
    }

    static void skill2(){
        int i= SkillsPoints.skill2level;
        int lv= Values.getLevel();
        PanelCon.setDisplay("Bariera została aktywowana.");
        PanelCenter.barrier.setVisible(true);
        PanelCenter.barrierHP.setVisible(true);
        PanelCenter.barrierHP.setForeground(new Color(10,35,242));
        PanelCenter.barrierMAX.setVisible(true);
        PanelCenter.barrierMAX.setForeground(new Color(10,35,242));
        PanelCenter.barrier.setIcon(Icons.barrier1);
        Barrier.setHP((50 * i) + (lv * 4) + (Integer.valueOf(PanelPlayer.tfDmg.getText())*3/4));
        Barrier.OnOff=true;
        Characters.skill2.setEnabled(false);
        Characters.s2cd=4;
        Characters.cd2.setText("("+String.valueOf(Characters.s2cd)+")");
        Methods.useAP(3);

    }
    static void skill3(){
        int i= SkillsPoints.skill3level;
        PanelCon.setDisplay("~~~~Błyskawica~~~");
        Methods.dealDMG((dmg *(90+21*i))/100+(30*i));
        {
            Random rnd = new Random();
            int p= rnd.nextInt(100);
            if(Values.getMonhp()>0){
                if(p<35+i*5){
                    Paralyzed.paralyzed=true;
                    PanelCon.setDisplay("Wróg został sparaliżowany.");
                    Paralyzed.p1.setVisible(true);}}
        }
        Methods.dropGold(3);
        Characters.skill3.setEnabled(false);
        Characters.s3cd=3;
        Characters.cd3.setText("("+String.valueOf(Characters.s3cd)+")");
        Methods.expgain(3);
        Methods.useAP(2);}
    static void skill4(){
        int i= SkillsPoints.skill4level;
        PanelCon.setDisplay("~~~~~~~~~~");
        if(PanelMon.monsterName().equals("Dragon")){
            if(Paralyzed.paralyzed){
                Methods.ignoredefDMG((dmg*2*(80+40*i)/100) +(i*200));
            }
            else{
                Methods.dealDMG((dmg*2*(80+40*i)/100) +(i*200));
            }
            Methods.expgain(8);
        }
        else{
            if(Paralyzed.paralyzed){
                Methods.ignoredefDMG((dmg*(80+40*i)/100) +(i*100));
            }
            else{
                Methods.dealDMG((dmg*(80+40*i)/100) +(i*100));
            }
            Methods.expgain(4);
        }
        Methods.dropGold(4);
        Characters.skill4.setEnabled(false);
        Characters.s4cd=3;
        Characters.cd4.setText("("+String.valueOf(Characters.s4cd)+")");
        Methods.useAP(3);
    }
}
