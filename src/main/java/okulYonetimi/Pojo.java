package okulYonetimi;

import okul_yonetimi.Ogrenci;
import okul_yonetimi.Ogretmen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pojo {

    Map<String, Ogrenci>ogrenciListesi=new HashMap<>();
    Map<String, Ogretmen> ogretmenListesi=new HashMap<>();
    Scanner input=new Scanner(System.in);
    String ad;
    String soyad;
    private String kimlikNo;
    int yas;
    String bolum;
    String sicilNo;
    String numara;
    String sinif;

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public Pojo(String ad, String soyad, String kimlikNo, String bolum, String sicilNo, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
        this.yas = yas;
    }

    public Pojo(int yas, String ad, String soyad, String kimlikNo, String numara, String sinif) {
        this.yas = yas;
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.numara = numara;
        this.sinif = sinif;
    }

    public Pojo() {
    }



}
