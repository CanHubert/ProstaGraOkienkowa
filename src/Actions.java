import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by canhu on 08.04.2017.
 */
public class Actions implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        String button=btn.getName();
        switch (button){
            case "atak":{
                Methods.Atakuj();}break;
            case "lecz":{
                Methods.Lecz();
            PanelPlayer.bLecz.setEnabled(false);}break;
            case "end":{
                TurnMethods.endTurn();}break;
            case "Att+":{
                Values.setAtak(1);
                PanelCon.setDisplay("Atak +1");
                Values.pay(Calculations.aPrice());
                Calculations.a_add();
                Methods.spendgold();}break;
            case "Def+":{
                Values.setDef(1);
                PanelCon.setDisplay("Obrona +1");
                Values.pay(Calculations.dPrice());
                Calculations.d_add();
                Methods.spendgold();}break;}}
}

