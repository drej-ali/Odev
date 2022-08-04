package _06_14_Odev;

public class Ogrenci extends Kisi{
    private UyeTipi tip;
    private int ucret;
    public Ogrenci(String isim, String soyad, String adres, Okul okul, UyeTipi tip,int ucret) {
        super(isim, soyad, adres, okul, tip);
        setUcret(ucret);
        setTip(UyeTipi.OGRENCI);

    }

    public int getUcret() {
        return ucret;
    }

    public UyeTipi getTip() {
        return tip;
    }

    public void setTip(UyeTipi tip) {
        this.tip = tip;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +super.toString()+
                "tip=" + tip +
                ", ucret=" + ucret +
                '}';
    }
}
