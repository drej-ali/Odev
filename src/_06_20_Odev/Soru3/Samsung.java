package _06_20_Odev.Soru3;

public class Samsung extends Phone{
    @Override
    void options(String hafiza, String ekran) {
        if (hafiza.equals("256")&&ekran.equals("5.5"))
            cart.add("$1000");
        else if (hafiza.equals("256")&&ekran.equals("7.5"))
            cart.add("$1200");
        else if (hafiza.equals("512")&&ekran.equals("5.5"))
            cart.add("$1300");
        else if (hafiza.equals("512")&&ekran.equals("6.5"))
            cart.add("$1400");
        else System.out.println("Stokta bulunan bir tercihte bulunununuz.");

    }
}
