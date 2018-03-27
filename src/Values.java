import java.util.Random;

/**
 * Created by canhu on 12.04.2017.
 */
public class Values {
    /*
      atak= obrażenia zmniejszone o pancerz potowra
     */
    private static int monatak;
    private static int plhp=Integer.valueOf(HeaderPanel.lHP.getText());
    private static int monhp=Integer.valueOf(PanelMon.lMonHP.getText());
    private static int maxhp=Integer.valueOf(HeaderPanel.lHP.getText());
    private static int monmaxhp;
    private static int level;

    static void setAtak(int i) {
        PanelPlayer.tfDmg.setText(String.valueOf(Integer.valueOf(PanelPlayer.tfDmg.getText())+i));}

    static void setDef(int i) {
        PanelPlayer.tfArmor.setText(String.valueOf(Integer.valueOf(PanelPlayer.tfArmor.getText())+i));}

    // pobiera wartosc ataku potwora z pola
    public static  int getMonatak() {
        return Values.monatak =Integer.valueOf(PanelMon.tfMonDmg.getText());}

    //ustawia wartosc obrażeń zredukowanych przez pancerz
    public static int setMonatak(int monster_attack) {
        int arm=Integer.valueOf(PanelPlayer.tfArmor.getText());
        monatak=(monster_attack*100)/(100+arm);
        return monatak; }

    public static int getMonmaxhp() {
        return monmaxhp=Integer.valueOf(PanelMon.lMonMaxHP.getText().substring(1));}

    public static int getMonhp() {
        monhp=Integer.valueOf(PanelMon.lMonHP.getText());
        return monhp;}

    static int getPlhp(){
        plhp=Integer.valueOf(HeaderPanel.lHP.getText());
        return plhp;}

    static int getAtak() {
        int dmg=Integer.valueOf(PanelPlayer.tfDmg.getText()); // wartośc ataku z etykiety
        int spread=dmg/40; // co 40 ataku wiekszy rozrzut
        Random att = new Random();
        dmg=(dmg-spread)+ att.nextInt((spread*2)+1);
        return dmg;}



    static int getMaxhp() {
        return maxhp;}

    static int getHeal(int percent){
         return (maxhp*percent)/100;}

    //zwieksza hp i tekst o max hp
    static  void setMaxhpUp(int hp) {
        maxhp += hp;
        HeaderPanel.lMaxHP.setText("/"+String.valueOf(Integer.valueOf(HeaderPanel.lMaxHP.getText().substring(1))+hp));}

    //używanie złota
    static void pay(int i){
        PanelPlayer.tfGold.setText(String.valueOf(Integer.valueOf(PanelPlayer.tfGold.getText())-i));}

    //zwraca akutalna wartosc PA
    static int currentPA(){
        return Integer.valueOf(PanelPlayer.tfPunktyakcji.getText());}

    static int getLevel(){
        return Integer.parseInt(HeaderPanel.lNrpoz.getText());}

    static int getExp(){
        return Integer.parseInt(HeaderPanel.lExpPoints.getText());}
}
