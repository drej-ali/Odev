package _06_04_Odev.OzelSorular2;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //3- Parametresi bir tane int (num1) ve return tipi int olan palindromeNum isminde method
        //verilmiştir.
        //Palindrome, bir kelime veya sayının, tıpkı ileri ile aynı şekilde geriye doğru okuduğu anlamına
        //gelir. Örneğin; "mom" , "refer" , "131" , "1221".
        //num1'i ve num1'in tersini ekleyin, sonucu bulun.
        //Sonucun palindrom olup olmadığını kontrol edin.
        //Sonuç bir palindrom numarası değilse, sonucun tersini bulun.
        //Ve sonucu ve sonucun tersine ekleyin, yeni toplamı bulun.
        //Yeni toplamın bir palindrom olup olmadığını kontrol edin.
        //Sonuçlarınızda bir palindrom numarasına ulaşana kadar aynı adımları uygulayın.
        //Palindrom numarasına ulaştıktan sonra, bir palindrome numarasına ulaşmak için aynı işlemi kaç
        //kez yaptığınızı bulun.
        //Return count olmali
        //Örnek:
        //num1 = 349 --> 349 + 943 =1292 Not : 1292 palindrom olmadığından bunun için aynı
        //adımı uygulayın (birinci işlem)
        //1292 + 2921 = 4213 Not : 4213 palindrom değil bunun için aynı adımı yapın
        //(ikinci işlem)
        //4213 + 3124 = 7337 Not : 7337 palindrome (üçüncü işlemde palindroma
        //ulaştınız ve count 3 olur)
        //return 3 olmalı
        //İPUCU: Bu soru için while loop kullanırsanız iyi olur
         Scanner input=new Scanner(System.in);
         System.out.print("sayı giriniz:");
         int num1=input.nextInt();
        System.out.println("yapılacak işlem sayısı = " + palindromeNum(num1));


    }
    public static int tersiBul(int num){
        int tersi=0;
        while (num>0){
            tersi=num%10+tersi*10;
            num/=10;
        }
        return tersi;
    }
    public static int palindromeNum(int num1){
        int count=0; int toplam=0;
        while (num1!=tersiBul(num1)){
            toplam=num1+tersiBul(num1);
            num1=toplam;
            count++;
        }
        return count;

        }
}

