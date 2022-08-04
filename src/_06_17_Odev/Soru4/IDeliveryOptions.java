package _06_17_Odev.Soru4;

import java.util.ArrayList;

public interface IDeliveryOptions {

    int amazonMinFreeDelivery = 1000;
    int costcoMinFreeDelivery =  1500;

    int getTheTotal(ArrayList<String> liste);
    String isFreeShipping(ArrayList<String> liste);
}
