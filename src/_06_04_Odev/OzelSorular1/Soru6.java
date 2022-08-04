package _06_04_Odev.OzelSorular1;

public class Soru6 {
    public static void main(String[] args) {
        //6- {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
        //int 2D arrayini oluşturunuz.
        //2D arrayinden min number print ediniz.
        int[][]tablo={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int minNumber=tablo[0][0];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]<minNumber)
                    minNumber=tablo[i][j];
            }
        }
        System.out.println("minNumber = " + minNumber);
    }
}
