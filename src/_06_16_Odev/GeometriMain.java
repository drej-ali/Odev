package _06_16_Odev;

public class GeometriMain {
    public static void main(String[] args) {

        Daire daire = new Daire(5);
        System.out.println("daire alan = " + daire.getAlani());
        System.out.println("daire çevre = " + daire.getCevresi());

        Dikdörtgen dik=new Dikdörtgen(4,5);
        System.out.println("dik alan = " + dik.getAlani());
        System.out.println("dik çevre = " + dik.getCevresi());

        Kare kare=new Kare(6);
        System.out.println("kare alan = " + kare.getAlani());
        System.out.println("kare çevre = " + kare.getCevresi());



    }
}