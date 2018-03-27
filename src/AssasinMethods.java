import java.util.Random;

/**
 * Created by canhu on 27.04.2017.
 */
public class AssasinMethods {

    //110/120/130/140/150% + 20/40/60/80/100
    static void skill1(){
        int i=SkillsPoints.skill1level;
        int p=Poisoned.count;
        PanelCon.setDisplay("~~~~~Trujące Cięcie~~~~~~");
        if(p>2){
            Methods.dealDMG ((Values.getAtak()*(150+(15*(p-2)*i)))/100) ;}
        else{Methods.dealDMG((Values.getAtak()*150)/100);}
        Poisoned.addStacks();
        {//losowanie drugiego stacku
            Poisoned.poison = new Random();
            int ch = Poisoned.poison.nextInt(100);
            if(ch< 45+5*i)  Poisoned.addStacks();
        }
        Methods.dropGold(2);
        Characters.skill1.setEnabled(false);
        Characters.s1cd=1;
        Characters.cd1.setText("("+String.valueOf(Characters.s1cd)+")");
        Methods.useAP(1);
        Methods.expgain(2);}

    static void skill2(){
        int i= SkillsPoints.skill2level;
        int s= Poisoned.count;
        PanelCon.setDisplay("~~~~Absorbcja Trucizny~~~");
        Characters.skill2.setEnabled(false);
        Characters.s2cd=3;
        Characters.cd2.setText("("+String.valueOf(Characters.s2cd)+")");
        Methods.useAP(2);
        Methods.heal(5);
        Methods.heal2((15+5*i)*s);
        Methods.LifeWarnings();
        if(s==5){
            Methods.gainAP(1);
            PanelCon.setDisplay("Odzyskujesz 1PA.");
            Characters.skill1.setEnabled(true);
        }
        Poisoned.removeStacks();
        Poisoned.removeStacks();

    }

    //140/155/170/185/200%
    static void skill3(){
        int i= SkillsPoints.skill3level;
        PanelCon.setDisplay("skill 3");
        Methods.ignoredefDMG(((Values.getAtak()*(125+i*15))/100));
        Methods.dropGold(3);
        Characters.skill3.setEnabled(false);
        Characters.s3cd=3;
        Characters.cd3.setText("("+String.valueOf(Characters.s3cd)+")");
        Methods.expgain(4);
        Methods.useAP(3);
        Poisoned.PoisonDmg(2);
        Poisoned.addStacks();
        Poisoned.addStacks();

    }

    // 75/100/125% dodatkowych obrażeń za każdy ładunek truzicny + 200% obrażeń
    static void skill4(){
        int i= SkillsPoints.skill4level;
        int s= Poisoned.count;
        PanelCon.setDisplay("skill 4");
        Methods.dealDMG((Values.getAtak()*(200+(50+i*25)*s))/100);
        Methods.dropGold(4);
        Methods.expgain(4);
        Methods.useAP(3);
        Poisoned.removeStacks();
        Poisoned.removeStacks();
        Poisoned.removeStacks();
        if(Integer.parseInt(PanelMon.lMonHP.getText())>0){
            Characters.skill4.setEnabled(false);
            Characters.s4cd=4;
            Characters.cd4.setText("("+String.valueOf(Characters.s4cd)+")");
        }
    }

}
