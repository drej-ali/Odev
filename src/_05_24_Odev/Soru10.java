package _05_24_Odev;

import java.util.Arrays;

public class Soru10 {
    public static void main(String[] args) {
        //10-**isUnique** adında bir method oluşturun.
        //Parametre olarak int array alır.
        // ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
        //örneğin, list isminde bir array'imiz varsa,
        //int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        //Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
        //int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        //Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.
        int[] list1 = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        System.out.println("list1 yineliyor mu = " + isUnique(list1));
        System.out.println("list2 yineliyor mu = " + isUnique(list2));
    }

    public static boolean isUnique(int[] dizi) {
        Arrays.sort(dizi);
        boolean yineliyorMu = false;
        for (int i = 0; i < dizi.length; i++) {
            if (i + 1 < dizi.length) {
                if (dizi[i] == dizi[i + 1])
                    yineliyorMu = true;
            }

        }

        return yineliyorMu;
    }
}
