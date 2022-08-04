package Karalama;

public class Borsh implements IYemekler{
    @Override
    public void taste() {
        System.out.println("Borshun tadı baharatlıdır.");
    }

    @Override
    public double ucret() {
        return 33;
    }
    void boil(){
        System.out.println("Borsh ocakta kaynamaya başladı.");
    }
    void eatTomorrow(){
        System.out.println("Borshu yarın yerseniz daha lezzetli olacaktır.");
    }
}
