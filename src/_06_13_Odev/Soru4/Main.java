package _06_13_Odev.Soru4;

public class Main {
    public static void main(String[] args) {
        rentApartments rent0=new rentApartments("ali",0,true);
        rentApartments rent1=new rentApartments("kemal",1,true);
        rentApartments rent2=new rentApartments("ömer",2,true);
        rentApartments rent3=new rentApartments("faruk",3,true);
        rentApartments rent4=new rentApartments("emin",3,false);

        rentApartments.rent(rent0);
        rentApartments.rent(rent1);
        rentApartments.rent(rent2);
        rentApartments.rent(rent3);
        rentApartments.rent(rent4);



    }
}
