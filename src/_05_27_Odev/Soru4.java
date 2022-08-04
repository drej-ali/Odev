package _05_27_Odev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Soru4 {
    public static void main(String[] args) {
        //4-İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //   Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList
        //Örneğin;
        //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //s1 = blue
        //s2 = yellow
        //Tüm blue 'ları yellow'a dönüştürün.
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
        ArrayList<String> liste=new ArrayList<>();
        liste.add("yellow");
        liste.add("red");
        liste.add("blue");
        liste.add("red");
        liste.add("blue");
        System.out.println("eski hali = " + liste);
        System.out.println("yeni hali = " + changelnArraylist(liste,"blue","yellow"));
    }
    public static ArrayList<String > changelnArraylist(ArrayList<String> liste,String s1,String s2){
        Collections.replaceAll(liste,"blue","yellow");

        return liste;

    }
}
