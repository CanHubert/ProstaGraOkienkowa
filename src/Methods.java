import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.Random;

/**
 * Created by canhu on 12.04.2017.
 */
public class Methods {

    static void Atakuj(){
        PanelCon.setDisplay("~~~~~~~~Atakujesz~~~~~~~~");
        dealDMG(Values.getAtak());
        //50 +level*2 % szansa na truciznę
        if(GameApp.klasa.equals("Assasin")){Poisoned.NormalAttPoison(); }
        dropGold(1);
        expgain(1);
        useAP(1);
        Victory();}

    static void Lecz(){
        heal(7);
        useAP(2);
        LifeWarnings();}

    static void dealDMG(int a){
        int mondef=Integer.valueOf(PanelMon.tfMonArmor.getText());//wartosc def potwora z etykiety
        int atak=(a*100)/(100+mondef);
        PanelMon.lMonHP.setText(String.valueOf(Values.getMonhp()-atak));
        PanelCon.setDisplay("Zadałeś "+atak+" obrażeń!");
        MonLWar();
        if(PanelMon.potwor.getText().equals("Dark Knight"))
            MethodsDark.Counterattack();
    }
    static void ignoredefDMG(int a){
        PanelMon.lMonHP.setText(String.valueOf(Values.getMonhp()-a));
        PanelCon.setDisplay("Ignorujesz pancerz przeciwnika\n     Zadajesz "+a+" obrażeń!");
        MonLWar();
        if(PanelMon.potwor.getText().equals("Dark Knight"))
            MethodsDark.Counterattack();
    }

    static void heal(int percent){// leczenie o wartośc procentową
        if(Values.getMaxhp()-(Integer.parseInt(HeaderPanel.lHP.getText()))<Values.getHeal(percent)) {
            PanelCon.setDisplay("Uleczyłeś "+(Values.getMaxhp()-(Integer.parseInt(HeaderPanel.lHP.getText())))+" pkt. zdrowia.");
            HeaderPanel.lHP.setText(Integer.toString((Integer.parseInt(HeaderPanel.lHP.getText()) +
                    (Values.getMaxhp()-(Integer.parseInt(HeaderPanel.lHP.getText()))))));}
        else {
            HeaderPanel.lHP.setText(String.valueOf(Values.getPlhp() + Values.getHeal(percent)));
            PanelCon.setDisplay("Uleczyłeś "+Values.getHeal(percent)+" pkt. zdrowia.");}
    }
    static void heal2(int value){//leczenie o wartośc stałą
        if(Values.getMaxhp()-(Integer.parseInt(HeaderPanel.lHP.getText()))<value) {
            PanelCon.setDisplay("Uleczyłeś "+(Values.getMaxhp()-(Integer.parseInt(HeaderPanel.lHP.getText())))+" pkt. zdrowia.");
            HeaderPanel.lHP.setText(Integer.toString((Integer.parseInt(HeaderPanel.lHP.getText()) +
                    (Values.getMaxhp()-(Integer.parseInt(HeaderPanel.lHP.getText()))))));}
        else {
            HeaderPanel.lHP.setText(String.valueOf(Values.getPlhp() + value));
            PanelCon.setDisplay("Uleczyłeś "+value+" pkt. zdrowia.");}
    }


    static void setName(String s){
        HeaderPanel.name.setText(s);}

    static void OnOffButtons(){
        int pa = Integer.valueOf(PanelPlayer.tfPunktyakcji.getText());
        if(pa<2) {
            PanelPlayer.bLecz.setEnabled(false);
            if(pa<1){
                PanelPlayer.bAtak.setEnabled(false);}}
        if(pa>0){
            PanelPlayer.bAtak.setEnabled(true);
            if(pa>1)
                PanelPlayer.bLecz.setEnabled(true);}
        PanelCon.bEnd.setEnabled(true);
         switch (GameApp.klasa){
             case "Warrior":{
                 if(pa<3){
                     Characters.skill4.setEnabled(false);
                     if(pa<2){
                         Characters.skill3.setEnabled(false);
                         Characters.skill2.setEnabled(false);
                         if(pa<1){
                             Characters.skill1.setEnabled(false);}}}}break;
             case "Assasin":{
                 if(pa<3){
                     Characters.skill4.setEnabled(false);
                     Characters.skill3.setEnabled(false);
                     if(pa<2){
                         Characters.skill2.setEnabled(false);
                         if(pa<1){
                             Characters.skill1.setEnabled(false);}}}
             }break;
             case "Mage" : {
                 if(pa<3){
                     Characters.skill2.setEnabled(false);
                     Characters.skill4.setEnabled(false);
                     if(pa<2){
                         Characters.skill3.setEnabled(false);
                         if (pa<1){
                             Characters.skill1.setEnabled(false);
                         }
                     }
                 }
             }break;}}

    static void useAP(int a){
        PanelPlayer.tfPunktyakcji.setText(String.valueOf(Integer.valueOf(PanelPlayer.tfPunktyakcji.getText())-a));
        if(Values.getMonhp()>0)
            OnOffButtons();}

    static void rejuvenateAP(){
        if(Values.getLevel()>14)
            gainAP(4);
        else
            gainAP(3);}

    static void gainAP(int a){
        PanelPlayer.tfPunktyakcji.setText(String.valueOf(Integer.valueOf(PanelPlayer.tfPunktyakcji.getText())+a));
        if(Values.currentPA()>6)
            PanelPlayer.tfPunktyakcji.setText("6");
        OnOffButtons();
    }

