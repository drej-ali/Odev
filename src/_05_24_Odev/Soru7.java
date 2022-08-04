package _05_24_Odev;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        //7-addDigits isminde bir method oluşturun.
        //Parametresi int
        //Return tipi de int
        //Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
        //Tek basamaklı çıktığında, döndürün
        //**Örnek1:**
        //**Girdi** `38`
        //**Çıktı:** 2
        //**Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
        //             2 , tek basamaklı olduğundan, bunu döndürün.
        Scanner input = new Scanner(System.in);
        System.out.print("pozitif sayı giriniz:");
        int sayi = input.nextInt();
        while (sayi > 10) {
            sayi = addDigits(sayi);
        }
        System.out.println("sayi = " + sayi);
    }

    public static int addDigits(int s1) {
        String sayiStr = String.valueOf(s1);
        String[] sayiDizi = sayiStr.split("");
        int[] dizi = new int[sayiDizi.length];
        for (int i = 0; i < sayiDizi.length; i++) {
            dizi[i] = Integer.parseInt(sayiDizi[i]);
        }
        return toplam(dizi);
    }

    public static int toplam(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        return toplam;
    }
}
