package _05_03_OzelSorular9;

import java.util.Scanner;

public class _05_03_OzelSorular9 {
    public static void main(String[] args) {
        //9-     girilen tamAdSoyad ın  2 kelimelik mi 3 kelimelik mi oldugunu nasıl anlarsınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı giriniz:");
        String tamAdSoyad= oku.nextLine();
        int bastanilkBoslukIndexi=tamAdSoyad.indexOf(" ");
        int sondanIlkBoslukIndexi=tamAdSoyad.lastIndexOf(" ");

        if(bastanilkBoslukIndexi==sondanIlkBoslukIndexi){
            System.out.println("isim 2 kelimelik.");}
        if(bastanilkBoslukIndexi!=sondanIlkBoslukIndexi){
            System.out.println("İsim 3 kelimelik.");
        }

    }
}
