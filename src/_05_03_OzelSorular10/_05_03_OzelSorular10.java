package _05_03_OzelSorular10;

import java.util.Scanner;

public class _05_03_OzelSorular10 {
    public static void main(String[] args) {
       //10 -  3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı giriniz:");
        String tamAdSoyad= oku.nextLine();
        char ilkHarf=tamAdSoyad.charAt(0);
        char ikinciAdinBasHarfi=tamAdSoyad.charAt(tamAdSoyad.indexOf(" ")+1);
        char soyadinBasHarfi=tamAdSoyad.charAt(tamAdSoyad.lastIndexOf(" ")+1);
        System.out.println("Şifreli İsim = " + ilkHarf+"."+ikinciAdinBasHarfi+"."+soyadinBasHarfi+".");

    }
}
