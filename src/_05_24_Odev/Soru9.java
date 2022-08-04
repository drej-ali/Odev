package _05_24_Odev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Soru9 {
    public static void main(String[] args) {
        //9 `append adında bir method oluşturun.`
        //`Parametre olarak iki int array  oluşturun.`
        // ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
        // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
        //Bunu döndürmelidir:
        // {2, 4, 6, 1, 2, 3, 4, 5}.
        int[] dizi1 = {2, 4, 6};
        int[] dizi2 = {1, 2, 3, 4, 5};
        append(dizi1, dizi2);
    }

    public static void append(int[] d1, int[] d2) {

        int yeniDiziLength = d1.length + d2.length;
        int[] yeniDizi = new int[yeniDiziLength];
        for (int i = 0; i < d1.length; i++) {
            yeniDizi[i] = d1[i];
        }
        for (int i = 0; i < d2.length; i++) {
            yeniDizi[d1.length+i]=d2[i];
        }
        System.out.println("dizi1 = " + Arrays.toString(d1));
        System.out.println("dizi2 = " + Arrays.toString(d2));
        System.out.println("yeniDizi = " + Arrays.toString(yeniDizi));

    }
}
