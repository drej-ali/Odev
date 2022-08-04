package _06_20_Odev.Soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        int num1= input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num2= input.nextInt();
        Sum toplam=new Sum();
        System.out.println("toplam = " + toplam.calculating(num1,num2));;
        Divide bolum=new Divide();
        System.out.println("divibolumde = " + bolum.calculating(num1,num2));
        Multiply carpim=new Multiply();
        System.out.println("carpim = " + carpim.calculating(num1,num2));
        Substract fark=new Substract();
        System.out.println("fark = " + fark.calculating(num1,num2));

    }
}
