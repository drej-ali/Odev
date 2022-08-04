package _05_10_Odev;

import java.util.Scanner;

public class _05_10_Odev {
    public static void main(String[] args) {
        //1- Girilen 3 sayıdan büyük olanı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int s1= oku.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int s2= oku.nextInt();
        System.out.print("3. sayıyı giriniz:");
        int s3= oku.nextInt();
        int enb=s1;

        if (s2>enb){ enb=s2;};
        if (s3>enb){ enb=s3;}
        System.out.println("en büyük sayı = " + enb);

        //2- Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.

        Scanner oku1=new Scanner(System.in);
        System.out.print("en az 2 basamaklı bir sayı giriniz:");
        int sayi= oku1.nextInt();

        if (sayi%2==1 && sayi/10%2==1 && sayi%2==sayi/10%2){
            System.out.println("birler ve onlar basamağı hem tek hem eşit");}

        //3- Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.

        Scanner oku2=new Scanner(System.in);
        System.out.print("bir cümle ve ya kelime giriniz.");
        String kelime= oku2.nextLine();

        if (kelime.contains(" ") || kelime.toUpperCase().contains("A")){
            System.out.println("cümle de A harfi veya boşluk var");}








    }
}
