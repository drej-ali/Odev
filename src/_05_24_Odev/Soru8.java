package _05_24_Odev;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        //8-powerOfThree isminde bir method oluşturun.
        //Parametre olarak int
        //Return tipi boolean
        //Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        //**Örnek 1:**
        //**Girdi:** 27
        //**Çıktı:** true
        //Açıklama: 3*3*3 =27
        //Sonuç= true
        //**Örnek 2:**
        //**Girdi:** 0
        //**Çıktı:** false
        //**Örnek 3:**
        //**Girdi:** 9
        //**Çıktı:** true
        Scanner input=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= input.nextInt();
        System.out.println("üssü mü = " + powerOfThree(sayi));



    }
    public static boolean powerOfThree(int s){
        boolean ussuMu=false;
        for (int i = 1; i <= s; i++) {
            if (Math.pow(3,i)==s)
                ussuMu=true;
        }
        return ussuMu;
   }
}
