import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by canhu on 08.04.2017.
 */
public class NewGame extends JFrame implements ActionListener{

    private final ButtonGroup postac;
    private final JRadioButton rbWarrior, rbWizard, rbAssasin;
    private JLabel picture;
    private JTextField setName;
    private MyJButton start;
    private GameApp ga;
    private Font serif= new Font("SansSerif", Font.BOLD, 16);

    public NewGame(){
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Nowa gra");


        start = new MyJButton("Start");
        start.setBounds(100,75,100,25);
        start.addActionListener(this);
        add(start);

        setName= new JTextField();
        setName.setBounds(30,30,200,25);
        setName.setFont(serif);
        add(setName);

        int X=30, Y=120;
        postac = new ButtonGroup();
        rbWarrior= new JRadioButton("Wojownik",true);
        rbWarrior.setBounds(X,Y,100,20);
        rbWizard = new JRadioButton("Mag",false);
        rbWizard.setBounds(X,Y+30,50,20);
        rbAssasin = new JRadioButton("Zabójca",false);
        rbAssasin.setBounds(X,Y+60,70,20);

        postac.add(rbWarrior);
        postac.add(rbWizard);
        postac.add(rbAssasin);
        add(rbWarrior);
        add(rbWizard);
        add(rbAssasin);

        picture= new JLabel();
        picture.setBounds(X-15,Y+100,350,220);
        picture.setIcon(Icons.bladeknight);
        add(picture);

        rbWizard.addActionListener(e -> picture.setIcon(Icons.mage));
        rbWarrior.addActionListener(e-> picture.setIcon(Icons.bladeknight));
        rbAssasin.addActionListener(e -> picture.setIcon(Icons.assasin));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();

        if(source==start){
            ga= new GameApp(setName.getText());
            ga.setVisible(true);
            if(rbWarrior.isSelected()) GameApp.addWarrior();
            else if(rbWizard.isSelected()) GameApp.addWizard();
            else if(rbAssasin.isSelected()) GameApp.addAssasin();
            }
        dispose();}
}


