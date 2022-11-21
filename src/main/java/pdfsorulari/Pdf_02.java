package pdfsorulari;

import java.util.Scanner;

public class Pdf_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Example 6:
        Kullanicidan gun ismini yazmasini isteyin.
        Girilen isim gecerli bir gun ise gun isminin 1.,2.ve3.harflerini
        ilk harf buyuk diger harflerini kucuk olarak yazdirin,
        gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.
        */
        System.out.println("Gun ismi giriniz");
        String gunNo= input.nextLine();

        if (gunNo.equalsIgnoreCase( "pazar")) {
            System.out.println("PAZar");
        } else if (gunNo.equalsIgnoreCase("pazartesi")) {
            System.out.println("PAZartesi");
        } else if (gunNo.equalsIgnoreCase("sali")) {
            System.out.println("SALi");
        } else if (gunNo.equalsIgnoreCase("carsamba")) {
            System.out.println("CARsamba");
        } else if (gunNo.equalsIgnoreCase("persembe")) {
            System.out.println("PERsembe");
        } else if (gunNo.equalsIgnoreCase("Cuma")) {
            System.out.println("CUMa");
        } else if (gunNo.equalsIgnoreCase("cumartesi")) {
            System.out.println("CUMartesi");
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }


        /*
        Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
        i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
        ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil) 2001-(artik yil degil)

        Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
        Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.
        Dört yılda bir gelen 366 günlük yil
        */
//        int artikYil=2000;
//        if (artikYil%100==0){
//            if (artikYil%400==0){
//                System.out.println("Artik yil");
//            }else {
//                System.out.println("Artik yil degil");
//            }
//        } else if (artikYil%4==0) {
//            System.out.println("Artik yil");
//        } else {
//            System.out.println("Artik yil degil");
//        }

//        int artikYil = 1990;
//        String sonuc = artikYil % 100 == 0 ? (artikYil % 400 == 0 ? "Artik yil" : "Artik yil degil") : (artikYil % 4 == 0 ? "Artik yil" : "Artik yil degil");
//        System.out.println(sonuc);


        /*
        Example 3: Bir sifre giriniz
        Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
        Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
        */
//        System.out.println("Bir sifre giriniz: ");
//        char sifre = input.next().charAt(0);
//        if (sifre >= 'A' && sifre <= 'Z') {
//            if (sifre == 'A') {
//                System.out.println("Gecerli sifre");
//            } else {
//                System.out.println("Gecersiz sifre");
//            }
//        } else if (sifre >= 'a' && sifre <= 'z') {
//            if (sifre == 'z') {
//                System.out.println("Gecerli sifre");
//            } else {
//                System.out.println("Gecersiz sifre");
//            }
//
//        }


        /*
        Example 2: Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
        Teklif 80.000'in uzerinde ise “Kabul ediyorum”,
        60-80.000 arasinda ise “Konusabiliriz”.
        60.000'in altinda ise “Maalesef Kabul edemem” yazdirin.
         */
//        System.out.println("Maas teklifinizi giriniz: ");
//        double teklif=input.nextDouble();
//        if (teklif>80000){
//            System.out.println("Kabul ediyorum");
//        } else if (teklif>=60000 && teklif <=80000){
//            System.out.println("Konusabiliriz");
//        } else if (teklif<60000 && teklif >0) {
//            System.out.println("Maalesef kabul edemem");
//        } else System.out.println("Lutfen gecerli bir maas giriniz");


        //7
//        String str="ali kocan";
//        int i =5;
//        System.out.println(i+str);
//        char ch='a';
//        System.out.println(i*ch);

        //6
//        int sayi1=90;
//        double sayi2=22.5;
//        double sonuc=sayi1/sayi2;
//        System.out.println("sonuc = " + sonuc);

        //5
//        int sayi1=90;
//        int sayi2=5;
//        int sonuc=sayi1/sayi2;
//        System.out.println("sonuc = " + sonuc);

        //4
//        double sayi=255.36;
//        int sayiInt=(int) sayi;
//        System.out.println("sayiInt = " + sayiInt);
//        byte sayiByte=(byte) sayiInt;
//        System.out.println("sayiByte = " + sayiByte);

        //3
//        float sayi=25.25f;
//        System.out.println("sayi = " + sayi);

        //2
//        int sayi = 50;
//        short sayiShort = (short) sayi;
//        System.out.println("sayiShort = " + sayiShort);
//        byte sayiByte=(byte) sayiShort;
//        System.out.println("sayiByte = " + sayiByte);


        //1
