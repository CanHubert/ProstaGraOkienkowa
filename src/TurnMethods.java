/**
 * Created by canhu on 13.04.2017.
 */
public class TurnMethods {
    private static String setTurn(){
        PanelCenter.turn++;
        return "-----------Tura "+PanelCenter.turn+"-----------";}
    private static void showTurn() {
        PanelCon.setDisplay(setTurn());}

    static void endTurn(){
//        if(!(Values.currentPA() ==0)){
//            int odp= JOptionPane.showConfirmDialog(null,"Nie wykorzystałeś wszystkich punktów akcji!","Na pewno kończysz?",JOptionPane.YES_NO_OPTION);
//            if(odp==JOptionPane.NO_OPTION||odp==JOptionPane.CLOSED_OPTION) return;}
        PanelCon.setDisplay("--------Tura Potwora--------");
        MethodsOrk.Regeneration(45,8);
        switch (GameApp.klasa){
            case "Warrior": {
                MethodsOrk.AttMon();
            }break;
            case "Assasin": {
                Poisoned.PoisonDmg(1);
                if(Poisoned.Dodge()) PanelCon.setDisplay("Unikasz ciosu przeciwnika.");
                else {MethodsOrk.AttMon();}
            }break;
            case "Mage": {
                if(!Paralyzed.paralyzed){
                    MethodsOrk.AttMon();
                }
                else{
                    PanelCon.setDisplay(PanelMon.monsterName()+" jest sparaliżowany. Nie może atakować.");
                }
            }break;
        }



        switch (GameApp.klasa){
            case "Warrior": {
                Characters.s2last--;
            }break;
            case "Assasin": {
                Poisoned.removeStacks();
            }break;
            case "Mage": {
                Paralyzed.p1.setVisible(false);
                Paralyzed.paralyzed=false;}break;
            default:
        }

        if(Integer.valueOf(HeaderPanel.lHP.getText())>0){
            startTurn();}}

    static void startTurn(){
        showTurn();//wypisanie aktualnej tury oraz zwiekszenie jej o jeden
        Methods.heal(1);
        switch (GameApp.klasa){
            case "Warrior":{
                if(Characters.s2last==0){
                    PanelCon.setDisplay("Postawa Obronna zakończyła się.");
                    PanelCenter.bladeknight.setIcon(Icons.bladeknight);}}
        }
        Methods.rejuvenateAP();// odnowa AP, max 6pkt
        Methods.OnOffButtons();// de/aktywacja przycisków

        SkillMethods.cooldown();
        if(Characters.skills>0)
            SkillMethods.unlocknewskill();}

}
