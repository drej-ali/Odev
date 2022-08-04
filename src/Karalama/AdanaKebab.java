package Karalama;

public class AdanaKebab implements IYemekler{
    @Override
    public void taste() {
        System.out.println("Adana Kebabın tadı lokum kıvamızdadır.");
    }

    @Override
    public double ucret() {
        return 55;
    }

    void marinade(){
        System.out.println("Adana Kebabın etleri marine edildi.");
    }
    void grill(){
        System.out.println("Adana Kebab tam kıvamında ızgaraya atıldı.");
    }

    @Override
    public String toString() {
        return "AdanaKebab{}";
    }
}
