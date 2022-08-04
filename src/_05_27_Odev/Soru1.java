package _05_27_Odev;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
            //1-ismi getCount() olan bir method oluşturun.
            //Parametre olarak bir String ArayList  ve  bir tane String
            //Return tipi int olmalı.
            //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
            //Örneğin;
            //ArrayList = Orange , Kiwi , Peach , Banana , Orange
            //String Orange:
            //Count = 2 olmalı. (Orange 2 kez yazılmış)
            Scanner input = new Scanner(System.in);
            ArrayList<String> liste = new ArrayList<>();
            liste.add("orange");
            liste.add("kiwi");
            liste.add("peach");
            liste.add("banana");
            liste.add("orange");
            while (true){
            System.out.print("Hangi kelimeye bakmak istersiniz:");
            String kelime = input.nextLine();
            System.out.println("listede tekrar sayısı = " + getCount(kelime, liste));
        }}

        public static int getCount(String kelime, ArrayList<String> liste) {
            int tekrar = 0;
            for (int i = 0; i < liste.size(); i++) {
                if (liste.get(i).equalsIgnoreCase(kelime))
                    tekrar++;}
            return tekrar;
        }
    }


