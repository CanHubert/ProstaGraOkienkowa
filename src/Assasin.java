import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by canhu on 26.04.2017.
 */
public class Assasin extends Characters{

    public Assasin(int width, int height, int x, int y) {
        super(width, height, x, y);

       // setFocusable(true);
        skill1.setIcon(Icons.assassin1);
        skill2.setIcon(Icons.assassin2);
        skill3.setIcon(Icons.assassin3);
        skill4.setIcon(Icons.assassin4);
        skill1.addActionListener(new AssasinListeners());
       // skill1.addKeyListener(new AssasinListeners());
        skill2.addActionListener(new AssasinListeners());
        skill3.addActionListener(new AssasinListeners());
        skill4.addActionListener(new AssasinListeners());




        skill1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (SkillsPoints.skill1level == 0) {
                    Characters.skillheader.setText("Trujące Cięcie - Nie poznano");
                    Characters.skilldescription.setText("Zadaje 150% obrażeń + 15/30/45/60/75%\nza każdy ładunek trucizny powyżej 2.\nZatruwa dwa razy." +
                            "\nCzas odnowienia: 1 tury.\nKoszt: 1PA");
                } else {
                    int i = SkillsPoints.skill1level;
                    Characters.skillheader.setText("Trujące Cięcie - Poziom " + SkillsPoints.skill1level);
                    if (Characters.skill1.isEnabled())
                        Characters.skilldescription.setText("Zadaje 150% (" +
                                (Integer.parseInt(PanelPlayer.tfDmg.getText()) * 150 / 100) + ") +" + (i * 15) + "% za każdy\nładunek powyżej 2.\nZatruwa dwa razy." +
                                "\nCzas odnowienia: 1 tury.\nKoszt: 1PA");
                    else if (!Characters.skill1.isEnabled()) {
                        if (Characters.s1cd < 2 && Characters.s1cd > 0) {
                            Characters.skilldescription.setText("Zadaje 150% (" +
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText()) * 150 / 100) + ") +" + (i * 15) + "% za każdy\nładunek powyżej 2.\nZatruwa dwa razy." +
                                    "\nCzas odnowienia: " + Characters.s1cd + " tury.\nKoszt: 1PA");
                        } else if (Values.currentPA() < 1) Characters.skilldescription.setText("Zadaje 150% (" +
                                (Integer.parseInt(PanelPlayer.tfDmg.getText()) * 150 / 100) + ") +" + (i * 15) + "% za każdy\nładunek powyżej 2.\nZatruwa dwa razy." +
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

        skill2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if (SkillsPoints.skill2level == 0) {
                    Characters.longheader.setText("Absorpcja Trucizny - Nie poznano");
                    Characters.longdesc.setText("Pochłania truciznę przeciwnika,\nlecząc swoje rany.");
                } else {
                    int i = SkillsPoints.skill2level;
                    Characters.longheader.setText("Absorpcja Trucizny - Poziom " + SkillsPoints.skill2level);
                    if (Characters.skill2.isEnabled())
                        Characters.longdesc.setText("Leczy o 5% zdrowia oraz zmniejsza czas " +
                                "trwania trucizny przeciwnika o 2 tury. " +
                                "Dodatkowo leczy o " +
                                (15 + 5 * i) + "pkt. zdrowia za każdy ładunek. " +
                                "Przy 5 ładunkach odnawia 1PA oraz Trujące Cięcie\n" +
                                "Czas odnowienia: 3 tury. " +
                                "Koszt: 2PA");
                    else if (!Characters.skill2.isEnabled()) {
                        if (Characters.s2cd < 4 && Characters.s2cd > 0) {
                            Characters.longdesc.setText("Leczy o 5% zdrowia oraz zmniejsza czas " +
                                    "trwania trucizny przeciwnika o 2 tury. " +
                                    "Dodatkowo leczy o " +
                                    (15 + 5 * i) + "pkt. zdrowia za każdy ładunek. " +
                                    "Przy 5 ładunkach odnawia 1PA oraz Trujące Cięcie\n"+
                                    "Czas odnowienia: " + Characters.s2cd + " tury. Koszt: 3PA");
                        } else if (Values.currentPA() < 2)
                            Characters.longdesc.setText("Leczy o 5% zdrowia oraz zmniejsza czas " +
                                    "trwania trucizny przeciwnika o 2 tury. " +
                                    "Dodatkowo leczy o " +
                                    (15 + 5 * i) + "pkt. zdrowia za każdy ładunek. " +
                                    "Przy 5 ładunkach odnawia 1PA oraz Trujące Cięcie\n"+
                                    "Za mało pkt. akcji!");}}}
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Characters.longheader.setText("");
                Characters.longdesc.setText("");}});

        skill3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                if(SkillsPoints.skill3level==0) {
                    Characters.skillheader.setText("Cios w Plecy - Nie poznano");
                    Characters.skilldescription.setText("Zaatakuj przeciwnika od tyłu ignorując jego pancerz. Zadaje 140/155/170/185/200% obrażeń.");}

                else {
                    int i = SkillsPoints.skill3level;
                    Characters.skillheader.setText("Cios w Plecy - Poziom " + SkillsPoints.skill3level);
                    if (Characters.skill3.isEnabled())
                        Characters.skilldescription.setText("Ignoruje pancerz, zadaje " + (125 + 15 * i) + "% (" +
                                (Integer.parseInt(PanelPlayer.tfDmg.getText()) * (125 + 15 * i)) / 100 + ") obrażeń. " +
                                "Zadaje 2% za każdy ładunek trucizny, nakłada truciznę 2 razy."+
                                "\nCzas odnowienia: 3 tury.\nKoszt: 3PA");
                    else if (!Characters.skill3.isEnabled()) {
                        if (Characters.s3cd < 4 && Characters.s3cd > 0) {
                            Characters.skilldescription.setText("Zadaje " + (125 + 15 * i) + "% (" +
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText()) * (125 + 15 * i)) / 100 + ") obrażeń. " +
                                    "Zadaje 2% za każdy ładunek trucizny, nakłada truciznę 2 razy."+
                                    "\nCzas odnowienia: " + Characters.s3cd + " tury.\nKoszt: 3PA");
                        } else if (Values.currentPA() < 3)
                            Characters.skilldescription.setText("Zadaje " + (125 + 15 * i) + "% (" +
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText()) * (125 + 15 * i)) / 100 + ") obrażeń. " +
                                    "Zadaje 2% za każdy ładunek trucizny, nakłada truciznę 2 razy."+
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
                    Characters.skillheader.setText("Śmierć - Nie poznano");
                    Characters.skilldescription.setText("Zadaje 75/100/125% obrażeń za każdy ładunek. Natychmiast się odnawia po zabiciu przeciwnika.");}

                else {
                    int i= SkillsPoints.skill4level;
                    int c= Poisoned.count;
                    Characters.skillheader.setText("Śmierć - Poziom " + SkillsPoints.skill4level);
                    if(Characters.skill4.isEnabled())
                        Characters.skilldescription.setText("Zadaje "+(200+(50+i*25)*c)+"% ("+
                                (Integer.parseInt(PanelPlayer.tfDmg.getText())*(200+(50+i*25)*c)/100)+") obrażeń. Jeśli zabije przeciwnika, natychmiast się odnawia."+
                                "\nCzas odnowienia: 4 tury.\nKoszt: 3PA");
                    else if(!Characters.skill4.isEnabled()){
                        if(Characters.s4cd<5 && Characters.s4cd>0){
                            Characters.skilldescription.setText("Zadaje "+(200+(50+i*25)*c)+"% ("+
                                    (Integer.parseInt(PanelPlayer.tfDmg.getText())*(200+(50+i*25)*c)/100)+") obrażeń. Jeśli zabije przeciwnika, natychmiast się odnawia."+
                                    "\nCzas odnowienia: "+ Characters.s4cd+" tury.\nKoszt: 3PA");}
                        else if(Values.currentPA()<3)Characters.skilldescription.setText("Zadaje "+(200+(50+i*25)*c)+"% ("+
                                (Integer.parseInt(PanelPlayer.tfDmg.getText())*(200+(50+i*25)*c)/100)+") obrażeń. Jeśli zabije przeciwnika, natychmiast się odnawia."+
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
        PanelPlayer.tfDmg.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfDmg.getText())+6 )));
        PanelPlayer.tfArmor.setText(Integer.toString((Integer.parseInt(PanelPlayer.tfArmor.getText())+1 )));
        HeaderPanel.lHP.setText(Integer.toString((Integer.parseInt(HeaderPanel.lHP.getText())+30 )));
        Values.setMaxhpUp(30);
        PanelCon.setDisplay("HP +30");
        PanelCon.setDisplay("Atak +6");
        PanelCon.setDisplay("Obrona +1");
    }
}
