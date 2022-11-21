package day05_ifStatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        System.out.println("Dort basamakli bir sayi giriniz: ");
        int sayi=input.nextInt();
        if (sayi>999 && sayi<10000){
            if (sayi%5==0){
                if (sayi%10==0){
                    System.out.println("5’e bölünen çift sayı");
                }else System.out.println("5’e bölünen tek sayı");

            }else System.out.println("Tekrar deneyiniz...");
        }else System.out.println("Lutfen dort basamakli bir sayi giriniz...");




    }
}
