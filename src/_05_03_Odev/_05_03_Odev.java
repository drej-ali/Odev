package _05_03_Odev;

public class _05_03_Odev {
    public static void main(String[] args) {

        //1-**I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.

        String s1="I love java";
        int karakterSayisi=s1.length();
        System.out.println("karakterSayisi = " + karakterSayisi);

        //2-**Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.

        String  s2="Spirit planning";
        int krktrSys=s2.length();
        System.out.println("krktrSys = " + krktrSys);

        //3-**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.

        String s3="apple";
        boolean varMi=s3.contains("app");
        System.out.println("varMi = " + varMi);

        //4-**orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String  s4="orange";
        System.out.println("s4.equals(\"Apple\") = " + s4.equals("Apple"));

        //5-**apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        // _Büyük harf veya küçük harf önemli değildir._

        String  s5="apple";
        System.out.println("s5.equals(\"apple\") = " + s5.equalsIgnoreCase("apple"));

        //6-**Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        String s6="Florida";
        System.out.println("s6.indexOf(\"o\") = " + s6.indexOf("o"));

        //7-**Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        String s7="Thank you";
        System.out.println("konumdaki y = " + s7.charAt(s7.indexOf("y")));

        //8-**Main method** oluşturun.
        //**Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

        String s8="Mouse";
        System.out.println("s8.charAt(3) = " + s8.charAt(2));
    }
}
