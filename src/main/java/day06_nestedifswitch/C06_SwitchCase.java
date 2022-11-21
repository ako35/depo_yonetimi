package day06_nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
        //Ex : 568
        //Besyuzaltmissekiz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif uc basamakli bir sayi giriniz: ");
        int sayi = input.nextInt();
        int birlerBas = (sayi % 10);
        int onlarBas = ((sayi / 10) % 10);
        int yuzlerBas = ((sayi / 100) % 10);
        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("Ikiyuz");
                    break;
                case 3:
                    System.out.print("Ucyuz");
                    break;
                case 4:
                    System.out.print("Dortyuz");
                    break;
                case 5:
                    System.out.print("Besyuz");
                    break;
                case 6:
                    System.out.print("Altiyuz");
                    break;
                case 7:
                    System.out.print("Yediyuz");
                    break;
                case 8:
                    System.out.print("Sekizyuz");
                    break;
                case 9:
                    System.out.print("Dokuzyuz");
                    break;
            }
            switch (onlarBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }
            switch (birlerBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("Iki");
                    break;
                case 3:
                    System.out.print("Uc");
                    break;
                case 4:
                    System.out.print("Dort");
                    break;
                case 5:
                    System.out.print("Bes");
                    break;
                case 6:
                    System.out.print("Alti");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;
            }


        } else System.out.println("Lutfen uc basamakli bir sayi giriniz");
    }
}
