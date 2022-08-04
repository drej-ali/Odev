package _05_24_Odev;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //3-reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ
        Scanner input=new Scanner(System.in);
        System.out.print("string giriniz:");
        String kel= input.nextLine();
        reverseString(kel);
    }
    public static void reverseString(String s1){

        for (int i = s1.length()-1; i >=0; i--) {
            System.out.print(s1.charAt(i));
        }
    }
}
