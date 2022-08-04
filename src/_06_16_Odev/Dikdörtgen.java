package _06_16_Odev;

public class Dikdörtgen extends Sekil{
    private int uzunluk;
    private int genişlik;

    public Dikdörtgen(int uzunluk, int genişlik) {
        setUzunluk(uzunluk);
        setGenişlik(genişlik);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenişlik() {
        return genişlik;
    }

    public void setGenişlik(int genişlik) {
        this.genişlik = genişlik;
    }

    @Override
    public double getCevresi() {
        return 2*(getUzunluk()+getGenişlik());
    }

    @Override
    public double getAlani() {
        return getUzunluk()*getGenişlik();
    }
}
