package _05_05_Odev;

import java.util.Scanner;

public class _05_05_Odev {
    public static void main(String[] args) {

        //1-Girilen bir cümlenin ilk ve son harfini bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle= oku.nextLine();

        System.out.println("cumlenin ilk ve son harfi = " + cumle.charAt(0)+"-"+cumle.charAt(cumle.length()-1));

        //2-Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız

        Scanner oku1=new Scanner(System.in);
        System.out.print("3 kelimelik bir cümle giriniz:");
        String cumle1= oku1.nextLine();

        System.out.println("kelimelere ayrılmış hali = " + cumle1.substring(0,cumle1.indexOf(" "))// ilk kelime
                +"-"+cumle1.substring(cumle1.indexOf(" ")+1,cumle1.indexOf(" ",cumle1.indexOf(" ")+1))//ikinci kelime
                +"-"+cumle1.substring(cumle1.indexOf(" ",cumle1.indexOf(" ")+1)+1));//üçüncü kelime
        
        //3-Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz

        Scanner oku2=new Scanner(System.in);
        System.out.print("3 kelimelik bir cümle giriniz:");
        String cumle2= oku2.nextLine();

        System.out.println("kelimelerin ilk harfleri = " + cumle2.charAt(0) //ilk kelimenin baş harfi
                +" "+cumle2.charAt(cumle2.indexOf(" ")+1) // ikinci kelimenin baş harfi
                +" "+cumle2.charAt(cumle2.indexOf(" ",cumle2.indexOf(" ")+1)+1));

        //4-Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.

        Scanner oku3=new Scanner(System.in);
        System.out.print("bir kelime giriniz:");
        String kelime= oku3.nextLine();

        System.out.println("B harfi var mı?: = " + kelime.toUpperCase().contains("B"));


        //5-Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567

        Scanner oku4=new Scanner(System.in);
        System.out.print("16 haneli kart numaranızı giriniz:");
        String kartNo=oku4.nextLine();

        System.out.println("şifreli kart no = " + "**** **** ****"+" "+kartNo.substring(15));

        //6-Girilen bir cümledeki son kelimeyi bulunuz

        Scanner oku5=new Scanner(System.in);
        System.out.print("bir cümle giriniz:");
        String cumle3= oku.nextLine();

        System.out.println("cumledeki son kelime = " + cumle3.substring(cumle3.lastIndexOf(" ")+1));



    }
}
