package practiceAdvanced.practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {
    /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz: ");
        int yil=input.nextInt();
        System.out.println("Lutfen ay numarasi giriniz: ");
        int ayNo=input.nextInt();
        boolean artikYilMi=false;
        if (yil%100==0){
            if (yil%400==0){
                artikYilMi=true;
            } else {
                if (yil%4==0){
                    artikYilMi=true;
                } else {
                    artikYilMi=false;
                }
            }
        }
        int gun;
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gun=31;
                System.out.println(gun);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gun=30;
                System.out.println(gun);
                break;
            case 2:
                if (artikYilMi){
                    gun=29;
                    System.out.println(gun);
                } else {
                    gun=28;
                    System.out.println(gun);
                }
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz...");
        }




    }





}
