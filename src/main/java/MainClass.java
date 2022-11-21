import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    static double topTutar;
    public static void main(String[] args) {

        String[] manav = new String[5];
        manav[0] = "Domates";
        manav[1] = "Salatalik";
        manav[2] = "Muz";
        manav[3] = "Portakal";
        manav[4] = "Elma";


        Double[] fiyatListesi = new Double[5];
        fiyatListesi[0] = 12.0;
        fiyatListesi[1] = 8.5;
        fiyatListesi[2] = 20.0;
        fiyatListesi[3] = 19.90;
        fiyatListesi[4] = 7.5;

        ArrayList<String> sepet = new ArrayList<>();
        musteriSecimi(sepet, manav, fiyatListesi);

        kasa(topTutar);
    }


    public static void musteriSecimi(ArrayList<String> sepet, String[] manav , Double[] fiyatListesi) {

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Almak istediniz urun kodunu girin \n1)Domates \n2)Salatalik \n3)Muz \n4)Portakal \n5)Elma");
            int secim = scanner.nextInt();
            sepet.add(manav[secim-1]);
            System.out.println("Kac kilo almak istiyorsunuz:");
            double kilo = scanner.nextDouble();
            double kiloHesap = fiyatListesi[secim-1]*kilo;
            topTutar = topTutar + kiloHesap;
            System.out.println("Sepetiniz:" + sepet);
            System.out.println("AlisVerise Devam etmek isyormusunuz E)Evet / H)Hayir");
            String  alisVerisDevamMi = scanner.next().toLowerCase();
            if (alisVerisDevamMi.equals("h")) {
                System.out.println("Manav AlisVerisi Bitti");
                System.out.println("Sepetiniz:" + sepet);
                break;
            }
        }while (true);
    }

    public static void kasa(double topTutar) {

        System.out.println("Toplam Tutar:" + topTutar);
    }

}
