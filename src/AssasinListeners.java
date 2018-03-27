import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by canhu on 27.04.2017.
 */
public class AssasinListeners implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn= (JButton)e.getSource();
        String n =btn.getName();
        switch (n) {
            case "s1": {
                AssasinMethods.skill1();Methods.Victory();}break;
            case "s2": {
                AssasinMethods.skill2();}break;
            case "s3": {
                AssasinMethods.skill3();Methods.Victory();}break;
            case "s4": {
                AssasinMethods.skill4();Methods.Victory();} break;}
    }
}
