import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.blue;
import static java.awt.Color.red;

/**
 * Created by canhu on 16.04.2017.
 */
public class SkillsUpsListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn= (JButton)e.getSource();
        String n =btn.getName();
        switch (n){
            case "0":{
                PanelCon.setDisplay("przycisk 1");
                SkillsPoints.skill1up(); }break;
            case "1":{
                PanelCon.setDisplay("przycisk 2");
                SkillsPoints.skill2up();}break;
            case "2":{
                PanelCon.setDisplay("przycisk 3");
                SkillsPoints.skill3up();}break;
            case "3":{
                PanelCon.setDisplay("przycisk 4");
                SkillsPoints.skill4up();}break;}}
}
