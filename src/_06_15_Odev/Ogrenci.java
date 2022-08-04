package _06_15_Odev;

public class Ogrenci extends Kisi{
    private String sube;

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public Ogrenci(String ad, String soyad, String gorev, String sube) {
        super(ad, soyad, gorev);
        setSube(sube);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +super.toString()+
                "sube='" + sube + '\'' +
                '}';
    }
}
