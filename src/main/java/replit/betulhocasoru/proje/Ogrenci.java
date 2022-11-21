package replit.betulhocasoru.proje;

import java.util.Hashtable;
import java.util.Scanner;

public class Ogrenci extends Okul{

    private String ad;
    private String soyad;
    private int yas;
    Hashtable<Integer,Ogrenci>ogrenciHashtable=new Hashtable<>();

    public Ogrenci() {
        this("aaa","sss",10);
    }

    public Ogrenci(String ad, String soyad, int yas) {

        Integer i=0;
        while (ogrenciHashtable.size()<getMaxOgrenciSayisi()){
            Scanner input=new Scanner(System.in);
            System.out.println("Lutfen "+(int) (i+1)+".ogrenci yasini giriniz: ");
            yas=input.nextInt();
            if (yas>15){
                System.out.println("Yas 15'den buyuk olamaz");
                continue;
            } else {
                System.out.println("Lutfen "+(int) (i+1)+".ogrenci adini giriniz: ");
                ad=input.next();
                System.out.println("Lutfen "+(int) (i+1)+".ogrenci soyadini giriniz: ");
                soyad=input.next();

                ogrenciHashtable.put(i,new Ogrenci(ad,soyad,yas));
                i++;
            }
        }
        System.out.println(getOkulAd()+" okulundaki ogrenci listesi");
        for (Ogrenci w:ogrenciHashtable.values()){
            System.out.println(w);
        }

    }

    @Override
    public String toString() {
        return getOkulAd()+
                "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
