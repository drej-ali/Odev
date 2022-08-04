package _06_04_Odev.OzelSorular2;

import java.util.*;

public class Soru2 {
    public static void main(String[] args) {
        //2- Girdiğiniz String parametresinin herbir karakterinin(char) sayısını döndüren charCount
        //metodunu yazınız.
        //Örnek:
        //String = aabbbcccc
        //return a , 2 olmalı  -  b , 3   -    c , 4
        //Not: Stringde herhangi bir char olabilir.

        String kel = "qwewqeqwersafsdcxzdqwe";
        System.out.print(charCount(kel));



    }public static LinkedHashMap<Character, Integer> charCount(String kel) {
        LinkedHashMap<Character, Integer> lhs = new LinkedHashMap<>();
        for (int i = 0; i < kel.length(); i++) {
            if (!lhs.containsKey(kel.charAt(i)))
                lhs.put(kel.charAt(i), 1);
            else {
                lhs.replace(kel.charAt(i), lhs.get(kel.charAt(i))+1);
            }
        }
        return lhs;
    }}



