package day05_ifStatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan dortgenin kenar uzunluklarini isteyin
        //ve dortgenin kare olup  olmadigini yazdirin
        Scanner input=new Scanner(System.in);
        System.out.println("Dortgenin kenar uzunluklarini giriniz: ");
        double kenar1=input.nextDouble();
        double kenar2=input.nextDouble();
        double kenar3=input.nextDouble();
        double kenar4=input.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
            System.out.println("Bu cisim bir karedir");
        } else System.out.println("Bu cisim bir kare degildir");
    }
}
