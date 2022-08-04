package _06_04_Odev.OzelSorular1;

public class Soru5  {
    public static void main(String[] args) {
        //5- {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
        //int 2D arrayini oluşturunuz.
        //2D arrayinden max number print ediniz.

        int[][]tablo={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int maxNumber=tablo[0][0];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]>maxNumber)
                    maxNumber=tablo[i][j];
            }
        }
        System.out.println("maxNumber = " + maxNumber);
    }
}
