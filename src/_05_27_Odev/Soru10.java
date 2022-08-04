package _05_27_Odev;

import java.util.ArrayList;

public class Soru10 {
    public static void main(String[] args) {
        //10-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //**Örnek:**
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        ArrayList<ArrayList<Integer>> list2D=new ArrayList<>();
        ArrayList<Integer> satir1 = new ArrayList<>();
        satir1.add(1);satir1.add(2);satir1.add(3);
        ArrayList<Integer> satir2 = new ArrayList<>();
        satir2.add(4);satir2.add(5);satir2.add(6);
        ArrayList<Integer> satir3 = new ArrayList<>();
        satir3.add(7);satir3.add(8);satir3.add(9);
        list2D.add(satir1);list2D.add(satir2);list2D.add(satir3);

        System.out.println("tekBoyutaCevir(list2D) = " + tekBoyutaCevir(list2D));
    }
    public static ArrayList<Integer> tekBoyutaCevir( ArrayList<ArrayList<Integer>> liste){
        ArrayList<Integer> list1D=new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.get(i).size(); j++) {
                list1D.add(liste.get(i).get(j));
            }}
        return list1D;
    }
}
