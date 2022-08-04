package Karalama;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        ArrayList<Integer> siparis = new ArrayList<>();
        do {
            System.out.print("****Menü*****\n" +
                    "1-Adana Kebap (55 TL)\n" +
                    "2-Lahmacun (33 TL)\n" +
                    "3-Borsh (33 TL)\n" +
                    "4-Palov (44 TL)\n" +
                    "0-Tamam\n" +
                    "Lütfen Seçiminizi giriniz:");
            secim = input.nextInt();
            switch (secim) {
                case 1:
                    siparis.add(1);
                    break;
                case 2:
                    siparis.add(2);
                    break;
                case 3:
                    siparis.add(3);
                    break;
                case 4:
                    siparis.add(4);
                    break;
                case 0:
                    break;
            }
        } while (secim != 0);

        TechnoKitchen mutfak = new TechnoKitchen();
        for (Integer i : siparis) {
            if (i == 1) mutfak.adanaKebabSiparisi();
            if (i == 2) mutfak.lahmacunSiparisi();
            if (i == 3) mutfak.borshSiparisi();
            if (i == 4) mutfak.palovSiparisi();
        }
        mutfak.siparis();
    }
}
