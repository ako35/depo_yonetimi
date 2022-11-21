package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz: (E/K)");
        char cinsiyet=input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz: ");
        double yas=input.nextDouble();
        boolean yasAraligi=yas<0 || yas>120;
        if (cinsiyet=='K'){
            if (yasAraligi){
                System.out.println("Lutfen dogru yas araliginda deger giriniz");
            }else {
                if (yas>60){
                    System.out.println("Emekli olabilir");
                }else System.out.println("Emekli olamaz "+(65-yas)+" daha calismalisin");
            }
        } else if (cinsiyet=='E') {
            if (yasAraligi){
                System.out.println("Lutfen dogru yas araliginda deger giriniz");
            } else {
                if (yas>65){
                    System.out.println("Emekli olabilir");
                }else System.out.println("Emekli olamaz"+(65-yas)+" daha calismalisin");
            }

        } else System.out.println("Lutfen gecerli bir harf giriniz: ");

    }
}
