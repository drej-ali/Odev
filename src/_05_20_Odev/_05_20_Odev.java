package _05_20_Odev;

import java.util.Scanner;

public class _05_20_Odev {
    public static void main(String[] args) {
        //1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız. Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.
        int[] dizi = new int[4];
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz:");
            dizi[i] = oku.nextInt();
            int enk = dizi[0];
            int enb = dizi[0];

            if (dizi[i] > enb)
                enb = dizi[i];
            if (dizi[i] < enk)
                enk = dizi[i];
            if ((i+1) == dizi.length)
                System.out.println("fark = " + (enb-enk));
        }

        //2- 2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
        //  sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.

        String[][] tablo = new String[2][3];
        Scanner read = new Scanner(System.in);
        int toplam = 0;

        for (int satır = 0; satır < 2; satır++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(satır + "-" + sutun + ". ucreti giriniz;");
                tablo[satır][sutun] = read.nextLine();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                toplam += Integer.parseInt(tablo[i][j].replaceAll("[^0-9]", ""));
            }
        }
        System.out.println("toplam = $" + toplam);

    }
}
