package pdfsorulari;

import java.util.Scanner;

public class Pdf_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //5
        System.out.println("Lutfen gun ismi giriniz: ");
        String gun=input.next().toLowerCase();
        switch (gun){
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;

        }

        //4
//        System.out.println("SDET kisaltmasindaki harflerden birini giriniz: ");
//        char ch=input.next().charAt(0);
//        switch (ch){
//            case 'S':
//                System.out.println("Software");
//                break;
//            case 'D':
//                System.out.println("Developer");
//                break;
//            case 'E':
//                System.out.println("Engineer");
//                break;
//            case 'T':
//                System.out.println("In Testing");
//                break;
//
//        }

        //3
//        System.out.println("Bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        switch (sayi){
//            case 10:
//                System.out.println("Iki basamakli en kucuk sayi");
//                break;
//            case 100:
//                System.out.println("Uc basamakli en kucuk sayi");
//                break;
//            case 1000:
//                System.out.println("Dort basamakli en kucuk sayi");
//                break;
//            default:
//                System.out.println("Girdigin sayiyi degistir");
//        }

        //2
//        System.out.println("Kacinci aydayiz");
//        String kacinciAy=input.next();
//        switch (kacinciAy){
//            case "1":
//                System.out.println("January");
//                break;
//            case "2":
//                System.out.println("February");
//                break;
//            case "3":
//                System.out.println("March");
//                break;
//            case "4":
//                System.out.println("April");
//                break;
//            case "5":
//                System.out.println("May");
//                break;
//            case "6":
//                System.out.println("June");
//                break;
//            case "7":
//                System.out.println("July");
//                break;
//            case "8":
//                System.out.println("August");
//                break;
//            case "9":
//                System.out.println("September");
//                break;
//            case "10":
//                System.out.println("October");
//                break;
//            case "11":
//                System.out.println("November");
//                break;
//            case "12":
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("1 ila 12 arasinda bir sayi giriniz");
//        }

        //1
//        System.out.println("Bugun haftanin kacinci gunundeyiz? ");
//        String kacinciGun=input.next();
//        switch (kacinciGun){
//            case "1":
//                System.out.println("Monday");
//                break;
//            case "2":
//                System.out.println("Tuesday");
//                break;
//            case "3":
//                System.out.println("Wednesday");
//                break;
//            case "4":
//                System.out.println("Thursday");
//                break;
//            case "5":
//                System.out.println("Friday");
//                break;
//            case "6":
//                System.out.println("Saturday");
//                break;
//            case "7":
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("1 ila 7 arasinda bir sayi giriniz");
//        }



    }
}
