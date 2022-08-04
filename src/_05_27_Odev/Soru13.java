package _05_27_Odev;

import java.util.ArrayList;
import java.util.HashSet;

public class Soru13 {
    public static void main(String[] args) {
        //13-commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        //return tipi arraylist olmalı.
        //**ÖRNEĞİN:**
        //İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
        //İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
        //Ortak değerleri ArrayListe ekleyiniz.
        //çıktı:  "Germany" , "Brazil" ,"USA"
        //ArrayListi yazdırınız.
        HashSet<String>hs1=new HashSet<>();
        hs1.add("Germany");hs1.add("England");hs1.add("South Africa");hs1.add("Brazil");hs1.add("USA");
        HashSet<String>hs2=new HashSet<>();
        hs2.add("Germany");hs2.add("China");hs2.add("Brazil");hs2.add("France");hs2.add("USA");
        System.out.println("commonValues(hs1,hs2) = " + commonValues(hs1,hs2));
    }
    public static ArrayList<String> commonValues(HashSet<String>hs1,HashSet<String>hs2){
        HashSet<String> ortakElemanlar=new HashSet<>();
        ortakElemanlar.addAll(hs1); ortakElemanlar.retainAll(hs2);
        ArrayList<String>al=new ArrayList<>();
        al.addAll(ortakElemanlar);
        return al;
    }
}
