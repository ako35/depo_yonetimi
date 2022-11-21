package day05_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.
        System.out.println("Lutfen iki sayi giriniz: ");
        double sayi1=input.nextDouble();
        double sayi2=input.nextDouble();
//        if (sayi1<sayi2){
//            System.out.println("Buyuk olmayan sayi "+sayi1);
//        } else if (sayi1>sayi2) {
//            System.out.println("Buyuk olmayan sayi "+sayi2);
//        } else System.out.println("Sayilar birbirine esittir");

        Object sonuc=sayi1<sayi2 ? "Kucuk sayi: "+sayi1 : (sayi2<sayi1 ? "Kucuk sayi:"+sayi2 : "Sayilar esit");
        System.out.println(sonuc);








    }
}
