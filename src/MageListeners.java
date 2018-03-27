import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by canhu on 30.04.2017.
 */
public class MageListeners implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn= (JButton)e.getSource();
        String n =btn.getName();
        switch (n) {
            case "s1": {
                MageMethods.skill1();Methods.Victory();}break;
            case "s2": {
                MageMethods.skill2();}break;
            case "s3": {
                MageMethods.skill3();Methods.Victory();}break;
            case "s4": {
                MageMethods.skill4();Methods.Victory();} break;
    }}
}
