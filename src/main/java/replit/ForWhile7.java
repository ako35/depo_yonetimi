package replit;

import java.util.Scanner;

public class ForWhile7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi=input.nextInt();
        mukemmelSayiMi(sayi);
    }

    private static void mukemmelSayiMi(int sayi) {
        int toplam=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        if (toplam==sayi){
            System.out.println("Mukemmel sayidir...");
        } else System.out.println("Mukemmel sayi degildir...");
    }
}
