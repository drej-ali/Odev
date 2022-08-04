package _06_20_Odev.Soru3;

import java.util.ArrayList;

public abstract class Phone {
    ArrayList<String > cart=new ArrayList<>();

    int getSum(ArrayList<String >list){
        int toplam = 0;
        for (String l:list) {
            toplam+=Integer.parseInt(l.replaceAll("[^0-9]",""));
        }
        return toplam;
    }
    abstract void options(String hafiza,String ekran);
}
