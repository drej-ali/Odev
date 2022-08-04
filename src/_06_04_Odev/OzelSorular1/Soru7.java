package _06_04_Odev.OzelSorular1;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru7 {
    public static void main(String[] args) {
        //7- Verilen int arrayde;
        //duplicated(tekrarlanan) öğeleri array den kaldırınız.
        //non-duplicated(tekrarlanmayan) öğeleri print ediniz.
        //Örnek:
        //Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
        //result [1,2,3,4,5] olmalı
        //NOT: resultu print ederken for loop kullanmayınız.
        //System.out.println(Arrays.toString(your_array_name)); kullanınız.
        int[] dizi={1,2,2,2,3,3,3,4,4,4,5,5,5};

        System.out.println("Arrays.toString(tekrariSil(dizi)) = " + Arrays.toString(tekrariSil(dizi)));
        

    }
    public static Integer[] tekrariSil(int[] dizi){
        ArrayList<Integer>aDizi=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (i< (dizi.length-1)){
                if (dizi[i]==dizi[i+1]);
                else aDizi.add(dizi[i]);}
        }
        aDizi.add(dizi[dizi.length-1] );
        Integer[] yeniDizi = new Integer[aDizi.size()];
        yeniDizi=aDizi.toArray(yeniDizi);
        return yeniDizi;
    }
}
