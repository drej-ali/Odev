package _06_04_Odev.OzelSorular1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soru8 {
    public static void main(String[] args) {
        //8- Verilen String arrayde;
        //String arrayi ters çeviriniz.
        //ters arrayi yazdırınız.
        //NOT:
        //Arrays.toString(your_array_name); <--- kullanınız.
        String[]dizi={"a","b","c","d","e"};

        System.out.println("Arrays.toString(tersCevir(dizi) = " + Arrays.toString(tersCevir(dizi)));
    }
    public static String[] tersCevir(String[] dizi){
        ArrayList<String > aDizi=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            aDizi.add(dizi[i]);
        }
        Collections.sort(aDizi);
        Collections.reverse(aDizi);
        String[] yeniDizi = new String[aDizi.size()];
        yeniDizi=aDizi.toArray(yeniDizi);
        return yeniDizi;


    }
}
