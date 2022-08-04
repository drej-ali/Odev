package _06_14_Odev;

import java.util.ArrayList;

public class Okul {
    String isim;
    int maxOgrenciSayisi;
    ArrayList<Ogrenci> ogrenciList;
    ArrayList<Calisan> calisanList;


    public Okul(String isim, int maxOgrenciSayisi) {
        setIsim(isim);
        setMaxOgrenciSayisi(maxOgrenciSayisi);
        setOgrenciList();
        setCalisanList();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciList() {
        return ogrenciList;
    }

    public void setOgrenciList() {
        this.ogrenciList = new ArrayList<>();
    }

    public ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    public void setCalisanList() {
        this.calisanList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return isim;
    }
    public void ogrencileriYazdir() {
        for (Ogrenci o : this.getOgrenciList())
            System.out.println(o);
    }
    public void calisanlariYazdir(){
        for (Calisan c:this.getCalisanList())
            System.out.println(c);
    }
}
