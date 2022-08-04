package _05_04_Odev;

import java.util.Locale;
import java.util.Scanner;

public class _05_04_Odev {
    public static void main(String[] args) {
        //1-**paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE

        String text="paper";
        System.out.println("orijinal hali = " + text);
        System.out.println("büyük harfli hali = " + text.toUpperCase());

        //2-**OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple

        String text1="OraNge";
        System.out.println("orijinal hali = " + text1);
        System.out.println("küçük harfli hali = " + text1.toLowerCase());
        
        //3-**New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın

        String text2="New Jersey";
        System.out.println("orijinal hali = " + text2);
        System.out.println("büyük harfli hali = " + text2.toUpperCase());
        
        //4-**New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.
        String text3="New York";
        System.out.println("orijinal hali = " + text3);
        System.out.println("küçük harfli hali = " + text3.toLowerCase());
        
        //5-**PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.

        String text4="PADDLE";
        System.out.println("orijinal hali = " + text4);
        System.out.println("küçük harfli hali = " + text4.toLowerCase());

        //6-**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.

        String text5="apple";
        boolean varMi=text5.contains("app");
        System.out.println("içinde 'app' var mı = " + varMi);
        
        //Özel sorular
        //1- Girilen bir cümlede kaç kelime olduğunuz bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String text6=oku.nextLine();
        System.out.println("orjinal hali = " + text6);

        int uzunluk1=text6.length();
        int uzunluk2=text6.replaceAll(" ","").length();
        System.out.println("kelime sayısı = " + ((uzunluk1-uzunluk2)+1));

        //2- Girilen bir cumledeki kelimeleri ilk harflerini yazdırınız

        Scanner oku1=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String text7= oku1.nextLine();

        System.out.println("text7 = " + text7);
        System.out.println("cümledeki kelimelerin ilk harfleri = " + text7.replaceAll("^ [a-z]",""));


    }
}