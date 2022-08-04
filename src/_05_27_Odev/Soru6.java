package _05_27_Odev;

import java.util.ArrayList;

public class Soru6 {
    public static void main(String[] args) {
        //6-hillNum() isminde bir method oluşturun.
        //Parametre olarak Integer ArrayList
        //Return tipi int,
        //Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
        //Örneğin;
        //ArrayList  5,4,6,2,1
        //2, 6'dan küçük ve 1 den büyüktür.
        //Return 2 olmalı.
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(4);
        liste.add(6);
        liste.add(2);
        liste.add(1);

        System.out.println("istenen sayı = " + hillNum(liste));

    }

    public static int hillNum(ArrayList<Integer> liste) {
        int sayi = 0;
        for (int i = 1; i < liste.size()-1; i++) {
            if (  liste.get(i) < liste.get(i - 1) && liste.get(i) > liste.get(i + 1))
                sayi = liste.get(i);

        }

        return sayi;
    }
}
