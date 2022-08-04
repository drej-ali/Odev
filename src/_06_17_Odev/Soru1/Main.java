package _06_17_Odev.Soru1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("kedi", 3);
        Duck duck = new Duck("ördek", 2);
        Shark shark = new Shark("köpekbalığı", 4);
        Swallow swallow = new Swallow("kırlangıç", 1);

        ArrayList<Animal> hayvanList = new ArrayList<>();
        hayvanList.add(cat);
        hayvanList.add(duck);
        hayvanList.add(shark);
        hayvanList.add(swallow);

        for (Animal a : hayvanList) {
            System.out.println();
            System.out.println(a.getClass().getSimpleName());
            System.out.println("---------------------------");

            System.out.println("adı: " + a.getName());
            System.out.println("yaşı: " + a.getAge());

            if (a instanceof Cat) {
                System.out.println(((Cat) a).canliMi());
            }
            if (a instanceof Shark) {
                System.out.println(((Shark) a).canliMi());
                System.out.println(((Shark) a).yüzebilirMi());
            }
            if (a instanceof Swallow) {
                System.out.println(((Swallow) a).canliMi());
                System.out.println(((Swallow) a).ucabilirMi());
            }
            if (a instanceof Duck) {
                System.out.println(((Duck) a).canliMi());
                System.out.println(((Duck) a).ucabilirMi());
                System.out.println(((Duck) a).yüzebilirMi());
            }
        }


    }
}
