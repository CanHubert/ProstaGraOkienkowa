import javax.swing.*;
import java.awt.*;

/**
 * Created by canhu on 12.04.2017.
 */
public class Characters extends JPanel {
    static int s1cd;
    static int s2cd;
    static int s3cd;
    static int s4cd;
    static int skills=4;
    static int s2last;
    static JButton skill1,skill2,skill3,skill4;
    static JButton add1, add2, add3, add4;
    static JLabel cd1, cd2, cd3, cd4,skillheader,longheader;
    static JTextArea skilldescription,longdesc;


    public Characters(int width, int height, int x, int y){
        setBounds(x,y,width,height);
        setLayout(null);
        setBackground(Color.lightGray);
        Font sarif =new Font("SansSerif", Font.BOLD, 16);
        int desc=25;

        skillheader = new JLabel("");
        skillheader.setBounds(50,desc-10,365,30);
        skillheader.setFont(new Font("SansSerif", Font.BOLD, 22));
        add(skillheader);
        longheader = new JLabel("");
        longheader.setBounds(20,desc-10,365,30);
        longheader.setFont(new Font("SansSerif", Font.BOLD, 22));
        add(longheader);

        skilldescription= new JTextArea("");
        skilldescription.setBounds(40,desc+25,350,120);
        skilldescription.setEditable(false);
        skilldescription.setFont(sarif);
        skilldescription.setBackground(Color.lightGray);
        skilldescription.setLineWrap(true);
        skilldescription.setWrapStyleWord(true);
        add(skilldescription);

        longdesc= new JTextArea("");
        longdesc.setBounds(10,desc+25,380,120);
        longdesc.setEditable(false);
        longdesc.setFont(sarif);
        longdesc.setBackground(Color.lightGray);
        longdesc.setLineWrap(true);
        longdesc.setWrapStyleWord(true);
        add(longdesc);

        int n=225;

        //dodanie przycisków umiejętnosci
        skill1= new JButton();
        skill1.setBounds(14,0+n,92,92);
        add(skill1);
        skill2= new JButton();
        skill2.setBounds(114,0+n,92,92);
        add(skill2);
        skill3= new JButton();
        skill3.setBounds(214,0+n,92,92);
        add(skill3);
        skill4= new JButton();
        skill4.setBounds(314,0+n,92,92);
        skill4.setIcon(null);
        add(skill4);
        skill1.setName("s1");
        skill2.setName("s2");
        skill3.setName("s3");
        skill4.setName("s4");
        skill1.setEnabled(false);
        skill2.setEnabled(false);
        skill3.setEnabled(false);
        skill4.setEnabled(false);
        skill1.addActionListener(new SkillsUpsListener());
        skill2.addActionListener(new SkillsUpsListener());
        skill3.addActionListener(new SkillsUpsListener());
        skill4.addActionListener(new SkillsUpsListener());

        cd1= new JLabel();
        cd2= new JLabel();
        cd3= new JLabel();
        cd4= new JLabel();
        cd1.setFont(sarif);
        cd2.setFont(sarif);
        cd3.setFont(sarif);
        cd4.setFont(sarif);
        cd1.setForeground(Color.yellow);
        cd2.setForeground(Color.yellow);
        cd3.setForeground(Color.yellow);
        cd4.setForeground(Color.yellow);
        cd1.setBounds(4,n+95,92,20);
        cd2.setBounds(104,n+95,92,20);
        cd3.setBounds(204,n+95,92,20);
        cd4.setBounds(304,n+95,92,20);
        cd1.setHorizontalAlignment(SwingConstants.CENTER);
        cd2.setHorizontalAlignment(SwingConstants.CENTER);
        cd3.setHorizontalAlignment(SwingConstants.CENTER);
        cd4.setHorizontalAlignment(SwingConstants.CENTER);
        add(cd1);
        add(cd2);
        add(cd3);
        add(cd4);


        //przyciski zwiekszające poziom umiejętnosci
        add1 = new JButton(Icons.add);
        add2 = new JButton(Icons.add);
        add3 = new JButton(Icons.add);
        add4 = new JButton(Icons.add);
        add1.setName("0");
        add2.setName("1");
        add3.setName("2");
        add4.setName("3");
        add1.setBounds(35,n-35,32,32);
        add2.setBounds(135,n-35,32,32);
        add3.setBounds(235,n-35,32,32);
        add4.setBounds(335,n-35,32,32);
        add1.setBackground(new Color(104, 26, 206));
        add2.setBackground(new Color(104, 26, 206));
        add3.setBackground(new Color(104, 26, 206));
        add4.setBackground(new Color(104, 26, 206));
        add1.addActionListener(new SkillsUpsListener());
        add2.addActionListener(new SkillsUpsListener());
        add3.addActionListener(new SkillsUpsListener());
        add4.addActionListener(new SkillsUpsListener());
        add(add1);
        add(add2);
        add(add3);
        add(add4);
        add1.setToolTipText("<html><font size='4'>Zwiększ o 1 poziom</font></html>");
        add2.setToolTipText("<html><font size='4'>Zwiększ o 1 poziom</font></html>");
        add3.setToolTipText("<html><font size='4'>Zwiększ o 1 poziom</font></html>");
        add4.setToolTipText("<html><font size='4'>Zwiększ o 1 poziom</font></html>");
        //skill 4 dostepny od lv 6
        add4.setVisible(false);

        JLabel border = new JLabel(Icons.characterborder);
        border.setBounds(0,0,width,height);
        add(border);

    }
}
