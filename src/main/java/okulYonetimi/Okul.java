package okulYonetimi;

import okul_yonetimi.Ogrenci;
import okul_yonetimi.Ogretmen;

public class Okul extends Pojo{
    public Okul(String ad, String soyad, String kimlikNo, String bolum, String sicilNo, int yas) {
        super(ad, soyad, kimlikNo, bolum, sicilNo, yas);
    }

    public Okul(int yas, String ad, String soyad, String kimlikNo, String numara, String sinif) {
        super(yas, ad, soyad, kimlikNo, numara, sinif);
    }

    public Okul() {
    }

    public void okulAnaSayfasi(){
        System.out.println("Okul Yonetim Paneli:\n" +
                "1-) Ogretmen Islemleri\n" +
                "2-) Ogrenci Islemleri\n" +
                "3-) Cikis");
        System.out.println("Lutfen bir secim yapiniz");
        String secim=input.next();
        boolean flag=true;
        do {
            switch (secim){
                case "1":
                    okul_yonetimi.Ogretmen ogretmen=new Ogretmen();
                    ogretmen.islemler();
                    flag=false;
                    break;
                case "2":
                    okul_yonetimi.Ogrenci ogrenci=new Ogrenci();
                    ogrenci.islemler();
                    flag=false;
                    break;
                case "3":
                    System.out.println("Program sonlandiriliyor");
                    flag=false;
                    break;
                default:
                    System.out.println("Yanlis bir secim yaptiniz");
                    System.out.println("1,2 ve 3 secimlerini kullanmalisiniz");
            }
        }while (flag);
    }

}
