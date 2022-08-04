package Karalama;

public class Palov implements IYemekler{
    @Override
    public void taste() {
        System.out.println("Palov bildiğiniz pilavdır.");
    }
    @Override
    public double ucret() {
        return 44;
    }
    void fry(){
        System.out.println("Palovun pirinçleri kavrulmaya başlandı.");
    }
    void boil(){
        System.out.println("Palov ocakta kaynamaktadır.");


    }

}