//        byte sayi=25;
//        short sayiShort=sayi;
//        System.out.println("sayiShort = " + sayiShort);
//        int sayiInt=sayiShort;
//        System.out.println("sayiInt = " + sayiInt);
//        float sayiFloat=sayiInt;
//        System.out.println("sayiFloat = " + sayiFloat);
//        double sayiDouble=sayiFloat;
//        System.out.println("sayiDouble = " + sayiDouble);
//

        //7
//        System.out.println("Adinizi giriniz: ");
//        String isminiz = input.next();
//        char isminIlkHarfi=isminiz.charAt(0);
//        System.out.println("isminIlkHarfi = " + isminIlkHarfi);


        //6
//        System.out.println("Adinizi giriniz: ");
//        String isminiz = input.nextLine();
//        System.out.println("Soyadinizi giriniz: ");
//        String soyisminiz = input.nextLine();
//        System.out.println("Isim-soyisim: " + isminiz+" "+soyisminiz);

        //5
//        System.out.println("Adinizi giriniz: ");
//        String isminiz=input.nextLine();
//        System.out.println("Soyadinizi giriniz: ");
//        String soyisminiz=input.nextLine();
//        System.out.println("isminiz = " + isminiz);
//        System.out.println("soyisminiz = " + soyisminiz);
//        System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");

        //4
//        System.out.println("Dikdortgenler prizmasinin kisa kenarini giriniz: ");
//        int kisaKenar=input.nextInt();
//        System.out.println("Dikdortgenler prizmasinin uzun kenarini giriniz: ");
//        int uzunKenar=input.nextInt();
//        System.out.println("Dikdortgenler prizmasinin yuksekligini giriniz: ");
//        int yukseklik=input.nextInt();
//        int prizmaHacmi=kisaKenar*uzunKenar*yukseklik;
//        System.out.println("prizmaHacmi = " + prizmaHacmi);

        //3
//        System.out.println("Lutfen yaricap giriniz: ");
//        double r=input.nextDouble();
//        double cemberCevre=2*3.14*r;
//        System.out.println("cemberCevre = " + cemberCevre);
//        double daireAlani=3.14*r*r;
//        System.out.println("daireAlani = " + daireAlani);

        //2
//        System.out.println("Karenin kenar uzunlugunu giriniz: ");
//        int kareKenarUzunlugu=input.nextInt();
//        int kareCevresi=kareKenarUzunlugu*4;
//        System.out.println("kareCevresi = " + kareCevresi);
//        int kareAlani=kareKenarUzunlugu*kareKenarUzunlugu;
//        System.out.println("kareAlani = " + kareAlani);

        //1
//        System.out.println("1. sayiyi giriniz: ");
//        int sayi11=input.nextInt();
//        System.out.println("2. sayiyi giriniz: ");
//        int sayi12=input.nextInt();
//        int toplam=sayi11+sayi12;
//        int fark=sayi11-sayi12;
//        int carpim=sayi11*sayi12;
//        System.out.println(toplam);
//        System.out.println(fark);
//        System.out.println(carpim);

        //interview question 2
//        int sayi6=10;
//        int sayi8=20;
//        sayi6=sayi8+sayi6;
//        sayi8=sayi6-sayi8;
//        sayi6=sayi6-sayi8;
//        System.out.println("sayi8 = " + sayi8);
//        System.out.println("sayi6 = " + sayi6);


        //interview question 1
//        int sayi6=10;
//        int sayi8=20;
//        int k=sayi6;
//        sayi6=sayi8;
//        sayi8=k;
//        System.out.println("sayi6 = " + sayi6);
//        System.out.println("sayi8 = " + sayi8);

        //6
//        int sayi5=550;
//        char karakter='j';
//        System.out.println(sayi5+karakter);

        //5
//        char harf='a';
//        System.out.println(harf);

        //4
//        int i = 90;
//        double d = 40.4;
//        double toplama = i + d;
//        System.out.println(toplama);

        //3
//        int sayi1 = 25;
//        byte sayi2 = 40;
//        int toplam = sayi2 + sayi1;
//        System.out.println(toplam);

        //2
//        String isim = "Ali";
//        String soyisim = "Kocan";
//        System.out.println("Isminiz: " + isim);
//        System.out.println("Soyisminiz: " + soyisim);

        //1
//        int sayi = 5500;
//        System.out.println(sayi);
//        double num1 = 23.4;
//        System.out.println(num1);
//        String str = "Ali Kocan";
//        System.out.println(str);


    }
}
