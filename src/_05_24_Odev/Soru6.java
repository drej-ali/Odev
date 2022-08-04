package _05_24_Odev;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        //6-EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
        //For example Örnek:
        //String =  "6678421312"
        //6+6-7+8+4+2-1-3-1+2
        //sonuç 16 olmalı
        Scanner input=new Scanner(System.in);
        System.out.print("10 haneli sayıyı giriniz:");
        String sayi= input.nextLine();
        if (sayi.length()==10)
            evenOddNums(sayi);
        else System.out.print("10 haneli sayı giriniz:");


    }
    public static void evenOddNums(String  s){
        int toplam=0;int x=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)%2==0){
                x=s.charAt(i)-'0';
                toplam+=x;
            }
            else {x=s.charAt(i)-'0';
                toplam-=x;
            }
            x=0;

        }
        System.out.println("toplam = " + toplam);

    }
}
