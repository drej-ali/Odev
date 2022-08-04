package _05_27_Odev;

import java.util.HashSet;
import java.util.Set;

public class Soru11 {
    public static void main(String[] args) {
        //11-totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //_**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5
        HashSet<Integer>liste=new HashSet<>();
        liste.add(4);liste.add(2);liste.add(3);liste.add(1);liste.add(7);
        System.out.println("eleman sayısı = " + totalCount(liste));
    }
    public static int totalCount(HashSet<Integer>liste){
        int elemanSayisi=liste.size();
        return elemanSayisi;
    }
}
