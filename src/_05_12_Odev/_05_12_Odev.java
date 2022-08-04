package _05_12_Odev;

import java.util.Scanner;

public class _05_12_Odev {
    public static void main(String[] args) {
        //1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("ay no:");
        int ayNo= oku.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("ayNo = " + "ocak"+" 30");break;
            case 2:
                System.out.println("ayNo = " + "şubat"+" 28");break;
            case 3:
                System.out.println("ayNo = " + "mart"+" 31");break;
            case 4:
                System.out.println("ayNo = " + "nisan"+" 30");break;
            case 5:
                System.out.println("ayNo = " + "mayıs"+" 31");break;
            case 6:
                System.out.println("ayNo = " + "haziran"+" 30");break;
            case 7:
                System.out.println("ayNo = " + "temmuz"+" 31");break;
            case 8:
                System.out.println("ayNo = " + "ağustos"+" 31");break;
            case 9:
                System.out.println("ayNo = " + "eylül"+" 30");break;
            case 10:
                System.out.println("ayNo = " + "ekim"+" 31");break;
            case 11:
                System.out.println("ayNo = " + "kasım"+" 30");break;
            case 12:
                System.out.println("ayNo = " + "aralık"+" 31");break;
            default:
                System.out.println("hatalı giriş.");
        }

        //2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner oku1=new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz::");
        int sayi= oku1.nextInt();
        int birlerBas=sayi%10;
        int onlarBas=sayi/10%10;
        int yuzlerBas=sayi/100%10;
        String birYazi="";
        String onYazi="";
        String yuzYazi="";

        switch (birlerBas){
            case 1: birYazi="bir";break;
            case 2: birYazi="iki";break;
            case 3: birYazi="üç";break;
            case 4: birYazi="dört";break;
            case 5: birYazi="beş";break;
            case 6: birYazi="altı";break;
            case 7: birYazi="yedi";break;
            case 8: birYazi="sekiz";break;
            case 9: birYazi="dokuz";break;
        }
        switch (onlarBas){
            case 1: onYazi="on";break;
            case 2: onYazi="yirmi";break;
            case 3: onYazi="otuz";break;
            case 4: onYazi="kırk";break;
            case 5: onYazi="elli";break;
            case 6: onYazi="altmış";break;
            case 7: onYazi="yetmiş";break;
            case 8: onYazi="seksen";break;
            case 9: onYazi="doksan";break;
        }
        switch (yuzlerBas){
            case 1: yuzYazi="yüz";break;
            case 2: yuzYazi="iki yüz";break;
            case 3: yuzYazi="üç yüz";break;
            case 4: yuzYazi="dört yüz";break;
            case 5: yuzYazi="beş yüz";break;
            case 6: yuzYazi="altı yüz";break;
            case 7: yuzYazi="yedi yüz";break;
            case 8: yuzYazi="sekiz yüz";break;
            case 9: yuzYazi="dokuz yüz";break;
        }

        System.out.println("yazı ile = " + yuzYazi+" "+onYazi+" "+birYazi);

        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.

        int min=20;
        int max=80;
        int random=(int) (Math.random()*((max-min)+1))+min;
        int birlerBsmk=random%10;

        switch (birlerBsmk){
            case 0: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 1: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 2: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 3: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 4: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 5: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 6: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 7: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 8: System.out.println("birlerBsmk = " + birlerBsmk);break;
            case 9: System.out.println("birlerBsmk = " + birlerBsmk);break;
        }
    }
}
