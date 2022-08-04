package _06_15_Odev;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("ali","güler","ders çalışmak","11a");
        Calisan cls=new Calisan("faruk","güler","çalışmak","öğretmen");

        kimlikYaz(cls);
        kimlikYaz(ogr);



    }
    public static void kimlikYaz(Kisi kisi){
        if (kisi instanceof Ogrenci){
            System.out.println("******KİMLİK BELGESİ******");
            System.out.println(kisi);
        }
        if (kisi instanceof Calisan){
            System.out.println("******KİMLİK BELGESİ******");
            System.out.println(kisi);
        }

    }
}
