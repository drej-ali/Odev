package _05_27_Odev;

import java.util.ArrayList;
import java.util.Collections;

public class Soru7 {
    public static void main(String[] args) {
        //7-common_values() isminde bir method oluşturun.
        //Parametre olarak 2 tane Integer ArrayList
        //Return tipi integer ArrayList olmalı
        // İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        //**Örneğin;**
        //ArrayList 1:    3 , 2 , 5 , 6
        //ArrayList 2:     5 , 8 , 9
        //return  5 olmalı
        //**Örneğin;**
        //ArrayList 1: 8,7,9,6,7
        //ArrayList 2: 6,7,12,3,1
        //return 6 ve 7 olmalı
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(3);list1.add(2);list1.add(5);list1.add(6);list1.add(8);list1.add(9);list1.add(0);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(5);list2.add(8);list2.add(9);list2.add(3);list2.add(15);list2.add(11);list2.add(5);
        Collections.sort(list1);
        System.out.println("list1 = " + list1);
        Collections.sort(list2);
        System.out.println("list2 = " + list2);
        System.out.println("ortak liste = " + common_values(list1,list2));
    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> ortakListe=new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i)))
                ortakListe.add(list1.get(i));
            
        }
        return ortakListe;
        
    }
}
