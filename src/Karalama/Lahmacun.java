package Karalama;

public class Lahmacun implements IYemekler{
    @Override
    public void taste() {
        System.out.println("Lahmacunun tadı müthiştir.");

    }

    @Override
    public double ucret() {
        return 33;
    }
    void dough(){
        System.out.println("Lahmacunun unu yoğrulmaya başlandı.");
    }
    void addMeat(){
        System.out.println("Lahmacun üzerine kıyması eklendi");
    }
    void bake(){
        System.out.println("Lahmacun fırına verildi.");
    }
}
