package _05_27_Odev;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
        //14-removing() isminde bir method oluşturun.
        //Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
        //Eğer Stringler LinkedHashset 'in içinde varsa, sil.
        //Return tipi linkedhashset
        //Örneğin,
        //linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
        //String 1= Germany
        //String 2 = USA
        // **Germany ve USA 'i sil.**
        //**Set'i döndür.**

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        Collections.addAll(lhs,"Germany","France","USA","Canada","Mexico","Brazil");
        Scanner input=new Scanner(System.in);
        System.out.print("ilk hangi kelime silinsin:");
        String k1= input.nextLine();
        System.out.print("şimdi hangi kelime silinsin:");
        String k2= input.nextLine();
        System.out.println("removing(lhs) = " + removing(lhs,k1,k2));


    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs,String k1, String k2){
        if (lhs.contains(k1)&&lhs.contains(k2)){
            lhs.remove(k1);
            lhs.remove(k2);}
        return lhs;

    }
}
