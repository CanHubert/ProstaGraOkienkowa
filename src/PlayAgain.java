import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by canhu on 15.04.2017.
 */
public class PlayAgain implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        PanelPlayer.tfDmg.setText("12");
        PanelPlayer.tfArmor.setText("1");
        PanelPlayer.tfGold.setText("5");
        PanelPlayer.tfPunktyakcji.setText("3");
        HeaderPanel.lHP.setText("100");
        btn.setEnabled(false);
    }
}
