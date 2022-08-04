package _06_17_Odev.Soru1;

public class Cat extends Animal implements IAnimal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String canliMi() {
        return "cat canlıdır";
    }
}
