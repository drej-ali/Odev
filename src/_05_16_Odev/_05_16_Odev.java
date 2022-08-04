package _05_16_Odev;

import java.util.Scanner;

public class _05_16_Odev {
    public static void main(String[] args) {
        //1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
        //_Not: 0 ve 100 dahildir._

        System.out.println("0-100 arası çift sayıları yazdırınız:");
        int sayac = 0;
        while (sayac <= 100) {
            System.out.println(sayac);
            sayac = sayac + 2;
        }
        //2- 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //`Sonuç bu şekilde olmalıdır.`
        //0
        //20
        //40
        //60
        //80
        //100
        System.out.println("0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayılar:");
        int sayac1 = 0;

        while (sayac1 <= 100) {
            if (sayac1 % 4 == 0 && sayac1 % 5 == 0) {
                System.out.println("hem 4 hem 5 e tam bölünür = " + sayac1);
            }
            sayac1++;
        }


        //3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
        Scanner read = new Scanner(System.in);
        System.out.print("enter number:");
        int number = read.nextInt();
        int sayac2 = 1;
        int toplam = 0;
        while (sayac2 <= 10) {
            if (number % 2 == 0) {
                toplam = toplam + number;
                System.out.println("toplam = " + toplam);
                sayac2++;
                System.out.print("Yeni sayı giriniz:");
                number = read.nextInt();
            } else break;
        }

        //4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz.

        Scanner read1 = new Scanner(System.in);
        System.out.print("enter number:");
        int number1 = read1.nextInt();
        int a = 0;

        for (a = 0; number1 % 10 > 0; a++) {
            number1 = number1 / 10;
        }
        System.out.println("sayının basamak sayısı:" + a);


        //5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz

        Scanner read2 = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int number2 = read2.nextInt();
        int b = 0;
        int number3 = number2;

        for (b = 0; number2 % 10 > 0; b++) {
            number2 = number2 / 10;
        }

        if (number3 % 10 == number3 / (int) Math.pow(10, b - 1))
            System.out.println("ilk ve son basamaklar eşit");
        else System.out.println("ilk ve son basamaklar eşit değil");


        //6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz.

        Scanner read3 = new Scanner(System.in);
        System.out.print("enter number:");
        int number4 = read3.nextInt();
        int number5 = number4;
        int basamak = 0;
        int tersSayi = 0;
        int v = 0;

        for (basamak = 0; number4 % 10 > 0; basamak++) {
            number4 = number4 / 10;
        }

        while (basamak > 0) {
            tersSayi = tersSayi + number5 / (int) Math.pow(10, basamak - 1) % 10 * (int) Math.pow(10, v);
            basamak--;
            v++;
        }
        System.out.println("tersSayi = " + tersSayi);

        //daha kısası scanner da var üstte tabi
        int tersi = 0;
        while (number4 > 0) {
            int basamk = number4 % 10;
            tersi = tersi * 10 + basamk;
            number4 = number4 / 10;
        }
        System.out.println("tersi = " + tersi);
        //7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)

        Scanner read4 = new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle = read4.nextLine();
        int aSayısı = 0;


        for (int c = 0; c < cumle.length(); c++) {
            if (cumle.charAt(c) == 'a') {
                aSayısı++;
            }
        }
        System.out.println("aSayısı = " + aSayısı);


        //8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

        Scanner read5 = new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle1 = read5.nextLine().trim();
        int boslukSayısı = 0;
        int uzunluk2 = cumle1.length();

        for (int c = 0; c < uzunluk2; c++) {
            if (cumle1.charAt(c) == ' ') {
                boslukSayısı++;
            }
        }
        System.out.println("kelime sayısı = " + (boslukSayısı + 1));


        //9-Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.(Regex kullanmayın)

        Scanner read6 = new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle2 = read6.nextLine();
        int uzunluk3 = cumle2.length();
        int bSayisi = 0;

        System.out.println("kelimelerin baş harfleri: = " + cumle2.charAt(0));

        for (int h = 0; h < uzunluk3; h++)

            if (cumle2.charAt(h) == ' ')
                System.out.println("kelimelerin baş harfleri: = " + cumle2.charAt(h + 1));

        //10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.

        Scanner read7 = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi = read7.nextInt();
        int sayac6 = 1;

        while (sayac6 <= 10) {
            System.out.print((sayac + 1) + ". sayıyı giriniz:");
            int sayi1 = read7.nextInt();
            sayac6++;

            if (sayi1 > sayi) break;
        }
    }
}
