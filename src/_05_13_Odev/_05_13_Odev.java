package _05_13_Odev;

import java.util.Scanner;

public class _05_13_Odev {
    public static void main(String[] args) {

        //1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz.

        Scanner read=new Scanner(System.in);
        System.out.print("enter number:");
        int number= read.nextInt();
        int sayac=1;
        int carpim=1;

        while (sayac<=number){
            carpim=carpim*sayac;
            sayac++;
        }
        System.out.println("carpim = " + carpim);


        //2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuzç

        int sayac1=1;
        int sayac2=0;
        int tekTop=0;
        int ciftTop=0;

        while (sayac1<=100){
            tekTop=tekTop+sayac1;
            sayac1=sayac1+2;
        }
        while (sayac2<=100){
            ciftTop=ciftTop+sayac2;
            sayac2=sayac2+2;
        }
        System.out.println("tekTop = " + tekTop);
        System.out.println("ciftTop = " + ciftTop);


        //3-  100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.

        int sayac3=99;

        while (sayac3>0) {
            System.out.println(sayac3);
            sayac3=sayac3-2;
        }

        //4-  0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.

        int sayac4=0;

        while (sayac4<=100){
            if (sayac4%4==0 && sayac4%5==0){
                System.out.println("hem 4 hem 5 e tam bölünür = " + sayac4);
            }
            sayac4++;
        }
        // diğer çözüm yolu daha kısası
        for (int p=0; p<=100; p++){
            if (p%4==0 && p%5==0)
                System.out.println("p = " + p);
        }

        //5- Sayı bulmaca oyununu tam hali ile cözünüz.
        //SORU: KULLANICI BİLGİSAYARIN TUTTUĞU BİR SAYIYI
        //BULMAYA ÇALIŞACAK.BİLGİSAYARIN TUTTUĞU SAYIYA
        //TUTULAN SAYI İSMİNİ VERİNİZ.SONRA KULLANICIDAN SAYIYI BULMASINI İSTEYİNİZ.
        //KULLANICI SAYIYI GİRDİKÇE  EĞER TUTULAN SAYIDAN KÜÇÜK İSE EKRANA
        //BÜTÜK YAZINIZ , TERSİ İSE KÜÇÜK YAZINIZ.BİLİRSE TEBRİKLER YAZINIZ.

        Scanner read2 = new Scanner(System.in);
        System.out.print("Kaçtan başlayayım tutmaya:");
        int min = read2.nextInt();
        System.out.print("Kaça kadar tutayım:");
        int max = read2.nextInt();
        int tutulanSayi = (int) (Math.random() * (max - min) + 1) + min;
        System.out.print("Kaç tahmin hakkınız olsun:");
        int hak= read.nextInt();
        int sayac5 = 1;

        Scanner read1 = new Scanner(System.in);
        System.out.print("TAHMİNİNİZ:");
        int tahmin = read1.nextInt();

        while (sayac5 <= (hak-1)) {
            if (tahmin == tutulanSayi) {
                System.out.println("TEBRİKLER"+sayac5+"."+"TAHMİNİNİZDE BİLDİNİZ.");
                break;
            }

            if (tahmin > tutulanSayi) {
                System.out.println("KÜÇÜK GİRİNİZ");
            }

            if (tahmin < tutulanSayi) {
                System.out.println("BÜYÜK GİRİNİZ");
            }

            sayac5++;
            System.out.print("YENİ TAHMİNİNİZ:");
            tahmin = read1.nextInt();
        }
        if (sayac5 == hak) System.out.println("HAKKINIZ DOLDU");

        // diğer çözüm yolu

        Scanner oku=new Scanner(System.in);
        int tutulanSayii=(int) Math.random()*10;
        int tahmn=0;
        do {
            System.out.println("sayı giriniz:");
            tahmn= oku.nextInt();
            if (tahmn<tutulanSayii)
                System.out.println("büyük giriniz");
            if (tahmn>tutulanSayii)
                System.out.println("küçük giriniz");
            if (tahmn==tutulanSayii){
                System.out.println("tebrikler");break;}
            if (tahmn==10){
                System.out.println("hakkınız doldu");break;}
            tahmn++;

        }while (tutulanSayii!=tahmn );
    }


}


