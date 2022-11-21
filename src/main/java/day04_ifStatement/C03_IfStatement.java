package day04_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        System.out.println("Lutfen gun ismi giriniz: ");
        String day = input.next();
        if (day.equalsIgnoreCase("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (day.equalsIgnoreCase("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (day.equalsIgnoreCase("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else System.out.println("Kutsal gun degil...");

        //String'lerde == kullanilmaz. Onun yerine equals kullanilir.
        // Cunku Java'da iki tane memory var. Stack ve Heap.
        // String'de referans degerine de bakildigi icin == yerine equals kullanilir.






    }
}
