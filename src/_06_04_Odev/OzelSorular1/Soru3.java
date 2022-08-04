package _06_04_Odev.OzelSorular1;

public class Soru3 {
    public static void main(String[] args) {
        //3- a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye
        //sahiplerse true değerini döndürünüz.
        //Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
        //commonEnd([1, 2, 3], [7, 3]) → true
        //commonEnd([1, 2, 3], [7, 3, 2]) → false
        //commonEnd([1, 2, 3], [1, 3]) → true
        int[] dizi1={1,2,3};
        int[] dizi2={7,3};
        int[] dizi3={7,3,2};
        int[] dizi4={1,3};

        System.out.println("ayniMi(dizi1,dizi2) = " + ayniMi(dizi1,dizi2));
        System.out.println("ayniMi(dizi1,dizi3) = " + ayniMi(dizi1,dizi3));
        System.out.println("ayniMi(dizi1,dizi4) = " + ayniMi(dizi1,dizi4));



    } public static boolean ayniMi(int[]dizi1,int[]diz2){
        boolean ayniMi;
        if (dizi1[0]==diz2[0] ||dizi1[dizi1.length-1]==diz2[diz2.length-1])
            ayniMi=true;
        else ayniMi=false;

        return ayniMi;
    }
}
