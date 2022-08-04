package _06_04_Odev.OzelSorular1;

public class Soru10 {
    public static void main(String[] args) {
        //10- String 2D array oluşturunuz.
        //{{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
        //String de $ varsa 3.2 ile çarpın
        //String de € varsa 4.2 ile çarpın
        //double return ediniz.
        String[][] tablo = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        System.out.println("sonuc(tablo) = " + sonuc(tablo));
    }

    public static double sonuc(String[][] tablo) {
        double sonuc = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j].replaceAll("[^$]", "").equalsIgnoreCase("$"))
                    sonuc += 3.2 * Integer.parseInt(tablo[i][j].replaceAll("[^0-9]", ""));
                if (tablo[i][j].replaceAll("[^€]", "").equalsIgnoreCase("€"))
                    sonuc += 4.2 * Integer.parseInt(tablo[i][j].replaceAll("[^0-9]", ""));
            }
        }
        return sonuc;
    }
}
