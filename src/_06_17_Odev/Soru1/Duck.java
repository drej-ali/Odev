package _06_17_Odev.Soru1;

public class Duck extends Animal implements IFlying,ISailing{
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public String canliMi() {
        return "duck canlıdır";
    }

    @Override
    public String ucabilirMi() {
        return "duck uçabilir";
    }

    @Override
    public String yüzebilirMi() {
        return "duck yüzebilir";
    }
}
