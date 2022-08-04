package _05_27_Odev;

import java.util.ArrayList;
import java.util.Collections;

public class Soru5 {
    public static void main(String[] args) {
        //5-rotateList() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        //Tersten yazılmış halini return edin.
        //Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        //cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
        ArrayList<String> liste=new ArrayList<>();
        liste.add("Ohio");
        liste.add("Florida");
        liste.add("Atlanta");
        liste.add("New york");
        liste.add("New jersey");
        System.out.println("eski hali = " + liste);
        System.out.println("ters hali = " + rotateList(liste));


    }
    public static ArrayList<String> rotateList(ArrayList<String> liste){
        Collections.reverse(liste);
        return liste;
    }
}
