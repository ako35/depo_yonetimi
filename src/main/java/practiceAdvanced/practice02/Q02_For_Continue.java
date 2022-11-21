package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q02_For_Continue {
    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5-10 arasındakiler hariç, diğerlerinin toplamını bulun.
        */
        Scanner input=new Scanner(System.in);
        int toplam=0;
        for (int i=0;i<5;i++){
            System.out.println((i+1)+". sayiyi giriniz:");
            int sayi=input.nextInt();
            if (sayi>5 && sayi<10){
                continue;
            } else {
                toplam+=sayi;
            }
        }
        System.out.println(toplam);


    }
}
