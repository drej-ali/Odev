package _05_27_Odev;

import java.util.ArrayList;
import java.util.Collections;

public class Soru8 {
    public static void main(String[] args) {
        //8-secondMax()  isminde bir method oluşturun.
        //Parametre olarak integer ArrayList.
        //Return tipi int olmalı.
        //ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        //**ÖRN;**
        //ArrayList   --  5,3,4,6,7
        //CEVAP : 6
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(5);liste.add(3);liste.add(4);liste.add(6);liste.add(7);
        System.out.println("secondMax(liste) = " + secondMax(liste));
    }
    public  static int secondMax(ArrayList<Integer> liste){
        Collections.sort(liste);
        int max=liste.get((liste.size()-2));
        return max;
    }
}
