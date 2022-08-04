package _06_04_Odev.OzelSorular2;

import java.util.Collections;
import java.util.HashSet;

public class Soru5 {
    public static void main(String[] args) {
        //5- Parametresi Set String olan ve Set içindeki Stringlerin uzunluklarının toplamını döndüren
        //getTotalLength metodunu yazınız.
        //return total
        //Örnek:
        //Set String "repl" "is" "homework"
        //result 14 olmalı
        //NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİRİNİZ.
        HashSet<String> hs=new HashSet<>();
        Collections.addAll(hs,"repl","is","homework");
        System.out.println("getTotalLength(hs) = " + getTotalLength(hs));
    }
    public static int getTotalLength(HashSet<String >hs){
        String[]dizi=hs.toArray(new String[0]);
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i].length();
        }
        if (toplam==0)
            toplam=-1;
        return toplam;
    }
}
