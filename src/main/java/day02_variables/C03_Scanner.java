package day02_variables;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz: ");
//        String kullaniciIsmi=input.next();


        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

//        double piSayisi=3.14;
//        System.out.println("yaricap giriniz: ");
//        int yariCap=input.nextInt();
//        double cevre=2*piSayisi;
//        System.out.println("cevre = " + cevre);
//        double alan=piSayisi*yariCap*yariCap;
//        System.out.println("alan = " + alan);

//        System.out.println("Dikdortgenin kisa kenarini giriniz: ");
//        int kisaKenar=input.nextInt();
//        System.out.println("Dikdortgenin uzun kenarini giriniz: ");
//        int uzunKenar=input.nextInt();
//        int alan=kisaKenar*uzunKenar;
//        System.out.println("alan = " + alan);
//        int cevre=2*(kisaKenar+uzunKenar);
//        System.out.println("cevre = " + cevre);

//        System.out.println("Ucgenin 1. kenarini giriniz: ");
//        byte ucgenKenar1=input.nextByte();
//        System.out.println("Ucgenin 2. kenarini giriniz: ");
//        byte ucgenKenar2=input.nextByte();
//        System.out.println("Ucgenin 3. kenarini giriniz: ");
//        byte ucgenKenar3=input.nextByte();
//        int ucgenCevresi=ucgenKenar1+ucgenKenar2+ucgenKenar3;
//        System.out.println("ucgenCevresi = " + ucgenCevresi);

        System.out.println("Bir sembol giriniz: ");
        char sembol=input.next().charAt(0);
        String space=" ";
        System.out.println(space+space+sembol+space+space);
        System.out.println(space+sembol+space+sembol+space);
        System.out.println(sembol+space+sembol+space+sembol);




    }
}
