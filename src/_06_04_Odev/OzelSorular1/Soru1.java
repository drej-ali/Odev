package _06_04_Odev.OzelSorular1;

import java.util.ArrayList;

public class Soru1 {
    //1- Aşağıdaki düzende tek line verilen 5 adet eleman , aşağıdaki okuma ile
    //ilki 3 ,ikincisi 2 elemanlı 2 adet diziye atılmaktadır.Bu kod vardır.
    //İkinci dizinin tüm elemanları 1.nin içerisinde var ise true, yok ise false
    //gönderiniz.
    //1 2 3 2 3 → 1.dizi : 1,2,3 2.Dizi : 2,3 => true
    //10 20 3 1 2 → 1.dizi : 10 20 3 2.Dizi : 1,2 => false
    //1 2 3 1 2 → 1.dizi : 1 2 3 2.Dizi : 1 2 => true
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 2, 3};
        ArrayList<Integer> dz1 = new ArrayList<>();
        ArrayList<Integer> dz2 = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {
            if (i < 3) dz1.add(dizi[i]);
            else dz2.add(dizi[i]);
        }
        if (dz1.contains(dz2.get(0)) && dz1.contains(dz2.get(1)))
        System.out.print("true");


    }
}
