package day07_stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationsConcat {
    /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println(15 + 20 + "Merhaba"); // 35Merhaba
        System.out.println("Merhaba" + 15 + 20); // Merhaba1520
        System.out.println("Merhaba" + (15 + 20)); // Merhaba35
        System.out.println("Merhaba" + 15 * 20); // Merhaba300

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        //tam isminin buyuk harfle yazilmasini saglayin.
        System.out.println("Lutfen isminizi giriniz: ");
        String isim=input.nextLine().toUpperCase();
        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim=input.nextLine().toUpperCase();
        System.out.println(isim.concat(" "+soyisim));





    }
}
