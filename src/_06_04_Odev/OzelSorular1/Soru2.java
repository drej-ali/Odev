package _06_04_Odev.OzelSorular1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Soru2 {
    public static void main(String[] args) {
        //2- String bir array verildiğinde;
        //Eger String Orange içeriyorsa bütün Orange leri Apple çeviriniz.
        //Örnek:
        //Array : Peach , Berry , Orange , WaterMelon , Orange
        //Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple
        //Arrayi print ediniz.

        ArrayList<String>dizi=new ArrayList<>();
        Collections.addAll(dizi,"Peach","Berry","Orange","WaterMelon","Orange");
        System.out.println("eski dizi = " + dizi);
        if (dizi.contains("Orange"))
            Collections.replaceAll(dizi,"Orange","Apple");
        System.out.println("yeni dizi = " + dizi);




    }
}
