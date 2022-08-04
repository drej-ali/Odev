package Karalama;

public class TechnoKitchen {
    int kebabSayisi = 0;
    int lahmacunSayisi = 0;
    int borschSayisi = 0;
    int palovSayisi = 0;

    void adanaKebabSiparisi(){
        kebabSayisi++;
        System.out.println("\nKebap siparişiniz alındı.");
        AdanaKebab a = new AdanaKebab();
        a.marinade();a.grill();
    }
    void lahmacunSiparisi(){
        lahmacunSayisi++;
        System.out.println("\nLahmacun siparişiniz alındı.");
        Lahmacun l = new Lahmacun();
        l.dough();l.addMeat();l.bake();

    }
    void borshSiparisi(){
        borschSayisi++;
        System.out.println("\nBorsh siparişiniz alındı.");
        Borsh b = new Borsh();
        b.boil();b.eatTomorrow();

    }
    void palovSiparisi(){
        palovSayisi++;
        System.out.println("\nPalov siparişiniz alındı.");
        Palov p = new Palov();
        p.fry();p.boil();
    }
    double siparis(){System.out.println("\n****Siparişiniz*****\n" +
            "1-Adana Kebap(55 TL)" + kebabSayisi + " adet " + kebabSayisi * 55 + " TL\n" +
            "2-Lahmacun(33 TL)" + lahmacunSayisi + " adet " + lahmacunSayisi * 33 + " TL\n" +
            "3-Borsh(33 TL)" + borschSayisi + " adet " + borschSayisi * 33 + " TL\n" +
            "4-Palov(44 TL)" + palovSayisi + " adet " + palovSayisi * 33 + " TL\n" +
            "Toplam Tutar=" + (kebabSayisi *  + lahmacunSayisi *  + borschSayisi * 33 + palovSayisi * 44) + " TL");




        return 0;
    }
}
