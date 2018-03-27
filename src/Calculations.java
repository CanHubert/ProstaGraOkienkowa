/**
 * Created by canhu on 23.04.2017.
 */
public class Calculations {
    static int att=1, def=1;


    static int aPrice(){
        double price = 9+((att+4)*(att+4))/15;
        return (int)price;
    }

    static int dPrice(){
        double price = 10+(def*def)/15;
        return (int)price;
    }

    static void a_add(){
        att++;
        PanelPlayer.buyDmg.setText("Cena: "+aPrice()+"  złota");
    }

    static void d_add(){
        def++;
        PanelPlayer.buyArmor.setText("Cena: "+dPrice()+"  złota");
    }

    static int expNeed(int lv){
        return ((lv+6)*(lv+6))/10;
    }

    static int expSum(int lv){
        int suma=0;
        for(int i=2; i <=lv; i++){
            suma+=expNeed(i);
        }
        return suma;
    }

    static String printexp(){
        String s= String.valueOf(Values.getExp()-Calculations.expSum(Values.getLevel()));
        return "("+s+"/"+Calculations.expNeed(Values.getLevel()+1)+")";
    }

    static int calcLv(){
        int x=1,suma,lv = 0;

        do {
            x++;
            suma=0;
            for(int i=2; i <=x; i++){
                suma+=expNeed(i);
                lv=i;
            }

        } while (Values.getExp()>=suma);
        return lv-1;
    }

}
