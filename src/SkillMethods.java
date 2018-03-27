/**
 * Created by canhu on 27.04.2017.
 */
public class SkillMethods {
    static void unlocknewskill(){//aktywuje jeszcze nie używany skill na początku tury
        if(Characters.s1cd==0 && SkillsPoints.skill1level>0)
            Characters.skill1.setEnabled(true);
        if(Characters.s2cd==0 && SkillsPoints.skill2level>0)
            Characters.skill2.setEnabled(true);
        if(Characters.s3cd==0 && SkillsPoints.skill3level>0)
            Characters.skill3.setEnabled(true);
        if(Characters.s4cd==0 && SkillsPoints.skill4level>0)
            Characters.skill4.setEnabled(true);}

    static void cooldown(){
        //jezeli cd jest wieksze niz 0
        if(Characters.s1cd > 0){
            //zmniejsz cd o 1
            Characters.s1cd--;
            if((Characters.s1cd)==0){
                //jesli jest 0 to odblokuj skill, usun tekst o CD
                Characters.skill1.setEnabled(true);
                Characters.cd1.setText(null);}
            else{
                //jezeli dalej nie jest 0 zmien tekst CD
                Characters.cd1.setText("("+String.valueOf(Characters.s1cd)+")");}}
        if(Characters.s2cd > 0){
            Characters.s2cd--;
            if((Characters.s2cd)==0){
                Characters.skill2.setEnabled(true);
                Characters.cd2.setText(null);}
            else{
                Characters.cd2.setText("("+String.valueOf(Characters.s2cd)+")");}}
        if(Characters.s3cd > 0){
            Characters.s3cd--;
            if((Characters.s3cd)==0){
                Characters.skill3.setEnabled(true);
                Characters.cd3.setText(null);}
            else{
                Characters.cd3.setText("("+String.valueOf(Characters.s3cd)+")");}}
        if(Characters.s4cd > 0){
            Characters.s4cd--;
            if((Characters.s4cd)==0){
                Characters.skill4.setEnabled(true);
                Characters.cd4.setText(null);}
            else{
                Characters.cd4.setText("("+String.valueOf(Characters.s4cd)+")");}}}
}
