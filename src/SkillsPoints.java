/**
 * Created by canhu on 16.04.2017.
 */
public class SkillsPoints {

    static int skillpoint=1;
    static int skill1level=0,skill2level=0,skill3level=0,skill4level=0;


    static void skill1up(){
        skill1level++;
        hideUp();
        switch(GameApp.klasa){
            case "Warrior":{
                switch (skill1level){
                    case 1:{
                        Warrior.skill1.setIcon(Icons.wars11);
                        if(Values.currentPA()>0){
                            Characters.skill1.setEnabled(true);}}break;
                    case 2:{Warrior.skill1.setIcon(Icons.wars12);}break;
                    case 3:{Warrior.skill1.setIcon(Icons.wars13);}break;
                    case 4:{Warrior.skill1.setIcon(Icons.wars14);}break;
                    case 5:{Warrior.skill1.setIcon(Icons.wars15);}break;}
            }break;
            case "Mage":{
                switch (skill1level){
                    case 1:{
                        Mage.skill1.setIcon(Icons.mage11);
                        if(Values.currentPA()>0){
                            Characters.skill1.setEnabled(true);}}break;
                    case 2:{Mage.skill1.setIcon(Icons.mage12);}break;
                    case 3:{Mage.skill1.setIcon(Icons.mage13);}break;
                    case 4:{Mage.skill1.setIcon(Icons.mage14);}break;
                    case 5:{Mage.skill1.setIcon(Icons.mage15);}break;}

            }break;
            case "Assasin":{
                switch (skill1level){
                    case 1:{
                        Assasin.skill1.setIcon(Icons.assassin11);
                        if(Values.currentPA()>0){
                            Characters.skill1.setEnabled(true);}}break;
                    case 2:{Assasin.skill1.setIcon(Icons.assassin12);}break;
                    case 3:{Assasin.skill1.setIcon(Icons.assassin13);}break;
                    case 4:{Assasin.skill1.setIcon(Icons.assassin14);}break;
                    case 5:{Assasin.skill1.setIcon(Icons.assassin15);}break;}
            }break;}}

    static void skill2up(){
        skill2level++;
        hideUp();
        switch(GameApp.klasa){
            case "Warrior" :{
                switch (skill2level){
                    case 1:{
                        Warrior.skill2.setIcon(Icons.wars21);
                        if(Values.currentPA()>1){
                            Characters.skill2.setEnabled(true);}}break;
                    case 2:{Warrior.skill2.setIcon(Icons.wars22);}break;
                    case 3:{Warrior.skill2.setIcon(Icons.wars23);}break;
                    case 4:{Warrior.skill2.setIcon(Icons.wars24);}break;
                    case 5:{Warrior.skill2.setIcon(Icons.wars25);}break;}
            }break;
            case "Mage" : {
                switch (skill2level){
                    case 1:{
                        Mage.skill2.setIcon(Icons.mage21);
                        if(Values.currentPA()>1){
                            Characters.skill2.setEnabled(true);}}break;
                    case 2:{Mage.skill2.setIcon(Icons.mage22);}break;
                    case 3:{Mage.skill2.setIcon(Icons.mage23);}break;
                    case 4:{Mage.skill2.setIcon(Icons.mage24);}break;
                    case 5:{Mage.skill2.setIcon(Icons.mage25);}break;}

            }break;
            case "Assasin" : {
                switch (skill2level){
                    case 1:{
                        Assasin.skill2.setIcon(Icons.assassin21);
                        if(Values.currentPA()>1){
                            Characters.skill2.setEnabled(true);}}break;
                    case 2:{Assasin.skill2.setIcon(Icons.assassin22);}break;
                    case 3:{Assasin.skill2.setIcon(Icons.assassin23);}break;
                    case 4:{Assasin.skill2.setIcon(Icons.assassin24);}break;
                    case 5:{Assasin.skill2.setIcon(Icons.assassin25);}break;}
            }break;}}

