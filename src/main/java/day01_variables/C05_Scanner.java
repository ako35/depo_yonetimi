package day01_variables;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Adinizi giriniz: ");
        String ad=input.nextLine();
        System.out.println("Soyadinizi giriniz: ");
        String soyad=input.nextLine();
        System.out.println("Memleketinizi giriniz: ");
        String memleket=input.nextLine();
        System.out.println("Konumunuzu giriniz: ");
        String konum=input.nextLine();
        System.out.println("Yasinizi giriniz: ");
        byte yas=input.nextByte();
        System.out.println("Boyunuzu giriniz: ");
        short boy=input.nextShort();
        System.out.println("Kilonuzu giriniz: ");
        double kilo=input.nextDouble();
        System.out.println("Java'yi sevdiniz mi? (E/H): ");
        boolean javaeh=input.hasNextBoolean();


    }
}
