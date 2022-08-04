package _06_04_Odev.OzelSorular1;

import java.util.ArrayList;
import java.util.Collections;

public class Soru4 {
    public static void main(String[] args) {
        //4- Bir veya daha fazla öğe içeren int array verildiğinde, arraydeki en büyük ve en küçük öğeler
        //arasındaki farkı return ediniz.
        //Not: the built-in Math.min(v1, v2) ve Math.max(v1, v2) methodları en küçük ve en büyük
        //öğeleri return eder.
        //bigDiff([10, 3, 5, 6]) → 10-3 result = 7
        //bigDiff([7, 2, 10, 9]) → 10-2 result = 8
        //bigDiff([2, 10, 7, 1]) → 10-1 result = 9
        //return tipi int dir.
        ArrayList<Integer> dizi1=new ArrayList<>();
        Collections.addAll(dizi1,10,3,5,6);
        ArrayList<Integer> dizi2=new ArrayList<>();
        Collections.addAll(dizi2,7,2,10,9);
        ArrayList<Integer> dizi3=new ArrayList<>();
        Collections.addAll(dizi3,2,10,7,1);

        System.out.println("farkıVer(dizi1); = " + farkıVer(dizi1));
        System.out.println("farkıVer(dizi2) = " + farkıVer(dizi2));
        System.out.println("farkıVer(dizi3) = " + farkıVer(dizi3));


    }
    public static int farkıVer(ArrayList<Integer> dizi1){
        Collections.sort(dizi1);
        int fark=dizi1.get(dizi1.size()-1)- dizi1.get(0);
        return fark;
    }
}
