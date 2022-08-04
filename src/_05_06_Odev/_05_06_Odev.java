package _05_06_Odev;

import java.util.Scanner;

public class _05_06_Odev {
    public static void main(String[] args) {
        //1-Verilen iki int hakkında (num1,  num2),
        //İlk int'i ikinci int'e bölün.
        //Sonucu yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num1= oku.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num2= oku.nextInt();

        System.out.println("bölüm = " + (num1/num2));

        //2-Verilen int ler hakkında, (num1, num2),
        //num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
        //int sonucu yazdırın.

        Scanner oku1=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num3= oku1.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num4= oku1.nextInt();
        int bolum=num3/num4;

        System.out.println("sonuç = " + bolum);

        //3-Verilen 3 double hakkında, (num1 , num2, num3),
        //Bu üç double'ı birbiriyle çarpın ve cevabı  **sonuca** eşitleyin.
        //Sonucu yazdırın.

        Scanner oku2=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        double num5= oku2.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        double num6= oku2.nextInt();
        System.out.print("üçüncü sayıyı giriniz:");
        double num7= oku2.nextInt();

        System.out.println("sonuç = " + (num5*num6*num7));

        //4-Oluşturulmuş olan double'lar hakkında,
        //Bu 4 doubleyi  birbiriyle çarpın ve **sonuca**  eşitleyin.
        //Double sonucu yazdırın.

        Scanner oku3=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        double num8= oku3.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        double num9= oku3.nextInt();
        System.out.print("üçüncü sayıyı giriniz:");
        double num10= oku3.nextInt();
        System.out.print("dördüncü sayıyı giriniz:");
        double num11= oku3.nextInt();

        System.out.println("sonuç = " + (num8*num9*num10*num11));

        //5-Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        //Bu int'leri birbiriyle çarpın ve **sonuca** eşitleyin.
        //**int sonuc** u yazdırın.

        Scanner oku4=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num12= oku4.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num13= oku4.nextInt();
        System.out.print("üçüncü sayıyı giriniz:");
        int num14= oku4.nextInt();
        System.out.print("dördüncü sayıyı giriniz:");
        int num15= oku4.nextInt();

        System.out.println("sonuç = " + (num12*num13*num14*num15));

        //6-Verilen int ler hakkında (num1, num2),
        //num1 'in   num2'ye bölümünden **kalanı, int sonuc'a**  eşitleyin.
        //int sonucu yazdırın.

        Scanner oku5=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num16= oku5.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num17= oku5.nextInt();
        int sonuc=num16%num17;

        System.out.println("kalan = " + sonuc);

        //7-Verilen int ler hakkında (num1 ve num2),
        //num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
        //int sonuc'u yazdırınız.

        Scanner oku6=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num18= oku6.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num19= oku6.nextInt();
        int sonuc1=num18%num19;

        System.out.println("kalan = " + sonuc1);


        //8-Verilen iki int hakkında,
        //num1'in num2'ye bölümünden kalanı yazdırınız.

        Scanner oku7=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num20= oku7.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num21= oku7.nextInt();
        int sonuc2=num20%num21;

        System.out.println("kalan = " + sonuc2);


        //9-Verilen 2 tane int (num1, num2),
        //Int'lerin farkını yazdırın.

        Scanner oku8=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num22= oku8.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num23= oku8.nextInt();

        System.out.println("fark = " + (num22-num23));

        //10-Verilen 4 tane int (num 1, num2 , num3 , num4),
        //Int'leri birbirinden çıkarın.
        //Sonucu yazdırın.

        Scanner oku9=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int num24= oku9.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int num25= oku9.nextInt();
        System.out.print("üçüncü sayıyı giriniz:");
        int num26= oku9.nextInt();
        System.out.print("dördüncü sayıyı giriniz:");
        int num27= oku9.nextInt();

        System.out.println("sonuç = " + (num24-num25-num26-num27));

        // 1- Girilen bir sayının birler basamağını ekrana yazdırınız.

        Scanner oku10=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int num28= oku10.nextInt();

        System.out.println("birler basamağı = " + (num28%10));

        // 2- Girilen bir sayının onlar basamağını ekrana yazdırınız.

        Scanner oku11=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int num29= oku11.nextInt();

        System.out.println("onlar basamağı = " + (num29/10%10));

        // 3- Girilen bir sayının yüzler basamağını ekrana yazdırınız.

        Scanner oku12=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int num30= oku12.nextInt();

        System.out.println("yüzler basamağı = " + (num30/100%10));

        // 4- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.

        Scanner oku13=new Scanner(System.in);
        System.out.print("vize notunuzu giriniz:");
        int vizeNotu= oku13.nextInt();
        System.out.print("final notunuzu giriniz:");
        int finalNotu= oku13.nextInt();

        System.out.println("Ortalama = " + (vizeNotu*0.4+finalNotu*0.6));




    }
}
