package _06_04_Odev.OzelSorular1;

public class Soru9 {
    public static void main(String[] args) {
        //9- Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse
        //true değerini yazdırınız.
        //sameFirstLast([1, 2, 3]) → false
        //sameFirstLast([1, 2, 3, 1]) → true
        //sameFirstLast([1, 2, 1]) → true
        //sameFirstLast([1]) → true
        //sadece true veya false print ediniz.
        int[]dizi1={1, 2, 3};
        int[]dizi2={1, 2, 3, 1};
        int[]dizi3={1, 2, 1};
        int[]dizi4={1};
        System.out.println("dogruMu(dizi1) = " + dogruMu(dizi1));
        System.out.println("dogruMu(dizi2) = " + dogruMu(dizi2));
        System.out.println("dogruMu(dizi3) = " + dogruMu(dizi3));
        System.out.println("dogruMu(dizi4) = " + dogruMu(dizi4));

    }
    public static boolean dogruMu(int[]dizi){
        boolean dogruMu = false;
        if (dizi.length>=1&& dizi[0]==dizi[dizi.length-1])
            dogruMu=true;


        return dogruMu;
    }
}
