package practiceAdvanced.practice10;

import java.util.Scanner;

public class Q07_ConvertThreeDigitNumberToWords {

    //Üç haneli bir sayıyı ingilizce okunuşuna çeviren bir kod yazınız.
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Uc basamakli sayi giriniz");
        int number=input.nextInt();
        int ones=number%10;
        int tens=(number/10)%10;
        int hundreds =number/100;
        if (number>99 && number<1000){

            switch (hundreds) {
                case 1:
                    System.out.print("Onehundreds");
                    break;
                case 2:
                    System.out.print("Twohundreds");
                    break;
                case 3:
                    System.out.print("Threehundreds");
                    break;
                case 4:
                    System.out.print("Fourhundreds");
                    break;
                case 5:
                    System.out.print("Fivehundreds");
                    break;
                case 6:
                    System.out.print("Sixhundreds");
                    break;
                case 7:
                    System.out.print("Sevenhundreds");
                    break;
                case 8:
                    System.out.print("Eighthundreds");
                    break;
                case 9:
                    System.out.print("Ninehundreds");
                    break;
            }
            switch (tens) {
                case 1:
                    System.out.print("Ten");
                    break;
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }

            switch (ones) {
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
            }

        }else{
            System.out.println("Geçerli pozitif sayı giriniz");
        }



    }



}
