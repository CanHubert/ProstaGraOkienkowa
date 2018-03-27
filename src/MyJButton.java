import javax.swing.*;
import java.awt.*;

/**
 * Created by canhu on 21.03.2017.
 */
public class MyJButton extends JButton {
    MyJButton(String name){
        super();
        setText(name);
        setFont(new Font("SansSerif", Font.BOLD, 16));
       // setForeground(Color.BLUE);

    }
}
