package _05_24_Odev;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //4-adı  reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır:  yazın Java
        //Örnek 2:
        //Dize: Sakin olun ve evde kalın
        //dönüş olmalı: kalın evde ve olun sakin
        Scanner input=new Scanner(System.in);
        System.out.print("cumle giriniz:");
        String cumle= input.nextLine();

        reverseWord(cumle);
    }
    public static void reverseWord(String s1){
        String tersDizi[]= s1.split(" ");
        for (int i = tersDizi.length-1; i >=0; i--) {
            System.out.print(tersDizi[i]+" ");
        }
    }
}
