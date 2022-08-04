package _06_04_Odev.OzelSorular2;

public class Soru6 {
    public static void main(String[] args) {
        //6- İnteger array ‘numaralar’ ve integer ‘toplam’ verilmistir.
        //Verilen array’de toplami, integer ‘toplam’ a esit olan kac cift numara bulunduğunu hesaplayınız.
        //Örnek:
        //int[] numaralar = {1, 9, 5, 14, 2, 0, 4};
        //Int toplam = 6;
        //Verilen array’de toplami 6 olan çift sayisini bulmalıyız.
        //Toplami 6 olan ciftler = [1, 5] ve [2, 4] dur. Toplami 6 olan iki adet ciftimiz var.
        //Result 2 olmali!

        int[] numaralar = {1, 9, 5, 14, 2, 0, 4};
        int toplam = 6;
        System.out.println("sonuc(numaralar) = " + sonuc(numaralar));

    }public static int sonuc(int[]dizi){
        int sonuc=0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i]+dizi[j]==6)
                    sonuc++;
            }
        }
        return sonuc/=2;
    }
}
