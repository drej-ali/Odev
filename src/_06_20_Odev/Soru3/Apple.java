package _06_20_Odev.Soru3;

import java.util.ArrayList;

public class Apple extends Phone{

    @Override
    void options(String hafiza, String ekran) {
        if (hafiza.equals("64")&&ekran.equals("5.5"))
            cart.add("$750");
        else if (hafiza.equals("64")&&ekran.equals("6.5"))
            cart.add("$850");
        else if (hafiza.equals("128")&&ekran.equals("5.5"))
            cart.add("$950");
        else if (hafiza.equals("128")&&ekran.equals("6.5"))
            cart.add("$1200");
        else System.out.println("Stokta bulunan bir tercihte bulunununuz.");
    }
}
