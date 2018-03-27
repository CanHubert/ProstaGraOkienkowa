import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by canhu on 16.04.2017.
 */
public class Warrior extends Characters {


    public Warrior(int width, int height, int x, int y) {
        super(width, height, x, y);


        skill1.setIcon(Icons.wars1);
        skill2.setIcon(Icons.wars2);
        skill3.setIcon(Icons.wars3);
        skill4.setIcon(Icons.wars4);
        skill1.addActionListener(new WarriorListeners());
        skill2.addActionListener(new WarriorListeners());
        skill3.addActionListener(new WarriorListeners());
        skill4.addActionListener(new WarriorListeners());

        skill1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(SkillsPoints.skill1level==0) {
                    Characters.skillheader.setText("Skill1 poziom " + SkillsPoints.skill1level);
                    Characters.skilldescription.setText("Zadaje 110/120/130/140/150% obrażeń + 20/40/60/80/100." +
                            "\nCzas odnowienia: 2 tury.\nKoszt: 1PA");}

                else {
                    int i= SkillsPoints.skill1level;
                    Characters.skillheader.setText("Skill1 poziom " + SkillsPoints.skill1level);
                    if(Characters.skill1.isEnabled())
                        Characters.skilldescription.setText("Zadaje "+(100+10*i)+"% ("+
                                (Integer.parseInt(PanelPlayer.tfDmg.getText())*(10+i*1)/10)+") +"+ (i*20)+" obrażeń."+
                                "\nCzas odnowienia: 2 tury.\nKoszt: 1PA");
                    else if(!Characters.skill1.isEnabled()){
                        if(Characters.s1cd<3 && Characters.s1cd>0){
                            Characters.skilldescription.setText("Zadaje "+(100+10*i)+"% ("+
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText())*(10+i*1)/10)+") +"+ (i*20)+" obrażeń."+
                                    "\nCzas odnowienia: "+ Characters.s1cd+" tury.\nKoszt: 1PA");}
                        else if(Values.currentPA()<1)Characters.skilldescription.setText("Zadaje "+(100+10*i)+"% ("+
                                (Integer.parseInt(PanelPlayer.tfDmg.getText())*(10+i*1)/10)+") +"+ (i*20)+" obrażeń."+
                                "\nZa mało pkt. akcji!");}}

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Characters.skillheader.setText("");
                Characters.skilldescription.setText("");
            }
        });
        skill2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(SkillsPoints.skill2level==0) {
                    Characters.skillheader.setText("Jeszcze nie poznano.");
                    Characters.skilldescription.setText("Naucz sie tej umiejetości!");}

                else {
                    int i= SkillsPoints.skill2level;
                    Characters.skillheader.setText("Postawa Obronna - Poziom " + SkillsPoints.skill2level);
                    if(Characters.skill2.isEnabled())
                        Characters.skilldescription.setText("Leczy o "+(2+i)+"% zdrowia oraz \nzmniejsza otrzymywane obrażenia \nprzez dwie tury o "+
                                WarriorMethods.skill2effect()+"%"+
                                "\nCzas odnowienia: 3 tury.\nKoszt: 2PA");
                    else if(!Characters.skill2.isEnabled()){
                        if(Characters.s2cd<4 && Characters.s2cd>0){
                            Characters.skilldescription.setText("Leczy o "+(2+i)+"% zdrowia oraz \nzmniejsza otrzymywane obrażenia \nprzez dwie tury o "+
                                    WarriorMethods.skill2effect()+"%"+
                                    "\nCzas odnowienia: "+ Characters.s2cd+" tury.\nKoszt: 3PA");}
                        else if(Values.currentPA()<2)Characters.skilldescription.setText("Leczy o "+(2+i)+"% zdrowia oraz \nzmniejsza otrzymywane obrażenia \nprzez dwie tury o "+
                               WarriorMethods.skill2effect()+"%"+
                                "\nZa mało pkt. akcji!");
                    }
//                    Characters.skilldescription.setText("Leczy o "+(2+i)+"% zdrowia oraz \nzmniejsza otrzymywane obrażenia \nprzez dwie tury o "+
//                                    WarriorMethods.skill2effect()+"%"+
//                            "\nCzas odnowienia: 3 tury.\nKoszt: 2PA.");
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Characters.skillheader.setText("");
                Characters.skilldescription.setText("");
            }
        });
        skill3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(SkillsPoints.skill3level==0) {
                    Characters.skillheader.setText("Jeszcze nie poznano.");
                    Characters.skilldescription.setText("Naucz sie tej umiejetości!");}

                else {
                    int i = SkillsPoints.skill3level;
                    Characters.skillheader.setText("Skill3 poziom " + SkillsPoints.skill3level);
                    if (Characters.skill3.isEnabled())
                        Characters.skilldescription.setText("Zadaje " + (90 + 21 * i) + "% (" +
                                (Integer.parseInt(PanelPlayer.tfDmg.getText()) * (90 + 21 * i)) / 100 + ") +" + (i * 30) + " obrażeń." +
                                "\nCzas odnowienia: 3 tury.\nKoszt: 2PA");
                    else if (!Characters.skill3.isEnabled()) {
                        if (Characters.s3cd < 4 && Characters.s3cd > 0) {
                            Characters.skilldescription.setText("Zadaje " + (90 + 21 * i) + "% (" +
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText()) * (90 + 21 * i)) / 100 + ") +" + (i * 30) + " obrażeń." +
                                    "\nCzas odnowienia: " + Characters.s3cd + " tury.\nKoszt: 2PA");
                        } else if (Values.currentPA() < 2)
                            Characters.skilldescription.setText("Zadaje " + (90 + 21 * i) + "% (" +
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText()) * (90 + 21 * i)) / 100 + ") +" + (i * 30) + " obrażeń." +
                                    "\nZa mało pkt. akcji!");
                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Characters.skillheader.setText("");
                Characters.skilldescription.setText("");
            }
        });
        skill4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(SkillsPoints.skill4level==0) {
                    Characters.skillheader.setText("Jeszcze nie poznano.");
                    Characters.skilldescription.setText("Naucz sie tej umiejetości!");}

                else {
                    int i= SkillsPoints.skill4level;
                    Characters.skillheader.setText("Miażdzące Uderzenie - Poziom " + SkillsPoints.skill4level);
                    if(Characters.skill4.isEnabled())
                        Characters.skilldescription.setText("Zadaje "+(25+5*i)+"% brakującego zdrowia\nprzeciwnika +"+ ((Integer.parseInt(PanelPlayer.tfDmg.getText())*25*(1+i) + 10000*i))/100+ " obrażeń."+
                            "\nCzas odnowienia: 4 tury.\nKoszt: 3PA");
                    else if(!Characters.skill4.isEnabled()){
                        if(Characters.s4cd<5 && Characters.s4cd>0){
                            Characters.skilldescription.setText("Zadaje "+(25+5*i)+"% brakującego zdrowia\nprzeciwnika +"+ ((Integer.parseInt(PanelPlayer.tfDmg.getText())*25*(1+i) + 10000*i))/100+" obrażeń."+
                                    "\nCzas odnowienia: "+ Characters.s4cd+" tury.\nKoszt: 3PA");}
                        else if(Values.currentPA()<3)Characters.skilldescription.setText("Zadaje "+(25+5*i)+"% brakującego zdrowia\nprzeciwnika +"+((Integer.parseInt(PanelPlayer.tfDmg.getText())*25*(1+i) + 10000*i))/100+" obrażeń."+
                                "\nZa mało pkt. akcji!");
                    }

                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Characters.skillheader.setText("");
                Characters.skilldescription.setText("");
            }
        });

    }
    static void nextlevel(){
        PanelPlayer.tfDmg.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfDmg.getText())+4 )));
        PanelPlayer.tfArmor.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfArmor.getText())+3 )));
        HeaderPanel.lHP.setText(Integer.toString((Integer.parseInt(HeaderPanel.lHP.getText())+45 )));
        Values.setMaxhpUp(45);
        PanelCon.setDisplay("HP +45");
        PanelCon.setDisplay("Atak +4");
        PanelCon.setDisplay("Obrona +3");
    }
}
