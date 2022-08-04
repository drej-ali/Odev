package _06_16_Odev;



public class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap) {

        setYaricap(yaricap);
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getAlani() {
        return Math.PI*getYaricap()*getYaricap();}

    @Override
    public double getCevresi() {
        return 2* Math.PI*getYaricap();
    }
}
