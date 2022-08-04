package _05_18_Odev;

import java.util.Locale;
import java.util.Scanner;

public class _05_18_Odev {
    public static void main(String[] args) {
        //1-String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.

        String[] kelimeler = {"Apple", "Orange", "Banana", "Pineapple"};

        for (int i = 0; i < kelimeler.length; i++) {
            boolean varMi = kelimeler[i].equalsIgnoreCase("apple");

            if (varMi == true)
                System.out.println("varMi = " + varMi);
        }

        //2-int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] dizi = {12, 2, 5, 15, 8};
        int enb = dizi[0];

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enb)
                enb = dizi[i];
        }
        System.out.println("en büyük = " + enb);

        //3-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] dizi1 = {14, 19, 5, 21};
        int enk = dizi1[0];

        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i] < enk)
                enk = dizi1[i];
        }
        System.out.println("en küçük = " + enk);

        //4-int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi2 = {15, 25, 22, 18, 30};
        int enb1 = dizi2[0];
        int index = 0;

        for (int i = 0; i < dizi2.length; i++) {
            if (dizi2[i] > enb1) {
                enb1 = dizi2[i];
                index = i;
            }
        }
        enb1 = dizi2[0];


        for (int i = 0; i < dizi2.length; i++) {
            if (dizi2[i] > enb1 && i != index) {
                enb1 = dizi2[i];
            }

        }
        System.out.println("en büyük 2. eleman = " + enb1);


        //5-int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //Eğer sayı çiftse topla, tekse çıkar.
        //**Örneğin:**
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //Toplamlarını yazdırın.

        int[] dizi3 = {5, 6, 8, 12, 14, 19};
        int sonuc = 0;

        for (int i = 0; i < dizi3.length; i++) {
            if (dizi3[i] % 2 == 1)
                sonuc = sonuc - dizi3[i];
            else sonuc = sonuc + dizi3[i];
        }
        System.out.println("sonuc = " + sonuc);

        //7-Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin
        // (ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.
        // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        //Sonuç bu şekilde olmalıdır. [1, 4]

        int[] dizi4 = {1, 2, 3, 4};
        int[] dizi5 = {dizi4[0], dizi4.length};
        System.out.println("yeni dizinin ilk int i = " + dizi5[0]);
        System.out.println("yeni dizinin son int i = " + dizi5[1]);


        //8-int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //Array'in ortalamasını alınız.

        int[] dizi6 = {12, 14, 21, 23, 10, 4};
        int toplam = 0;
        int ort = 0;

        for (int i = 0; i < dizi6.length; i++) {
            toplam = toplam + dizi6[i];
        }
        ort = toplam / dizi6.length;

        System.out.println("ort = " + ort);

        //9-String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.

        String[] kelimeler1 = {"Apple", "Orange", "Banana", "Kiwi"};

        for (int i = 0; i < kelimeler1.length; i++) {
            System.out.println((i + 1) + ". kelime = " + kelimeler1[i]);

        }

        //10-String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"Array'daki eleman sayısını yazdırınız.
        //Cevap 4 olmalı.

        String[] kelimeler2 = {"new jersey", "new york", "boston", "california"};
        System.out.println("dizideki eleman sayısı = " + kelimeler2.length);

        //11-İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] dizi7 = {25, 30, 30, 35, 100};
        int toplam1 = 0;

        for (int i = 0; i < dizi7.length; i++) {
            toplam1 = toplam1 + dizi7[i];
        }
        System.out.println("toplam1 = " + toplam1);

        //12-Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.

        String[] kelimeler3 = new String[5];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < kelimeler3.length; i++) {
            System.out.print((i + 1) + ".  kelimeyi giriniz:");
            kelimeler3[i] = oku.nextLine();
        }

        int eukhs = kelimeler3[0].length();
        String euk ="";


        for (int i = 0; i < kelimeler3.length; i++) {
            if (eukhs < kelimeler3[i].length()) {
                eukhs = kelimeler3[i].length();
                euk = kelimeler3[i];
            }
        }

        System.out.println(euk.charAt(eukhs-1)+euk.substring(1,eukhs-1)+euk.charAt(0));


    }
}
