package _06_14_Odev;

public class OkulMain {
    public static void main(String[] args) {
        Okul okul=new Okul("Atatürk",20);

        Ogrenci ogr1=new Ogrenci("ali","güler","Falan yer",okul,UyeTipi.OGRENCI,5000);
        Ogrenci ogr2=new Ogrenci("faruk","güler","Filan yer",okul,UyeTipi.OGRENCI,5000);
        Calisan cls1=new Calisan("kemal","doğru","Falanca yer",okul,UyeTipi.CALISAN,10000);
        Calisan cls2=new Calisan("mustafa","kasap","Filanca yer",okul,UyeTipi.CALISAN,9000);

        okul.getCalisanList().add(cls1);
        okul.getCalisanList().add(cls2);

        okul.getOgrenciList().add(ogr1);
        okul.getOgrenciList().add(ogr2);

        okul.ogrencileriYazdir();
        okul.calisanlariYazdir();



    }
}
