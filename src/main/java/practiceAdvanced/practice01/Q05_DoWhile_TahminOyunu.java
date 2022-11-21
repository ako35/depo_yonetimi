package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==>
        //       Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==>
        //       Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!
        Scanner input=new Scanner(System.in);
        int rastgeleNumara=(int) (Math.random()*100)+1;
        int girilenSayi;
        int hak=10;
        System.out.println("1 ile 100 arasi bir sayi tahmini giriniz");
        do {
            girilenSayi=input.nextInt();
            if (girilenSayi==rastgeleNumara){
                System.out.println("Tebrikler");
            } else if (girilenSayi<rastgeleNumara){
                hak--;
                if (hak==0){
                    System.out.println("Maalesef Kaybettiniz");
                    System.out.println("Tekrar oynamak icin 1, " +
                            "cikmak icin 2 giriniz");
                    int secenek=input.nextInt();
                    if (secenek==2){
                        break;
                    } else if (secenek==1) {
                        rastgeleNumara=(int) (Math.random()*100)+1;
                    }
                }
                System.out.println("Daha buyuk sayi giriniz");
            } else {
                hak--;
                if (hak==0){
                    System.out.println("Maalesef Kaybettiniz");
                    break;
                }
                System.out.println("Daha kucuk sayi giriniz");
            }
        }while (girilenSayi!=rastgeleNumara);



    }
}
