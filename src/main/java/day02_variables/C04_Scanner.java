package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("3 basamakli bir sayi giriniz");
//        int sayi = scan.nextInt();
//        // 1) 1 ler basamagindaki sayiyi bulun
//        int birler = sayi % 10;
//        System.out.println("girdiginiz sayinin birler basamagi " + birler);
//        sayi =sayi/ 10;
//        // 2) 10 lar basamagindaki sayiyi bulun
//        int onlar = sayi % 10;
//        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
//        // 3) 100 ler basamagindaki sayiyi bulun
//        int yuzler = sayi / 10;
//        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);

//        System.out.println("Dort basamakli bir sayi giriniz: ");
//        String sayi=input.next();
//        char ilkchar=sayi.charAt(3);
//        char sonchar=sayi.charAt(0);
//        int ilkint=Integer.parseInt(String.valueOf(ilkchar));
//        int sonint=Integer.parseInt(String.valueOf(sonchar));
//        System.out.println(ilkint+sonint);

//        System.out.println("Dort basamakli bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        int ilk=sayi/1000;
//        int son=sayi%10;
//        System.out.println(ilk+son);

//        System.out.println("Uc basamakli bir sayi giriniz: ");
//        String sayi=input.next();
//        char rakam1=sayi.charAt(0);
//        char rakam2=sayi.charAt(1);
//        char rakam3=sayi.charAt(2);
//        System.out.println(rakam1);
//        System.out.println(rakam2);
//        System.out.println(rakam3);

//        System.out.println("Uc basamakli bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        int birler=sayi%10;
//        System.out.println("birler = " + birler);
//        sayi = sayi / 10;
//        int onlar=sayi%10;
//        System.out.println("onlar = " + onlar);
//        sayi = sayi / 10;
//        int yuzler=sayi%10;
//        System.out.println("yuzler = " + yuzler);


        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
//        //         *   Ex :
//        //         *   input  : 12345==>1+2+4+5=12
//        //         *   output : 12

        System.out.println("Bes basamakli bir sayi giriniz: ");
        int sayi=input.nextInt();
        int sayi1=sayi%10;
        sayi=sayi/10;
        int sayi2=sayi%10;
        sayi=sayi/100;

        int sayi4=sayi%10;
        sayi=sayi/10;
        int sayi5=sayi%10;

        System.out.println(sayi1+sayi2+sayi4+sayi5);




    }
}
