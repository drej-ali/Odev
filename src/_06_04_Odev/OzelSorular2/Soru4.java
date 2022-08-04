package _06_04_Odev.OzelSorular2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Soru4 {
    public static void main(String[] args) {
        //4- allNumbers Integer Hashset verildiğinde;
        //allNumbers hashset'i sort edin,
        //Sonucu ArrayList olarak değiştirin,
        //Return ArrayList.
        //NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMAYINIZ , FOR LOOP VEYA
        //FARKLI SET TİPLERİNİ KULLANINIZ.
        HashSet<Integer> allNumber=new HashSet<>();
        allNumber.add(5);allNumber.add(6);allNumber.add(2);allNumber.add(3);allNumber.add(4);
        allNumber.add(7);allNumber.add(8);allNumber.add(9);allNumber.add(0);allNumber.add(1);

        System.out.println("allNumber = " + allNumber);
        TreeSet<Integer>siraliDizi=new TreeSet<>(allNumber);
        System.out.println("siraliDizi = " + siraliDizi);
        ArrayList<Integer> alist=new ArrayList<>(siraliDizi);
        System.out.println("alist = " + alist);






    }
}
