package _05_27_Odev;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        //12-changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
        HashSet<String> liste=new HashSet<>();
        Collections.addAll(liste,"banana","strawberry","kiwi","pineapple","melon");
        Scanner input=new Scanner(System.in);
        System.out.print("hangi kelimeyi değiştirmek istersiniz?:");
        String k1= input.nextLine();
        System.out.print("hangi kelime ile değissin?:");
        String k2= input.nextLine();

        System.out.println("yeni hali = " + changeSet(liste,k1,k2));



    }
    public static HashSet<String>changeSet(HashSet<String>liste, String k1,String k2){
        if (liste.contains(k1)){
            liste.remove(k1);
            liste.add(k2);}
        return liste;
    }
}
