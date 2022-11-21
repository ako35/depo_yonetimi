package replit.betulhocasoru.encapsulation;

import java.util.Scanner;

public class Ogrenci extends Okul{

    private String ad;
    private String soyad;
    private Integer yas;

    public Ogrenci() {
        this("aaa","sss",10);
    }

    public Ogrenci(String ad, String soyad, Integer yas) {
        String str="";
        while (true){
            Scanner input=new Scanner(System.in);
            System.out.println("Lutfen adinizi giriniz: ");
            ad=input.nextLine();
            System.out.println("Lutfen soyadinizi giriniz: ");
            soyad=input.nextLine();
            System.out.println("Lutfen yasinizi giriniz: ");
            yas=input.nextInt();
            if (yas>15){
                System.out.println("Lutfen baska bir ogrenci bilgisi giriniz: ");
                continue;
            }
            str=ad+" "+soyad+" "+yas;
            ogrenciler.add(str);
            if (ogrenciler.size()==getMaxOgrenciSayisi()){
                break;
            }
        }
        System.out.println(getOkulAd()+" okulu ogrencileri");
        for (String w:ogrenciler){
            System.out.println(w);
        }

    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public Integer getYas() {
        return yas;
    }
}
