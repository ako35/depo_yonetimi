package replit.betulhocasoru.hoca;

import java.util.Scanner;

public class OkulMain {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Ogrenci okul=new Ogrenci();
        while (okul.ogrenciListesi.size()< okul.getMaxOgrenciSayisi()){
            System.out.println("Lutfen "+okul.getOgrenciId()+". ogrencinin adini giriniz: ");
            okul.getAd();
        }


    }


}
