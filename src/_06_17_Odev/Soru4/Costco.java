package _06_17_Odev.Soru4;

import java.util.ArrayList;

public class Costco implements IDeliveryOptions{

    @Override
    public int getTheTotal(ArrayList<String> totalShopping) {
        int toplam = 0;
        for (String st : totalShopping) {
            if (st.contains("k") || st.contains("K")) {
                toplam = Integer.parseInt(st.replaceAll("[^0-9]", "")) * 1000;
            } else
                toplam = Integer.parseInt(st.replaceAll("[^0-9]", ""));
        }return toplam;
    }

    @Override
    public String isFreeShipping(ArrayList<String> freeDelivery) {
        if (getTheTotal(freeDelivery) >= costcoMinFreeDelivery){
            return "Print you are eligible for free delivery";
        }else
            return "You need to buy "+(costcoMinFreeDelivery - getTheTotal(freeDelivery))+" amount of item.";
    }
}
