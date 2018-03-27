import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by canhu on 17.04.2017.
 */
public class WarriorListeners implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn= (JButton)e.getSource();
        String n =btn.getName();
        switch (n) {
            case "s1": {
                WarriorMethods.skill1();Methods.Victory();}break;
            case "s2": {
                WarriorMethods.skill2();}break;
            case "s3": {
                WarriorMethods.skill3();Methods.Victory();}break;
            case "s4": {
                WarriorMethods.skill4();Methods.Victory();} break;}}


}
