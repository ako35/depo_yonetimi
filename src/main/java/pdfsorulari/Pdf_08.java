package pdfsorulari;

import java.util.Scanner;

public class Pdf_08 {
    /*
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */

     /*
    SORU: Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

    public static void tersCevirme(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz: ");
        String str=input.nextLine();
        String strTersi="";
        for (int i=str.length()-1;i>=0;i--){
            strTersi+=str.charAt(i);
        }
        System.out.println(strTersi);
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //6
//        int toplam=0;
//        int sayac=0;
//        do {
//            System.out.println("Lutfen bir sayi giriniz: ");
//            int sayi=input.nextInt();
//            toplam+=sayi;
//            sayac+=1;
//        }while (toplam<500);
//        System.out.println(toplam);
//        System.out.println(sayac);

        //5
//        boolean sifreGecerli;
//        do {
//            System.out.println("Lutfen bir sifre giriniz: ");
//            String sifre=input.next();
//            boolean kucukHarf=sifre.replaceAll("[^a-z]","").length()>0;
//            boolean buyukHarf=sifre.replaceAll("[^A-Z]","").length()>0;
//            boolean ozelKarakter=sifre.replaceAll("[A-Z a-z 0-9]","").length()>0;
//            boolean karakterSayisi8=sifre.length()>7;
//            sifreGecerli=kucukHarf && buyukHarf && ozelKarakter && karakterSayisi8;
//        } while (!sifreGecerli);
//        System.out.println("Sifreniz kabul edilmistir...");


        //4
//        int sayi=0;
//        int toplam=0;
//        int sayacPozitif=0;
//        int sayacNegatif=0;
//        do {
//            System.out.println("Lutfen pozitif sayilar giriniz: ");
//            System.out.println("Islemi bitirmek icin 0'a basiniz: ");
//            sayi=input.nextInt();
//            if (sayi<0){
//                System.out.println("Negatif sayi giremezsiniz");
//                sayacNegatif+=1;
//            } else if (sayi>0){
//                toplam+=sayi;
//                sayacPozitif+=1;
//            } else System.out.println("Cikis yapildi");
//        } while (sayi!=0);
//        System.out.println(toplam);
//        System.out.println(sayacNegatif);
//        System.out.println(sayacPozitif);


        //3
//        int sayi;
//        int toplam=0;
//        int sayac=0;
//        do {
//            System.out.println("Lutfen pozitif sayi giriniz: ");
//            System.out.println("Islemi bitirmek icin 0'a basiniz");
//            sayi=input.nextInt();
//            toplam+=sayi;
//            sayac+=1;
//
//        } while (sayi!=0);
//        System.out.println(sayac+" sayi girilmistir");
//        System.out.println("toplami : "+toplam);


        //2
//        char ch='m';
//        do {
//            System.out.println(ch);
//            ch--;
//        } while (ch>'c');

        //1
//        int sayi=9;
//        do {
//            if (sayi%7==0){
//                System.out.println(sayi);
//            }
//            sayi++;
//        } while (sayi<190);

        //7
//        System.out.println("Bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        int rakamToplami=0;
//        while (sayi!=0){
//            rakamToplami+=sayi%10;
//            sayi/=10;
//        }
//        System.out.println(rakamToplami);

        //6
//        System.out.println("Lutfen bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        int i=1;
//        int tamBolenSayisi=0;
//        while (i<sayi){
//            if (sayi%i==0){
//                System.out.println("Tam Bolen = "+i);
//                tamBolenSayisi+=1;
//            }
//            i++;
//        }
//        System.out.println("tamBolenSayisi: "+tamBolenSayisi);

        //5
//        System.out.println("Lutfen bir rakam giriniz: ");
//        byte rakam=input.nextByte();
//        int i=1;
//        while (i<11){
//            System.out.print(rakam+"x"+i+"="+i*rakam+" ");
//            i++;
//        }

        //4
//        System.out.println("Lutfen baslangic ve bitis harflerini giriniz: ");
//        char baslangicHarf=input.next().charAt(0);
//        char bitisHarf=input.next().charAt(0);
//        char i=baslangicHarf;
//        while (i<=bitisHarf){
//            System.out.println(i);
//            i++;
//        }

        //3
//        System.out.println("Lutfen baslangic ve bitis degerlerini giriniz: ");
//        int baslangic=input.nextInt();
//        int bitis=input.nextInt();
//        int i=baslangic;
//        while (i<=bitis){
//            if (i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }

        //2
//        int i=100;
//        while (i<1000){
//            if (i%15==0 && i%20==0 && i%90==0){
//                System.out.println(i);
//            }
//            i++;
//        }

        //1
//        int i=3;
//        while (i<13){
//            System.out.println(i);
//            i++;
//        }

        //13
//        System.out.println("Lutfen pozitif bir rakam giriniz: ");
//        byte rakam=input.nextByte();
//        for (int i=1;i<=rakam;i++){
//            for (int j=1;j<=rakam;j++){
//                System.out.print(j*i);
//            }
//            System.out.println();
//        }

        //12
//        System.out.println("Lutfen pozitif bir rakam giriniz: ");
//        byte rakam=input.nextByte();
//        for (int i=1;i<=rakam;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //11
//        System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz: ");
//        int sayi=input.nextInt();
//        int faktoriyel=1;
//        for (int i=1;i<sayi+1;i++){
//            faktoriyel*=i;
//        }
//        System.out.println(faktoriyel);

        //10
//        System.out.println("Lutfen iki sayi giriniz: ");
//        int sayi1=input.nextInt();
//        int sayi2=input.nextInt();
//        int toplam=0;
//        if (sayi2>sayi1){
//            for (int i=sayi1;i<=sayi2;i++){
//                toplam+=i;
//            }
//            System.out.println(toplam);
//        } else if (sayi1>sayi2) {
//            for (int i=sayi2;i<=sayi1;i++){
//                toplam+=i;
//            }
//            System.out.println(toplam);
//        } else System.out.println(sayi1);

        //9
//        System.out.println("Lutfen bir String giriniz: ");
//        String str=input.nextLine();
//        String strTersi="";
//        for (int i=str.length()-1;i>=0;i--){
//            strTersi+=str.charAt(i);
//        }
//        System.out.println(strTersi);
//        if (str.equals(strTersi)){
//            System.out.println("Girilen string palindrome bir stringdir");
//        } else System.out.println("Girilen string palindrome bir string degildir");


        //8
//        tersCevirme();


        //7
//        System.out.println("Lutfen bir String giriniz: ");
//        String str=input.nextLine();
//        String strTersi="";
//        for (int i=str.length()-1;i>=0;i--){
//            strTersi+=str.charAt(i);
//        }
//        System.out.println(strTersi);



        //6
//        System.out.println("Lutfen 100'den kucuk bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        for (int i=1;i<sayi;i++){
//            if (i%3==0 && i%5==0){
//                System.out.println("Java Guzeldir");
//            } else if (i%3==0) {
//                System.out.println("Java");
//            } else if (i%5==0) {
//                System.out.println("Guzeldir");
//            } else System.out.println(i);
//        }

        //5
//        System.out.println("Lutfen 100'den kucuk bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        for (int i=1;i<sayi;i++){
//            if (i%3==0 || i%5==0){
//                System.out.println(i);
//            }
//        }

        //4
//        System.out.println("Lutfen 100'den kucuk bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        for (int i=1;i<sayi;i++){
//            if (i%3==0){
//                System.out.println(i);
//            }
//        }

        //3
//        for (int i=100;i>49;i--){
//            System.out.print(i+",");
//        }

        //2
//        for (int i=10;i<31;i++){
//            System.out.print(i+",");
//        }

        //1
//        String str="Java guzeldir";
//        for (int i=0;i<10;i++){
//            System.out.println(str);
//        }



    }
}
