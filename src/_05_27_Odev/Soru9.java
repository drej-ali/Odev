package _05_27_Odev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {
        //9-rangeBtw() isminde bir method oluşturun.
        //Parametre olarak   **bir Arraylist**  ve **iki ayrı int**
        //return tipi int
        // Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.
        //return  **count**       (sayacı (count) döndürün.)
        //**Example (Örnek):**
        //ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
        //min = 20
        //max = 30
        //return =  5    (20,22,25,28,30)
        //min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(1);liste.add(5);liste.add(22);liste.add(10);liste.add(20);liste.add(10);liste.add(20);
        liste.add(14);liste.add(8);liste.add(25);liste.add(30);liste.add(28);liste.add(11);liste.add(36);
        System.out.print("hangi sayıdan başlayalım:");
        int s1= input.nextInt();
        System.out.print("hangi sayıda duralım:");
        int s2= input.nextInt();
        System.out.println("istenen aralık = " + s1+"-"+s2);
        Collections.sort(liste);
        System.out.println("liste = " + liste);
        System.out.println("listede istenen aralıkta kaç sayı var = " + rangeBtw(liste,s1,s2));
    }
    public static int rangeBtw(ArrayList<Integer> liste, int s1, int s2){
        int count=0;
        for (int i = 0; i < liste.size(); i++) {
            if (s1<liste.get(i)&&liste.get(i)<s2)
                count++;
        }


        return count;
    }
}
