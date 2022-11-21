package replit.betulhocasoru;

import java.util.Scanner;

public class Sinif {

    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
//  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
//  3- Bütün fieldlar için encapsulation uygulayınız.
//  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
//     ArrayList cinsinden Öğrencileri olsun.
//  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
//  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
//     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
//     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.


    private String ad;
    private String soyad;
    private int yas;

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    Okul bilgi = new Okul();
    Scanner input = new Scanner(System.in);


    public Sinif(String ad, String soyad, int yas) {

        while(bilgi.ogrenciler.size()<=bilgi.getMaxOgrenciSayisi()){
            System.out.println("Lutfen ogrencinin yasini giriniz");
            yas = input.nextInt();
            if (yas < 1) {
                System.out.println("Gecersiz yas bilgisi");
            } else if (yas > 15) {
                System.out.println("Ogrencinin yasi 15'ten buyuk olamaz. Baska bir ogrenci bilgisi giriniz.");
            } else {
                System.out.println("Lutfen ogrencinin adini giriniz");
                ad = input.next();
                System.out.println("Lutfen ogrencinin soyadini giriniz");
                soyad = input.next();

                bilgi.ogrenciler.add(ad + " " + soyad);
            }
        }
        System.out.println("Girilen ogrenci bilgileri: " + bilgi.ogrenciler);
    }
}
