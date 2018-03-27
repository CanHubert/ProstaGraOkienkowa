import javax.swing.*;
import java.awt.*;

/**
 * Created by canhu on 12.04.2017.
 */
public class PanelCon extends JPanel {
    private static JTextArea display;
    static JButton bEnd;

    public PanelCon(int width, int height,int x, int y){
        setLayout(null);
        setSize(width,height);
        setLocation(x,y);
        setBackground(Color.yellow);

        bEnd = new JButton("Koniec Tury");
        bEnd.setName("end");
        bEnd.setBounds(0,0,width-680,height);
        bEnd.setForeground(Color.black);
        bEnd.setBackground(Color.white);
        bEnd.setFont(new Font("SansSerif", Font.BOLD, 24));
        bEnd.addActionListener(new Actions());
        add(bEnd);

        display = new JTextArea("     -----------Tura 1-----------\n");
        display.setFont(new Font("SansSerif", Font.BOLD, 20));
        display.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setBounds(220,0,width-220,height);
        add(scrollPane);}

    public static String getDisplay() {
        return display.getText();}

    public static void setDisplay(String s) {
        PanelCon.display.setText(getDisplay()+"\n     "+s);}

    public static void clearDisplay() {
        PanelCon.display.setText("");}
}
