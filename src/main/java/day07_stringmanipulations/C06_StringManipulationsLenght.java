package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle="Bugun hava yagmurlu";
        System.out.println(cumle.length());

        String str1="";
        System.out.println(str1.length());

        String str2=" ";
        System.out.println(str2.length());

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=input.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=input.nextLine();
        if (isim.length()<soyisim.length()){
            System.out.println("Soyisminiz daha uzundur");
        } else if (isim.length()>soyisim.length()){
            System.out.println("Isminiz daha uzundur");
        } else System.out.println("Isim ve soyisim uzunlugu esittir");

        System.out.println("Lutfen dort harfli kelime giriniz");
        String kelime=input.nextLine();
        int kelimeUzunlugu=kelime.length();
        String tersKelime=kelime.substring(kelimeUzunlugu-1,kelimeUzunlugu)+
                kelime.substring(kelimeUzunlugu-2,kelimeUzunlugu-1)+
                kelime.substring(kelimeUzunlugu-3,kelimeUzunlugu-2)+
                kelime.substring(kelimeUzunlugu-4,kelimeUzunlugu-3);
        System.out.println(tersKelime);


    }
}
