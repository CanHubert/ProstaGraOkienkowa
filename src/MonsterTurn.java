import java.util.Random;

/**
 * Created by canhu on 26.04.2017.
 */
public class MonsterTurn {

    static String who(){
        Random r = new Random();
        int rand= r.nextInt(3);
        if(rand==0) return "Stats";
        if(rand==1) return "DarkKnight";
        if(rand==2) return "Hunter";
        return null;}

    static String who(int name){
        if(name==0) return "Stats";
        if(name==1) return "DarkKnight";
        if(name==2) return "Hunter";
        if(name==3) {
            return "Dragon";
        }
        return null;}

    static void whosTurn(String s){
        if(s.equals("Stats")){Ork();return;}
        if(s.equals("DarkKnight")){DarkKnight();return;}
        if(s.equals("Hunter")){Hunter();return;}
        if(s.equals("Dragon")){Dragon();}
    }

    static void Ork(){
        PanelCenter.ork.setVisible(true);
        PanelMon.NameSet("Ork");
    }
    static void DarkKnight(){
        PanelCenter.darkk.setVisible(true);
        PanelMon.NameSet("Dark Knight");
    }
    static void Hunter(){
        PanelCenter.hunter.setVisible(true);
        PanelMon.NameSet("Hunter");
    }
    static void Dragon(){
        PanelCenter.dragon.setVisible(true);
        PanelMon.NameSet("Dragon");
    }

    static void ClearImg(){
        switch (PanelMon.potwor.getText()){
            case "Ork":{ PanelCenter.ork.setVisible(false);}break;
            case "Dark Knight" :{PanelCenter.darkk.setVisible(false);}break;
            case "Hunter" :{PanelCenter.hunter.setVisible(false);}break;
            case "Dragon" :{PanelCenter.dragon.setVisible(false);}break;}}


    static void normalatt(int a){//a= Values.getMonatak();
        HeaderPanel.lHP.setText(String.valueOf(Values.getPlhp()-a));
        PanelCon.setDisplay( PanelMon.monsterName()+" zadał "+a+" obrażeń!");}

    static  void critatt(int a){
        HeaderPanel.lHP.setText(String.valueOf(Values.getPlhp()-a));
        PanelCon.setDisplay(PanelMon.monsterName()+" uderza krytycznie! Zadał "+a+" obrażeń!!!");}

    static void reducednormtatt(int a, int r){//a= Values.getMonatak(); r=WarriorMethods.skill2effect();
        int att =(a*(100-r))/100;
        HeaderPanel.lHP.setText(String.valueOf((Values.getPlhp()-att)));
        PanelCon.setDisplay("Część obrażeń została zredukowana\n     "+PanelMon.monsterName()+" zadał "+att+" obrażeń!");}

    static void reducedcritatt(int a, int r){//a= Values.getMonatak(); r=WarriorMethods.skill2effect();
        int crit =((a*(100-r))/100);
        HeaderPanel.lHP.setText(String.valueOf((Values.getPlhp()-crit)));
        PanelCon.setDisplay(PanelMon.monsterName()+" uderza krytycznie, część obrażeń została zredukowana,\n     zadał "+crit+" obrażeń!");}

    public static void Lose(){
        if(Integer.parseInt(HeaderPanel.lHP.getText())<=0){
            //PanelCon.clearDisplay();
            PanelCon.setDisplay("PRZEGRAŁEŚ!!!");
            Methods.disableButtons();}}
}
