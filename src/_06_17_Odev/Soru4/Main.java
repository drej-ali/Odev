package _06_17_Odev.Soru4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        ArrayList<String> AmazonList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Amazon'dan aldığınız ürünlerin fiyatı nedir? : ");
            String price = input.nextLine();
            AmazonList.add(price);
        }
        System.out.println();
        System.out.println("Toplam harcama = "+ amazon.getTheTotal(AmazonList));
        System.out.println("-----------------------------");
        System.out.println("Teslim durumu = " + amazon.isFreeShipping(AmazonList));

        Costco costco = new Costco();
        ArrayList<String> CostcoList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Costco'dan aldığınız ürünlerin fiyatı nedir? : ");
            String price1 = input.nextLine();
            CostcoList.add(price1);
        }
        System.out.println();
        System.out.println("Toplam harcama = "+ costco.getTheTotal(CostcoList));
        System.out.println("-------------------------------");
        System.out.println("Teslim durumu = "+ costco.isFreeShipping(CostcoList));



    }
}
