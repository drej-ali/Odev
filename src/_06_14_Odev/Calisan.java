package _06_14_Odev;

public class Calisan extends Kisi{
    private UyeTipi tip;
    private int maas;

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public UyeTipi getTip() {
        return tip;
    }

    public void setTip(UyeTipi tip) {
        this.tip = tip;
    }

    public Calisan(String isim, String soyad, String adres, Okul okul, UyeTipi tip, int maas) {
        super(isim, soyad, adres, okul, tip);
        setMaas(maas);
        setTip(UyeTipi.CALISAN);
    }

    @Override
    public String toString() {
        return "Calisan{" +super.toString()+
                "tip=" + tip +
                ", maas=" + maas +
                '}';
    }
}
