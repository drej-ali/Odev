package _05_27_Odev;

import java.util.ArrayList;

public class Soru3 {
    public static void main(String[] args) {
        //3-getLength() isminde bir method oluşturun.
        //Parametre olarak String ArrayList
        //Return tipi Integer ArrayList
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //Örneğin;
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın;
        //cevap: 10 ,  8 , 4 , 7 , 6 olmalı
        ArrayList<String> liste=new ArrayList<>();
        liste.add("New Jersey");
        liste.add("New york");
        liste.add("Ohio");
        liste.add("Florida");
        liste.add("Boston");

        System.out.println("uzunluk = " + getLength(liste));


    }
    public static ArrayList<Integer> getLength( ArrayList<String > liste){
        ArrayList<Integer> uzunlukListesi=new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            uzunlukListesi.add(liste.get(i).length());
        }

        return uzunlukListesi;

    }
}
