package day03_ifStatement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir isci isi kac gunde bitirmektedir? ");
        double gunSayisi=input.nextDouble();
        System.out.println("Kac isci calismaktadir? ");
        double isciSayisi=input.nextDouble();
        double bitirmeSuresi=gunSayisi/isciSayisi;
        System.out.println("bitirmeSuresi = " + bitirmeSuresi);
    }
}
