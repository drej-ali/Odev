package _04_29_Odev;

import java.util.Scanner;

public class _04_29_Odev {
    public static void main(String[] args) {
        //1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("isminizi giriniz:");
        String username=oku.nextLine();
        System.out.println(username);
        //2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        System.out.print("sayı giriniz:");
        int sayi=oku.nextInt();
        System.out.println(sayi);
        //3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        Scanner oku1=new Scanner(System.in);
        System.out.print("bir meyve yazınız:");
        String meyve=oku1.nextLine();
        System.out.println(meyve);
        //4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("arabanız kaç kapılı:");
        int kapıSayisi= oku1.nextInt();
        System.out.println(kapıSayisi);
        //5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        Scanner oku2=new Scanner(System.in);
        System.out.print("10 sene evvel hangi şehirde yaşıyordunuz:");
        String sehir=oku2.nextLine();
        System.out.println(sehir);
        //6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.print("doğum gününüz:");
        String dogumGunu=oku2.next();
        System.out.println(dogumGunu);
        //7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
        //   Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        System.out.print("bir banka hesabınız var mı:");
        boolean varMi=oku2.nextBoolean();
        System.out.println(varMi);
        //8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        System.out.print("bir ağırlık yazınız(kg):");
        byte agirlik= oku.nextByte();
        System.out.println(agirlik);
        //9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        System.out.print("boyunuzu girniz(cm):");
        float boy= oku.nextFloat();
        System.out.println(boy);
    }
}
