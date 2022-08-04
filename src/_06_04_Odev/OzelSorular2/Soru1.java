package _06_04_Odev.OzelSorular2;

import java.util.ArrayList;
import java.util.Collections;

public class Soru1 {
    public static void main(String[] args) {
        //1- Parametresi int ve return tipi int olan power4 isminde method verilmiştir.
        //power4 metodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayınız.
        //Örnek:
        //parameter int is 1234
        //1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256
        //result 354 olmalı.
        int sayi=1234;
        System.out.print(power4(sayi));
    }
    public static int power4(int sayi){
        int sonuc=0;
        String sayıStr=String.valueOf(sayi);
        String [] dizi=sayıStr.split("");
        for (int i = 0; i < dizi.length; i++) {
            sonuc+=Math.pow(Integer.parseInt(dizi[i]),4);}
        return sonuc;
    }
}
