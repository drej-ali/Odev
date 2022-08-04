package _06_17_Odev.Soru2;

public class File {
    private String tur;
    private int ebat;

    public File(String tur, int ebat) {
        setTur(tur);
        setEbat(ebat);
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getEbat() {
        return ebat;
    }

    public void setEbat(int ebat) {
        this.ebat = ebat;
    }

    @Override
    public String toString() {
        return "File{" +
                "tur='" + tur + '\'' +
                ", ebat=" + ebat +
                '}';
    }
}
