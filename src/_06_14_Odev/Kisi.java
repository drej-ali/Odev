package _06_14_Odev;

public class Kisi {
    private String isim;
    private String soyad;
    private String adres;
    private Okul okul;

    public Kisi(String isim, String soyad, String adres, Okul okul, UyeTipi tip) {
        setIsim(isim);
        setSoyad(soyad);
        setAdres(adres);
        setOkul(okul);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "isim='" + isim + '\'' +
                ", soyad='" + soyad + '\'' +
                ", adres='" + adres + '\'' +
                ", okul=" + okul +
                '}';
    }
}
