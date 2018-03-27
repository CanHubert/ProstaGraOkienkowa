/**
 * Created by canhu on 16.04.2017.
 */
public class WarriorMethods {

    //110/120/130/140/150% + 20/40/60/80/100
    static void skill1(){
        int i=SkillsPoints.skill1level;
        Methods.dealDMG(((Values.getAtak()*(10+i*1)/10)+i*20));
        Methods.dropGold(2);
        Characters.skill1.setEnabled(false);
        Characters.s1cd=2;
        Characters.cd1.setText("("+String.valueOf(Characters.s1cd)+")");
        Methods.useAP(1);
        Methods.expgain(2);

    }
    //111/132/153/174/195% + 30/60/90/120/150
    static void skill3(){
        int i= SkillsPoints.skill3level;
        PanelCon.setDisplay("skill 3");
        Methods.dealDMG((Values.getAtak()*(90+21*i))/100+(30*i));
        Methods.dropGold(3);
        Characters.skill3.setEnabled(false);
        Characters.s3cd=3;
        Characters.cd3.setText("("+String.valueOf(Characters.s3cd)+")");
        Methods.expgain(3);
        Methods.useAP(2);

    }
    //brakujące HP potwora * 30/35/40% +100/200/300
    static void skill4(){
        int i= SkillsPoints.skill4level;
        PanelCon.setDisplay("skill 4");
        Methods.dealDMG((((Values.getMonmaxhp()-Values.getMonhp())*(25+i*5))/100)+100*i+(Values.getAtak()*(25+i*25))/100);
        Methods.dropGold(4);
        Characters.skill4.setEnabled(false);
        Characters.s4cd=4;
        Characters.cd4.setText("("+String.valueOf(Characters.s4cd)+")");
        Methods.expgain(4);
        Methods.useAP(3);
    }

    static void skill2(){
        int i= SkillsPoints.skill2level;
        Characters.s2last= 2;
        PanelCon.setDisplay("Postawa Obronna została aktywowana.");
        PanelCenter.bladeknight.setIcon(Icons.defendknight);
        Characters.skill2.setEnabled(false);
        Characters.s2cd=3;
        Characters.cd2.setText("("+String.valueOf(Characters.s2cd)+")");
        Methods.useAP(2);
        Methods.heal(2+i);

    }
    public static int skill2effect(){
        int i = SkillsPoints.skill2level;
        return i*7;

    }
}
