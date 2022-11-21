package day03_ifStatement;

import java.util.Scanner;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

//        char harf='a';
//        char harf2='A';
//        System.out.println("harf>harf2 ==> "+(harf>harf2));//karsilastirma islemlerinin sonucunu true ya da false doner
//
        // Buyuk harflerin Ascii degerleri kucuk harflerin Ascii degerlerinden daha kucuktur

        // Herhangi bir char variable'nin Ascii degerlerini kod yazarak bulunuz

//        char sembol='k';
//        System.out.println(0+sembol); // space'in ASCII degerini hesaplamak icin toplamaya etkisi olmayan '0' ile toplariz

//        char m='m';
//        System.out.println("m = " + (m +0));

        // char'larda Java char karaktere int'de atayabiliriz.
        // Cunku char'in bir resim karakteri birde matematiksel ASCII degeri vardir
        // Bu sekilde ASCII degerlerini hesaplayabiliriz
//        int harf3='m';
//        System.out.println("harf3 = " + harf3);

        byte b1=12;
        byte b2=-125;
        System.out.println("b1>b2 ==> "+(b1>b2));

        float f1=2.45645f;
        float f2=5.86786F;
        System.out.println("f1>f2 ==> "+(f1>f2));
        System.out.println("b1>f1 ==> "+(b1>f1));

        long lng1=5456456464L;
        System.out.println("b1<lng1 ==> "+(b1<lng1));

        char ch='h';
        System.out.println("b1>ch ==> "+(b1>ch));

    }
}
