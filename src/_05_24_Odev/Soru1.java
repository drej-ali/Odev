package _05_24_Odev;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //1-Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.
        Scanner input=new Scanner(System.in);
        System.out.print("kaça kadar sayı tutalım:");
        int max= input.nextInt();
        System.out.println("randomNum = " + randomNum(max));
    }
    public static int randomNum(int max){
        int random=(int)(Math.random()*max+1);
        return random;
    }
}