    static void expgain(int a){
        PanelCon.setDisplay("Zdobyto "+a+" doświadczenia.");
        for (int i = 0; i <a ; i++) {
            HeaderPanel.lExpPoints.setText(String.valueOf(Integer.valueOf(HeaderPanel.lExpPoints.getText())+1));
            nowyPoziom();
            HeaderPanel.lNext.setText(Calculations.printexp());}}


    private static void nowyPoziom() {
        int poz = Calculations.calcLv();

        if(Values.getExp()==Calculations.expSum(Calculations.calcLv())) {
            HeaderPanel.lNrpoz.setText(Integer.toString(poz));
            PanelCon.setDisplay("Gratulacje! Zdobyłeś poziom "+poz);
            switch (GameApp.klasa){
                case "Warrior":{Warrior.nextlevel();}break;
                case "Assasin":{Assasin.nextlevel();}break;
                case "Mage":{Mage.nextlevel();}break;}
            if(poz==15)
                PanelCon.setDisplay("Zdobywasz kolejny punkt AP!!!");
            SkillsPoints.lvup();
            LifeWarnings();}}

    //koloruje życie GRACZA zależnie od % posiadanego zycia
    public static void LifeWarnings(){
        if( Integer.parseInt(HeaderPanel.lHP.getText())>= Values.getMaxhp()/2 ) {
            HeaderPanel.lHP.setForeground(new Color(0, 128, 43));
            HeaderPanel.lMaxHP.setForeground(new Color(0, 128, 43));}
        else if(Integer.parseInt(HeaderPanel.lHP.getText())< Values.getMaxhp()/2) {
            if(Integer.parseInt(HeaderPanel.lHP.getText())< Values.getMaxhp()/4) {
                HeaderPanel.lHP.setForeground(new Color(204, 0, 0));
                HeaderPanel.lMaxHP.setForeground(new Color(204, 0, 0));}
            else {
                HeaderPanel.lHP.setForeground(new Color(249, 249, 6));
                HeaderPanel.lMaxHP.setForeground(new Color(249, 249, 6));}}}

    //koloruje życie PRZECIWNIKA zależnie od % posiadanego zycia
    static void MonLWar(){
        if( Integer.parseInt(PanelMon.lMonHP.getText())>= Values.getMonmaxhp()/2 ){
            PanelMon.lMonHP.setForeground(new Color(0, 128, 43));
            PanelMon.lMonMaxHP.setForeground(new Color(0, 128, 43));}

        else if(Integer.parseInt(PanelMon.lMonHP.getText())< Values.getMonmaxhp()/2) {
            if(Integer.parseInt(PanelMon.lMonHP.getText())< Values.getMonmaxhp()/4){
                PanelMon.lMonHP.setForeground(new Color(204, 0, 0));
                PanelMon.lMonMaxHP.setForeground(new Color(204, 0, 0));}

            else{
                PanelMon.lMonHP.setForeground(new Color(249, 249, 6));
                PanelMon.lMonMaxHP.setForeground(new Color(249, 249, 6));}}
    }

    //wyłącza przyciski
    static public void disableButtons(){
        PanelPlayer.bAtak.setEnabled(false);
        PanelPlayer.bLecz.setEnabled(false);
        PanelCon.bEnd.setEnabled(false);
        Characters.skill1.setEnabled(false);
        Characters.skill2.setEnabled(false);
        Characters.skill3.setEnabled(false);
        Characters.skill4.setEnabled(false);
    }


    //sprawdzenie zwyciestwa
     static  void Victory(){
        if(Integer.parseInt(PanelMon.lMonHP.getText())<=0){
            //PanelCon.clearDisplay();
            //PanelCon.setDisplay("WYGRAŁEŚ!!!");
            //disableButtons();
        JOptionPane.showMessageDialog(null,"Brawo Wygrałeś! Przechodzisz Dalej!");
        MonsterTurn.ClearImg();
        expgain(4+2*NextMonster.count);
        dropGold(2*NextMonster.count);
        //GameApp.c.add(GameApp.monster);
        if(GameApp.klasa.equals("Assasin")) {Poisoned.removeStacks(); Poisoned.removeStacks();Poisoned.removeStacks();}//usuwa wszystkie ładunki przed nowym przeciwnikiem
        int i =++NextMonster.count;
        MonsterTurn.whosTurn(MonsterTurn.who());
        ContainerMonster.Stats(500+(150*i),20+8*i,10+6*i);
        MonLWar();//ustawia kolor życia na zielone
        TurnMethods.startTurn();
            }
    }
    static void dropGold(int g){
        Random rnd= new Random();
        int gold =((rnd.nextInt(3)+g)*g)+(Integer.parseInt(PanelPlayer.tfDmg.getText()))/10;
        PanelPlayer.tfGold.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfGold.getText())+gold)));
        PanelCon.setDisplay("Zyskujesz "+gold+" sztuk złota");
        spendgold();}

    static void spendgold(){
        int gold =Integer.parseInt(PanelPlayer.tfGold.getText());
        if(gold<Calculations.aPrice()) {
            PanelPlayer.bDmg.setEnabled(false);
        }
        else PanelPlayer.bDmg.setEnabled(true);

        if(gold<Calculations.dPrice()) {
            PanelPlayer.bArmor.setEnabled(false);
        }
        else PanelPlayer.bArmor.setEnabled(true);
        }

}




