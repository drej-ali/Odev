package _05_27_Odev;

import java.util.ArrayList;

public class Soru2 {
    public static void main(String[] args) {
        //2-getSum() isminde bir method oluşturun.
        //Parametresi ArrayList olmalı
        //Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);

        System.out.println("listenin toplamı = " + getSum(liste));;
    }
    public static int getSum(ArrayList<Integer> liste){
        int toplam=0;
        for (int i = 0; i < liste.size(); i++) {
            toplam= toplam + liste.get(i);
        }
        return toplam;
    }
}
