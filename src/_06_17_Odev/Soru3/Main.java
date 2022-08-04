package _06_17_Odev.Soru3;

public class Main {
    public static void main(String[] args) {
        Bicycle bisiklet=new Bicycle(20,2);
        Car araba=new Car(100,4);

        bisiklet.changeGear(1);
        bisiklet.speedUp(10);
        bisiklet.applyBrakes(15);
        System.out.println(bisiklet.printAll());

        araba.changeGear(2);
        araba.speedUp(100);
        araba.applyBrakes(50);
        System.out.println(araba.printAll());








    }
}
