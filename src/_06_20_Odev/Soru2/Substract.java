package _06_20_Odev.Soru2;

public class Substract extends Calculator{
    @Override
    public int calculating(int num1, int num2) {
        int sonuc;
        if (num1>num2)
            sonuc=num1-num2;
        else sonuc=num2-num1;
        return sonuc;
    }
}