    static void skill3up(){
        skill3level++;
        hideUp();
        switch(GameApp.klasa){
            case "Warrior" :{
                switch (skill3level){
                    case 1:{
                        Warrior.skill3.setIcon(Icons.wars31);
                        if(Values.currentPA()>1){
                            Characters.skill3.setEnabled(true);}}break;
                    case 2:{Warrior.skill3.setIcon(Icons.wars32);}break;
                    case 3:{Warrior.skill3.setIcon(Icons.wars33);}break;
                    case 4:{Warrior.skill3.setIcon(Icons.wars34);}break;
                    case 5:{Warrior.skill3.setIcon(Icons.wars35);}break;}
            }break;
            case "Mage" :{
                switch (skill3level){
                    case 1:{
                        Mage.skill3.setIcon(Icons.mage31);
                        if(Values.currentPA()>1){
                            Characters.skill3.setEnabled(true);}}break;
                    case 2:{Mage.skill3.setIcon(Icons.mage32);}break;
                    case 3:{Mage.skill3.setIcon(Icons.mage33);}break;
                    case 4:{Mage.skill3.setIcon(Icons.mage34);}break;
                    case 5:{Mage.skill3.setIcon(Icons.mage35);}break;}
            }break;
            case "Assasin" :{
                switch (skill3level){
                    case 1:{
                        Assasin.skill3.setIcon(Icons.assassin31);
                        if(Values.currentPA()>2){
                            Characters.skill3.setEnabled(true);}}break;
                    case 2:{Assasin.skill3.setIcon(Icons.assassin32);}break;
                    case 3:{Assasin.skill3.setIcon(Icons.assassin33);}break;
                    case 4:{Assasin.skill3.setIcon(Icons.assassin34);}break;
                    case 5:{Assasin.skill3.setIcon(Icons.assassin35);}break;}
            }break;}}

    static void skill4up(){
        skill4level++;
        hideUp();
        switch(GameApp.klasa){
            case "Warrior" :{
                switch (skill4level){
                    case 1:{
                        Warrior.skill4.setIcon(Icons.wars41);
                        if(Values.currentPA()>2){
                            Characters.skill4.setEnabled(true);}}break;
                    case 2:{Warrior.skill4.setIcon(Icons.wars42);}break;
                    case 3:{Warrior.skill4.setIcon(Icons.wars43);}break;}}break;
            case "Mage" :{
                switch (skill4level){
                    case 1:{
                        Mage.skill4.setIcon(Icons.mage41);
                        if(Values.currentPA()>2){
                            Characters.skill4.setEnabled(true);}}break;
                    case 2:{Mage.skill4.setIcon(Icons.mage42);}break;
                    case 3:{Mage.skill4.setIcon(Icons.mage43);}break;}
            }break;
            case "Assasin" : {
                switch (skill4level){
                    case 1:{
                        Assasin.skill4.setIcon(Icons.assassin41);
                        if(Values.currentPA()>2){
                            Characters.skill4.setEnabled(true);}}break;
                    case 2:{Assasin.skill4.setIcon(Icons.assassin42);}break;
                    case 3:{Assasin.skill4.setIcon(Icons.assassin43);}break;}
            }break;}}

    static private void hideUp(){
        skillpoint--;
        int lv= Integer.parseInt(HeaderPanel.lNrpoz.getText());
        if(skillpoint==0) {
            Characters.add1.setVisible(false);
            Characters.add2.setVisible(false);
            Characters.add3.setVisible(false);
            Characters.add4.setVisible(false);}
        else{
            if(skill1level<5) {
                if (((skill1level * 2) + 1) > lv) {
                    Characters.add1.setVisible(false);}}
            else{
                Characters.add1.setVisible(false);}
            if(skill2level<5) {
                if (((skill2level * 2) + 1) > lv) {
                    Characters.add2.setVisible(false);}}
            else{
                Characters.add2.setVisible(false);}
            if(skill3level<5) {
                if (((skill3level * 2) + 1) > lv) {
                    Characters.add3.setVisible(false);}}
            else{
                Characters.add3.setVisible(false);}
            if(skill4level<3){
                if(((skill4level*5)+6)> lv){
                    Characters.add4.setVisible(false);}}
            else{
                Characters.add4.setVisible(false);}}}

    static void lvup(){
        skillpoint++;
        int lv= Integer.parseInt(HeaderPanel.lNrpoz.getText());
        //max 3 poziom
        if(skill4level<3){
            if(((skill4level*5)+6)<=lv){
                Characters.add4.setVisible(true);}}
        //max 5 poziom skill
        if(skill1level<5) {
            //skill co 2 poziom (1,3,5,7,9)
            if (((skill1level * 2) + 1) <= lv) {
                Characters.add1.setVisible(true);}}
        if(skill2level<5) {
            if (((skill2level * 2) + 1) <= lv) {
                Characters.add2.setVisible(true);}}
        if(skill3level<5) {
            if (((skill3level * 2) + 1) <= lv) {
                Characters.add3.setVisible(true);}}}
}
