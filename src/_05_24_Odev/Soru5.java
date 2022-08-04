package _05_24_Odev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        //5-getSum isminde bir method oluşturun.
        //Parametresi ArrayList'tir.
        //Dizideki tüm $ ları kaldır ve tüm sayıları topla
        //return yaptğımız veri tipi 'int' olmalıdır.
        //sonuç 0'dan küçükse, -1 yazdırın.
        //Örnek1:
        //ArrayList = $13, $15, $20
        //Cevap = 48 olmalı
        //Örnek 2 :
        //ArrayList= $-13, $0, $0
        //Cevap = -1 olmalı.
        Scanner input=new Scanner(System.in); String cevap="";
        ArrayList<String> dizi=new ArrayList<>();
        do {System.out.print("eklenecek elemanı yazınız:");
            dizi.add(input.nextLine());
            System.out.print("eklemeye devam etmek istiyor musunuz(E/H)?:");
            cevap= input.nextLine();
        }while (cevap.equalsIgnoreCase("E"));
        System.out.println("getSum(dizi) = " + getSum(dizi));
    }
    public static int getSum(ArrayList<String> dizi) {
        ArrayList<String> temizDizi = new ArrayList<>();
        int toplam=0;
        for (int i = 0; i < dizi.size(); i++) {
            temizDizi.add(dizi.get(i).replaceAll("[$]",""));
            toplam+=Integer.parseInt(temizDizi.get(i));
        }
        if (toplam<0)
            toplam=-1;
        return toplam;
    }
}
