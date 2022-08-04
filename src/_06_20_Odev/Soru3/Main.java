package _06_20_Odev.Soru3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputStr=new Scanner(System.in);
        Scanner inputInt=new Scanner(System.in);
        System.out.print("Hangi marka olsun?\nApple için 1'i\nSamsung için 2'yi\nTuşlayın=");
        int secim=inputInt.nextInt();

        if (secim==1){
            Apple apple=new Apple();
            System.out.print("Hafızası ne kadar olsun?\n(64 GB-128 GB)=");
            String hafiza= inputStr.nextLine();
            System.out.print("Ekran boyutu ne olsun?\n(5.5-6.5 inch)=");
            String ekran= inputStr.nextLine();
            apple.options(hafiza,ekran);
            System.out.println("Apple telefonunuzun ücreti = $" + apple.getSum(apple.cart));
        }
        if (secim==2){
            Samsung samsung=new Samsung();
            System.out.print("Hafızası ne kadar olsun?\n(256 GB-512 GB)=");
            String hafiza= inputStr.nextLine();
            System.out.print("Ekran boyutu ne olsun?\n(5.5-6.5-7.5 inch)=");
            String ekran= inputStr.nextLine();
            samsung.options(hafiza,ekran);
            System.out.println("Samsung telefonunuzun ücreti = $" + samsung.getSum(samsung.cart));

        }
    }
}
