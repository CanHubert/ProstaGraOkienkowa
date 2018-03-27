import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by canhu on 27.04.2017.
 */
public class Poisoned extends JPanel{
    static JLabel p1,p2,p3,p4,p5;
    static int count, ps1,ps2,ps3,ps4,ps5;
    static Random poison;


    public Poisoned(){
        setSize(215,50);
        setBackground(Color.lightGray);
        setLayout(null);
        p1= new JLabel(Icons.poison);
        p2= new JLabel(Icons.poison);
        p3= new JLabel(Icons.poison);
        p4= new JLabel(Icons.poison);
        p5= new JLabel(Icons.poison);
        int X=10;
        p1.setBounds(X,0,40,40);
        p2.setBounds(X+40,0,40,40);
        p3.setBounds(X+80,0,40,40);
        p4.setBounds(X+120,0,40,40);
        p5.setBounds(X+160,0,40,40);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

    }

    static void Stack(int i) {
        switch (i){
            case 0:{p1.setVisible(false);p2.setVisible(false);p3.setVisible(false);p4.setVisible(false);p5.setVisible(false);}break;
            case 1:{p1.setVisible(true);p2.setVisible(false);p3.setVisible(false);p4.setVisible(false);p5.setVisible(false);}break;
            case 2:{p1.setVisible(true);p2.setVisible(true);p3.setVisible(false);p4.setVisible(false);p5.setVisible(false);}break;
            case 3:{p1.setVisible(true);p2.setVisible(true);p3.setVisible(true);p4.setVisible(false);p5.setVisible(false);}break;
            case 4:{p1.setVisible(true);p2.setVisible(true);p3.setVisible(true);p4.setVisible(true);p5.setVisible(false);}break;
            case 5:{p1.setVisible(true);p2.setVisible(true);p3.setVisible(true);p4.setVisible(true);p5.setVisible(true);}break;
            default:{}}}

    static void addStacks(){
        if(ps1==0) ps1=3;
        else if(ps2==0) ps2=3;
        else if(ps3==0) ps3=3;
        else if(ps4==0) ps4=3;
        else if(ps5==0) ps5=3;
        else if(ps1==1) ps1=3;
        else if(ps2==1) ps2=3;
        else if(ps3==1) ps3=3;
        else if(ps4==1) ps4=3;
        else if(ps5==1) ps5=3;
        else if(ps1==2) ps1=3;
        else if(ps2==2) ps2=3;
        else if(ps3==2) ps3=3;
        else if(ps4==2) ps4=3;
        else if(ps5==2) ps5=3;

        if(count<5) count++;
        Stack(count);
        PanelCon.setDisplay("Zatrułeś przeciwnika.");
    }

    static void removeStacks(){
        if(ps1>0){
            if(ps1==1) count--;
            ps1--;}
        if(ps2>0){
            if(ps2==1) count--;
            ps2--;}
        if(ps3>0){
            if(ps3==1) count--;
            ps3--;}
        if(ps4>0){
            if(ps4==1) count--;
            ps4--;}
        if(ps5>0){
            if(ps5==1) count--;
            ps5--;}
        Stack(count);}

        static void PoisonDmg(int i){
        if(count>0){
            int val= (Values.getMonmaxhp()*count*i)/100;
            PanelMon.lMonHP.setText(String.valueOf(Values.getMonhp()-val));
            PanelCon.setDisplay("Trucizna zadaje "+val+" obrażeń!");
            Methods.MonLWar();
            Methods.Victory();
        }}

        static void NormalAttPoison(){
            int lv= Values.getLevel();
            Poisoned.poison= new Random();
            int ch=Poisoned.poison.nextInt(100);
            if(ch<(50+lv*2)) Poisoned.addStacks();
        }
        static boolean Dodge(){
            poison= new Random();
            int d = poison.nextInt(100);
            int s= count;
            int lv= Values.getLevel();
            if(lv>6){
                if(lv>13){if(d<s*7) return true;}
                if(d<s*6) return true;}
            if(d<s*5) return true;
            else return false;}
}
