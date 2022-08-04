package _05_24_Odev;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //2-"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca
        Scanner input=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= input.nextLine();

        System.out.println("ortaKelime = " + ortaKelime(cumle));

    }
    public static String ortaKelime(String s1){
        String [] dizi=s1.split(" ");
        if (dizi.length%2==0)
            s1="ortada kelime yok";
        else s1=dizi[Math.round(dizi.length)/2];

        return s1;

    }
}
