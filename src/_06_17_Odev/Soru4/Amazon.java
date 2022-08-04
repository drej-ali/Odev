package _06_17_Odev.Soru4;

import java.util.ArrayList;

public class Amazon implements IDeliveryOptions{


    @Override
    public int getTheTotal(ArrayList<String> totalShopping) {
        int toplam = 0;
        for (String St : totalShopping){
            if (St.equalsIgnoreCase("k")){
                toplam = Integer.parseInt(St.replaceAll("[^0-9]",""))*1000;
            }
            else toplam = Integer.parseInt(St.replaceAll("[^0-9]",""));
        }return toplam;
    }

    @Override
    public String isFreeShipping(ArrayList<String> freeDelivery) {
        if (getTheTotal(freeDelivery) >= amazonMinFreeDelivery){
            return "you are eligible for free delivery";
        }
        else
            return "You need to buy "+( amazonMinFreeDelivery - getTheTotal(freeDelivery) )+" amount of item.";
    }
}
