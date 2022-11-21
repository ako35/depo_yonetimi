package practiceAdvanced.practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q05_Inheritance_HacimHesaplama {
    //Kare prizma silindir ve koninin hacmini hesaplayan bir kod yaziniz.
    //(Inheritance kullaniniz)
    public static void main(String[] args) {

        KarePrizma karePrizma=new KarePrizma();
        double karePrizmaHacmi=karePrizma.hacimHesapla(5,6);
        System.out.println(karePrizmaHacmi);

        Koni koni=new Koni();
        double koniHacmi=koni.hacimHesapla(3,5);
        NumberFormat numberFormat=new DecimalFormat(".00");
        System.out.println(numberFormat.format(koniHacmi));

        Silindir silindir=new Silindir();
        double silindirHacmi=silindir.hacimHesapla(1,5);
        System.out.println(numberFormat.format(silindirHacmi));



    }



}
