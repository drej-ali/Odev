package _06_15_Odev;

public class Calisan extends Kisi{
    private String departman;

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public Calisan(String ad, String soyad, String gorev,String departman) {
        super(ad, soyad, gorev);
        setDepartman(departman);
    }

    @Override
    public String toString() {
        return "Calisan{" +super.toString()+
                "departman='" + departman + '\'' +
                '}';
    }

}
