package _06_17_Odev.Soru1;

public class Shark extends Animal implements ISailing{
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public String canliMi() {
        return "shark canlıdır";
    }

    @Override
    public String yüzebilirMi() {
        return "shark yüzebilir";
    }
}
