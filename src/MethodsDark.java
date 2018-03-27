import java.util.Random;

/**
 * Created by canhu on 26.04.2017.
 */
public class MethodsDark {

    static public void Counterattack(){
        Random r= new Random();
        int rnd= r.nextInt(100);
        if(Values.getMonhp()>0){
            if(rnd<30){
                PanelCon.setDisplay(PanelMon.monsterName()+" kontratakuje!");
                PanelMon.tfMonDmg.setText(String.valueOf(Values.getMonatak()+1));
                MonsterTurn.normalatt(Values.setMonatak(Values.getMonatak()));
                Methods.LifeWarnings();
                MonsterTurn.Lose();}}
    }
}
