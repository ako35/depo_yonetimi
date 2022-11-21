package day04_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         *
         * INPUT  ==>  OUTPUT
         *  Y     ==>   YES ;
         *  N     ==>   NO
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Y/N ikilisinden birini giriniz: ");
        char girdi = input.next().charAt(0);
        if (girdi == 'Y' || girdi == 'y') {
            System.out.println("YES");
        } else if (girdi == 'N' || girdi == 'n') {
            System.out.println("NO");
        } else System.out.println("Lutfen Y/N ikilisinden birini giriniz...");
    }
}
