import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by canhu on 08.04.2017.
 */
public class GameApp extends JFrame {
    static  Container c= new Container();
    private static  PanelPlayer player = new PanelPlayer(420,300,0,150);
    static PanelMon monster = new ContainerMonster(300,800,1320,0);
    static String klasa="";

    GameApp(String s){
        Dimension game= new Dimension(1640,850);
        setSize(game);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prosta Gra Okienkowa 1.0v");
        Methods.setName(s);
        setContentPane(c);
        HeaderPanel head = new HeaderPanel(420, 150, 0, 0,s);
        c.add(head);
        c.add(monster);
        PanelCon con = new PanelCon(900, 300, 420, 500);
        c.add(con);
        PanelCenter center = new PanelCenter(900, 500, 420, 0);
        c.add(center);
        c.add(player);
        }

    static void addWarrior(){
        c.add(new Warrior(420,350,0,450));
        PanelCenter.bladeknight.setVisible(true);
        int i= NextMonster.count;
        ContainerMonster.Stats(500+(150*i),20+8*i,10+5*i);
        MonsterTurn.whosTurn(MonsterTurn.who(0));
        klasa="Warrior";}

    static void addWizard(){
        c.add(new Mage(420,350,0,450));
        PanelCenter.mage.setVisible(true);
        PanelPlayer.bAtak.setIcon(Icons.atakmage);
        HeaderPanel.border.setIcon(Icons.headermage);
        int i= NextMonster.count;
        ContainerMonster.Stats(500+(150*i),20+8*i,10+5*i);
        MonsterTurn.whosTurn(MonsterTurn.who(3));
        klasa="Mage";}

    static void addAssasin(){
        c.add(new Assasin(420,350,0,450));
        PanelCenter.assasin.setVisible(true);
        PanelPlayer.bAtak.setIcon(Icons.atakassicon);
        HeaderPanel.border.setIcon(Icons.headerassasin);
        int i= NextMonster.count;
        ContainerMonster.Stats(500+(150*i),20+8*i,10+5*i);
        MonsterTurn.whosTurn(MonsterTurn.who());
        klasa="Assasin";}
}
