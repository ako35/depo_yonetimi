package pdfsorulari;

import java.util.Scanner;

public class Pdf_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        //7
//        System.out.println("Lutfen isminizi giriniz: ");
//        String isim=input.nextLine();
//        System.out.println("Lutfen soyisminizi giriniz: ");
//        String soyIsim=input.nextLine();
//        System.out.println("Lutfen kredi bilgilerinizi giriniz: ");
//        String krediKarti=input.nextLine();
//        isim=isim.substring(0,1).toUpperCase()+isim.substring(1,isim.length()).replaceAll("[A-Za-z]","*");
//        System.out.println("isim = " + isim);
//        soyIsim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1,soyIsim.length()).replaceAll("[A-Za-z]","*");
//        System.out.println("soyIsim = " + soyIsim);
//        krediKarti=krediKarti.substring(0,krediKarti.length()-4).replaceAll("[0-9]","*")+krediKarti.substring(krediKarti.length()-4,krediKarti.length());
//        System.out.println("krediKarti = " + krediKarti);
//        System.out.println("isim-soyisim : "+isim+" "+soyIsim);
//        System.out.println("kart-no : "+krediKarti);



        //6
//        System.out.println("Lutfen bir sifre giriniz: ");
//        String sifre=input.next();
//        int sifreUzunlugu=sifre.length();
//        boolean ilkHarfBuyukMu=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
//        boolean sonHarfKucukMu=sifre.charAt(sifreUzunlugu-1)>='a' && sifre.charAt(sifreUzunlugu-1)<='z';
//        boolean sifre8KarakterliMi=sifreUzunlugu>7;
//        boolean boslukVarMi=(sifre.contains(" "));
//        if (ilkHarfBuyukMu && sonHarfKucukMu && sifre8KarakterliMi && !boslukVarMi){
//            System.out.println("Sifre basari ile tamamlandi");
//        } else System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");



        //5
//        System.out.println("Dort harfli bir kelime giriniz: ");
//        String kelime=input.next();
//        int i=kelime.length();
//        String kelimeTersi=kelime.substring(i-1,i)+kelime.substring(i-2,i-1)+kelime.substring(i-3,i-2)+kelime.substring(i-4,i-3);
//        System.out.println(kelimeTersi);


        //4
//        System.out.println("Lutfen bir isim giriniz: ");
//        String isim=input.nextLine();
//        System.out.println("Lutfen bir soyisim giriniz: ");
//        String soyisim=input.nextLine();
//        int isimUzunlugu=isim.length();
//        int soyisimUzunlugu=soyisim.length();
//        if (isimUzunlugu<soyisimUzunlugu){
//            System.out.println("Soyisim isimden daha uzundur");
//        } else System.out.println("Isim soyisimden daha uzundur");

        //3
//        System.out.println("Lutfen bir isim giriniz: ");
//        String isim=input.nextLine();
//        if (isim.contains("a")){
//            System.out.println("Girdiginiz isim a harfi iceriyor");
//        }
//        if (isim.contains("Z")) {
//            System.out.println("Girdiginiz isim Z harfi iceriyor");
//        }
//        if (isim.contains("a") || isim.contains("Z")){
//
//        } else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");

        //2
//        String str1="$13.99";
//        str1=str1.substring(1);
//        String str2="$10.55";
//        str2=str2.substring(1);
//        Double double1=Double.parseDouble(str1);
//        Double double2=Double.parseDouble(str2);
//        System.out.println(double1+double2);

        //1
//        String cumle="  Java ogrenmek123 Cok guzel@  ";
//        cumle=cumle.trim();
//        cumle=cumle.replaceAll("[^A-Za-z ]","");
//        int cumleLength=cumle.length();
//        cumle=cumle.substring(0,1)+cumle.substring(1,cumleLength).toLowerCase()+".";
//        System.out.println(cumle);


//        String cumle="  Java ogrenmek123 Cok guzel@  ";
//        cumle=cumle.trim().replaceAll("\\d","");
//        int cumleLength=cumle.length();
//        cumle=cumle.substring(0,1)+cumle.substring(1,cumleLength-1).toLowerCase()+".";
//        System.out.println(cumle);

        //2
//        System.out.println("Lutfen bir cumle giriniz: ");
//        String cumle=input.nextLine().toLowerCase();
//        if (cumle.contains("buyuk")){
//            System.out.println(cumle.toUpperCase());
//        } else if (cumle.contains("kucuk")) {
//            System.out.println(cumle.toLowerCase());
//        } else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");

        //1
//        System.out.println("Lutfen email adresinizi giriniz: ");
//        String email=input.nextLine();
//        if (email.contains("@gmail.com")){
//            if (email.endsWith("@gmail.com")){
//                System.out.println("Email adresiniz kaydedildi");
//            } else System.out.println("Lutfen yazimi kontrol edin");
//
//        } else System.out.println("Lutfen gmail adresinizi giriniz");

        //2
//        System.out.println("Bir cumle giriniz: ");
//        String cumle=input.nextLine();
//        System.out.println("Bir kelime giriniz: ");
//        String kelime=input.nextLine();
//        boolean kelimeCumledeVarMi=cumle.contains(kelime);
//        if (kelimeCumledeVarMi){
//            if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
//                System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
//            } else System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
//
//        } else System.out.println("Girilen kelime cumlede kullanilmamis");



        //1
//        System.out.println("Bir cumle giriniz: ");
//        String cumle=input.nextLine();
//        System.out.println("Bir harf giriniz: ");
//        char harf=input.next().charAt(0);
//        boolean harfCumledeVarMi=cumle.lastIndexOf(harf)!=-1;
//        if (harfCumledeVarMi){
//            System.out.println("Harf cumle icerisinde var");
//        }

        //2
//        System.out.println("Bir cumle giriniz: ");
//        String cumle=input.nextLine();
//        System.out.println("Bir kelime giriniz: ");
//        String kelime=input.nextLine();
//        boolean kelimeKullanilmamis=cumle.indexOf(kelime)==-1;
//        boolean kelime1KereKullanilmis=cumle.indexOf(kelime)==cumle.lastIndexOf(kelime);
//        if (kelimeKullanilmamis){
//            System.out.println("Girilen kelime cumlede kullanilmamis");
//        } else if (kelime1KereKullanilmis){
//            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
//        } else System.out.println("Girilen kelime 1'den fazla kullanilmis");


        //1
//        System.out.println("Bir cumle giriniz: ");
//        String cumle=input.nextLine();
//        System.out.println("Bir harf giriniz: ");
//        char harf=input.next().charAt(0);
//        boolean harfInCumle=cumle.indexOf(harf)!=-1;
//        if (harfInCumle){
//            System.out.println("Harf cumlenin icinde var");
//        } else System.out.println("Harf cumlenin icinde yok");

    }
}
