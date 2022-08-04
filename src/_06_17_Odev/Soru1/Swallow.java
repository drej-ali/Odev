package _06_17_Odev.Soru1;

public class Swallow extends Animal implements IFlying{
    public Swallow(String name, int age) {
        super(name, age);
    }

    @Override
    public String canliMi() {
        return "swallow canlıdır";
    }

    @Override
    public String ucabilirMi() {
        return "swallow uçabilir";
    }
}
