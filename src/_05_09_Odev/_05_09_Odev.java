package _05_09_Odev;

import java.util.Locale;
import java.util.Scanner;

public class _05_09_Odev {
    public static void main(String[] args) {
        //1- Girilen 1 sayının onlar basamağının tek olup olmadıüını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("en az iki basamaklı sayı giriniz:");
        int s1= oku.nextInt();
        if (s1/10%2==1){System.out.println("s1 = " + "TEK");}
        if (s1/10%2==0){System.out.println("s1 = " + "ÇİFT");}

        //2- Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.
        Scanner oku1=new Scanner(System.in);
        System.out.print("şifrenizi giriniz:");
        String sifre= oku1.nextLine();
        if (sifre.equalsIgnoreCase("bayrak")){System.out.println("sifre = " + "DOĞRU");}

        //3- Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.
        Scanner oku2=new Scanner(System.in);
        System.out.print("bir kelime giriniz:");
        String kelime= oku2.nextLine();
        char ilkHarf=kelime.charAt(0);
        char sonHarf=kelime.charAt(kelime.length()-1);
        if (ilkHarf==sonHarf){System.out.print("ilk ve son harf aynı.");}
        if (ilkHarf!=sonHarf){System.out.print("ilk ve son harf farklı.");}

        //4- Girilen bir kelimede A harfinin olup olmadığını yazdırınız.
        Scanner oku3=new Scanner(System.in);
        System.out.print("bir kelime giriniz:");
        String kelime1= oku3.nextLine();
        if (kelime1.contains("A")){System.out.println("kelimede A harfi bulunuyor.");}

        //5- Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.
        Scanner oku4=new Scanner(System.in);
        System.out.print("1. kelimeyi giriniz:");
        String k1= oku4.nextLine();
        System.out.print("2. kelimeyi giriniz:");
        String k2= oku4.nextLine();
        if (k1.length()==k2.length()){System.out.println("her iki kelime aynı uzunluktadır.");}
        if (k1.length()!=k2.length()){System.out.println("her iki kelime farklı uzunluktadır.");}

        //6- Kullanıcının bir yeni şifre girmesini isteyiniz, şifrenin uzunluğu 8 den küçük ise, şifreniz kabul edilmedi yazsın.
        Scanner oku5=new Scanner(System.in);
        System.out.print("yeni şifrenizi giriniz:");
        String password = oku5.nextLine();
        if (password.length()<8){System.out.print("şifreniz kabul edilmedi.");}
        if (password.length()>=8){System.out.print("şifreniz kabul edildi.");}


    }
}
