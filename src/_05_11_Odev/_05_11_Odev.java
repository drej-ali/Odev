package _05_11_Odev;

import java.util.Scanner;

public class _05_11_Odev {
    public static void main(String[] args) {

        //1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        //bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("nokta ile küsuratlı bir sayı giriniz:");
        String s1= oku.nextLine();

        String tamKismi=s1.substring(0,s1.indexOf("."));
        String ondalikKismi=s1.substring(s1.indexOf(".")+1);

        System.out.println("birleşik hali = " + tamKismi+"."+ondalikKismi);


        //2- Girilen bir sayı
        //Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        Scanner oku1=new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int s2= oku1.nextInt();

        if (s2%9==0 && s2%5==0){
            System.out.println("Able to divide by 9 and 5");}
        if (s2%4==0 && s2%5==0){
            System.out.println("Able to divide by 4 and 5");}

        //3- Girilen 3 sayıdan en küçük olanını bulunuz.
        Scanner oku2=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int a= oku2.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        int b= oku2.nextInt();
        System.out.print("üçüncü sayıyı giriniz:");
        int c= oku2.nextInt();

        System.out.println("büyük olan sayı = " + Math.max(a,Math.max(b,c)));

        //4-Girilen bir string
        //Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        //Aksi halde (else) "no money" yazdırın.

        Scanner oku3=new Scanner(System.in);
        System.out.print("cümle giriniz:");
        String cumle= oku3.nextLine();

        if (cumle.contains("€")){
            System.out.println("This is euro");}
        if (cumle.contains("$")){
            System.out.println("This is dollar");}


        // 5-Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        //Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        //Eğer ortalama not >=90% =>not=A
        //Eğer ortalama not >= 70% ve<90% => not=B
        //Eğer ortalama not >=50% ve <70% =>not=C
        //Eğer ortalama not <50% =>note=F
        //Aşağıdaki örnek çıktıya bakın:
        //int Quiz_score: 80
        //int mid_term_score: 68
        //int Final_score: 90
        //print (Your grade is B)
        // (Notunuz B'dir)

        Scanner oku4=new Scanner(System.in);
        System.out.print("quiz notunuzu giriniz:");
        int quizNotu= oku4.nextInt();
        System.out.print("ara sınav notunuzu giriniz:");
        int araSinavNotu= oku4.nextInt();
        System.out.print("final notunuzu giriniz:");
        int finalNotu= oku4.nextInt();

        int ort=(quizNotu+araSinavNotu+finalNotu)/3;

        if (ort>=90){
            System.out.println("not=A");}
        if (ort>=70 && ort<90){
            System.out.println("not=B");}
        if (ort>=50 && ort<70){
            System.out.println("not=C");}
        if (ort<50){
            System.out.println("not=F");}

    }
}
