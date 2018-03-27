import java.util.Random;
/**
 * Created by canhu on 13.04.2017.
 */
public class MethodsOrk {
    private static Random crit = new Random();
    private static Random attTwice = new Random();

    static void Regeneration(int chance, int percent) {
        if ((PanelCenter.rnd.nextInt(100))<= (chance-1)) {
            if(Values.getMonmaxhp()- Values.getMonhp() <(Values.getMonmaxhp()*percent)/100 ){
                String h=String.valueOf(Values.getMonmaxhp()- Values.getMonhp());
                PanelCon.setDisplay(PanelMon.potwor.getText()+" regeneruje "+h+" obrażeń!");
                PanelMon.lMonHP.setText(String.valueOf(Values.getMonmaxhp()));
                Methods.MonLWar();

            }
            else{
                PanelCon.setDisplay(PanelMon.potwor.getText()+" regeneruje "+(Values.getMonmaxhp()*percent)/100+" obrażeń!");
                PanelMon.lMonHP.setText(String.valueOf(Values.getMonhp() + (Values.getMonmaxhp()*percent)/100));
                Methods.MonLWar();
            }}}

    static void AttMon (){
        int numer = crit.nextInt(100);
        int drugiatt= attTwice.nextInt(10);
        switch (GameApp.klasa) {
            case "Warrior": {
                if(Characters.s2last>0){
                    if(numer<30){//szansa na trafienie krytyczne
                        MonsterTurn.reducedcritatt(Values.setMonatak(Values.getMonatak()*2), WarriorMethods.skill2effect());}
                    else{
                        MonsterTurn.reducednormtatt(Values.setMonatak(Values.getMonatak()), WarriorMethods.skill2effect());}
                    if(drugiatt==0){
                        PanelCon.setDisplay("Potwór atakuje kolejny raz!!!");
                        AttMon();}}
                else{
                    if(numer<30){//szansa na trafienie krytyczne
                        MonsterTurn.critatt(Values.setMonatak(Values.getMonatak()*2));}
                    else{
                        MonsterTurn.normalatt(Values.setMonatak(Values.getMonatak()));}
                    if(drugiatt==0){
                        PanelCon.setDisplay("Potwór atakuje kolejny raz!!!");
                        AttMon();}}
                }break;
            case "Mage":{
                if(Barrier.OnOff==true){
                    if(numer<30){//szansa na trafienie krytyczne
                        Barrier.critBarrier();}
                    else{
                        Barrier.attBarrier();}
                    if(drugiatt==0){
                        PanelCon.setDisplay("Potwór atakuje kolejny raz!!!");
                        AttMon();}
                }
                else{
                    if(numer<30){//szansa na trafienie krytyczne
                        MonsterTurn.critatt(Values.setMonatak(Values.getMonatak()*2));}
                    else{
                        MonsterTurn.normalatt(Values.setMonatak(Values.getMonatak()));}
                    if(drugiatt==0){
                        PanelCon.setDisplay("Potwór atakuje kolejny raz!!!");
                        AttMon();}
                }
            }break;
            default:{
                if(numer<30){//szansa na trafienie krytyczne
                    MonsterTurn.critatt(Values.setMonatak(Values.getMonatak()*2));}
                else{
                    MonsterTurn.normalatt(Values.setMonatak(Values.getMonatak()));}
                if(drugiatt==0){
                    PanelCon.setDisplay("Potwór atakuje kolejny raz!!!");
                    AttMon();}

            }
        }


        Methods.LifeWarnings();
        MonsterTurn.Lose();}


}
