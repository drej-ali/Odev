package _06_15_Odev;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorev;

    public Kisi(String ad, String soyad, String gorev) {
        setAd(ad);
        setSoyad(soyad);
        setGorev(gorev);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorev='" + gorev + '\'' +
                '}';
    }
}
