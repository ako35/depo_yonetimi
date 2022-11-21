package pdfsorulari;

import java.util.Scanner;

public class Pdf_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //5
        System.out.println("Lutfen bir sayi giriniz: ");
        String sayi=input.next();
        String sonuc=sayi.length()==3 ? "Uc basamakli bir sayi" : "Uc basamakli degil";
        System.out.println(sonuc);

        //4
//        System.out.println("Lutfen dikdortgenin uzunlugunu ve genisligini giriniz: ");
//        int uzunluk=input.nextInt();
//        int genislik=input.nextInt();
//        String kareMi=uzunluk==genislik ? "Kare" : "Kare degil";
//        System.out.println(kareMi);

        //3
//        int y=5;
//        System.out.println((y>5) ? (y<10?2*y:3*y):(y>10?2+y:3+y));

        //2
//        int y=12;
//        System.out.println((y>5) ? (y<10?2*y:3*y):(y>10?2+y:3+y));

        //1
//        int y=8;
//        System.out.println((y>5) ? (y<10?2*y:3*y):(y>10?2+y:3+y));

        //2
//        System.out.println("Lutfen bie harf giriniz: ");
//        char harf=input.next().charAt(0);
//        String sonuc= (harf>='a' && harf<='z') ? "Kucuk harf" : ((harf>='A' && harf<='Z') ? "Buyuk harf": "Girdiginiz karakter harf degil");
//        System.out.println(sonuc);

        //1
//        System.out.println("Lutfen bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        String sonuc=sayi<10 ? "Rakam":(sayi<100 ? "Iki basamakli sayi" : "Uc basamakli veya daha buyuk sayi");
//        System.out.println(sonuc);

        //4
//        System.out.println("Lutfen bir sayi giriniz: ");
//        int sayi =input.nextInt();
//        Object sonuc=sayi>=0 ? ("Sayi pozitif") : (sayi*sayi);
//        System.out.println(sonuc);

        //3
//        System.out.println("Lutfen bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        int mutlakDeger=sayi<0 ? -1*sayi:sayi;
//        System.out.println(sayi+" mutlak degeri = " + mutlakDeger);

        //2
//        System.out.println("Lutfen bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        String tekCift=sayi%2==0 ? "Cift sayi" : "Tek sayi";
//        System.out.println(sayi +" "+ tekCift);

        //1
//        System.out.println("Lutfen iki sayi giriniz: ");
//        int sayi1=input.nextInt();
//        int sayi2=input.nextInt();
//        int buyukOlmayanSayi=sayi1<sayi2 ? sayi1:sayi2;
//        System.out.println("buyukOlmayanSayi = " + buyukOlmayanSayi);



        //1
//        int y=112;
//        System.out.println((y>5) ? ("inek"):("koyun"));

        //2
//        int y=112;
//        System.out.println(y<91 ? 9:11);

        //3
//        int y=5;
//        int z=1;
//        int a=y<10 ? y++:z++;
//        System.out.println(y+","+z+","+a);



        //10
//        System.out.println("Lutfen bir yil giriniz: ");
//        int yil = input.nextInt();
//        if (yil%4==0){
//            if (yil%100==0){
//                if (yil%400==0){
//                    System.out.println("Artik yildir");
//                } else System.out.println("Artik yil degildir");
//            }
//
//        } else System.out.println("Artik yil degildir");


        //13
//        System.out.println("Lutfen bir yil giriniz: ");
//        int yil = input.nextInt();
//        if (yil % 4 == 0) {
//            if (yil % 100 == 0) {
//                if (yil % 400 == 0) {
//                    System.out.println("Artik yil");
//                } else System.out.println("Artik yil degildir");
//            } else System.out.println("Artik yil");
//        } else System.out.println("Artik yil degildir");

        //12
//        System.out.println("Lutfen dort basamakli bir sayi giriniz: ");
//        int sayi=input.nextInt();
//       if (sayi/1000>=1 && sayi/1000<=9){
//           if (sayi%5==0){
//               if (sayi%10==0){
//                   System.out.println("5'e bolunen cift sayi");
//               }else System.out.println("5'e bolunen tek sayi");
//           }else System.out.println("Tekrar deneyin");
//       }else System.out.println("4 basamakli bir sayi giriniz");

        //11
//        System.out.println("Lutfen bir sifre giriniz: ");
//        String sifre=input.next();
//        char ilkHarf=sifre.charAt(0);
//        if (ilkHarf>='A' && ilkHarf<='Z'){
//            if (ilkHarf=='A'){
//                System.out.println("Gecerli sifre");
//            } else System.out.println("Gecersiz sifre");
//        } else if (ilkHarf>='a' && ilkHarf<='z') {
//            if (ilkHarf=='z'){
//                System.out.println("Gecerli sifre");
//            } else System.out.println("Gecersiz sifre");
//
//        }

        //8
//        System.out.println("Lutfen maas icin bir teklif giriniz: ");
//        double maas=input.nextDouble();
//        if (maas<0){
//            System.out.println("Pozitif bir deger giriniz");
//        } else {
//            if (maas<60000){
//                System.out.println("Maalesef kabul edemem");
//            } else if (maas<80000) {
//                System.out.println("Konusabiliriz");
//
//            }else System.out.println("Kabul ediyorum");
//        }

        //7
//        System.out.println("Lutfen notunuzu giriniz: ");
//        int not=input.nextInt();
//        if (not<0 || not>100){
//            System.out.println("0-100 Araliginda bir sayi giriniz: ");
//        } else {
//            if (not<50){
//                System.out.println("D");
//            } else if (not<60) {
//                System.out.println("C");
//
//            } else if (not<80) {
//                System.out.println("B");
//
//            }else System.out.println("A");
//        }

        //6
//        System.out.println("Lutfen iki sayi giriniz: ");
//        int sayi1=input.nextInt();
//        int sayi2=input.nextInt();
//        if (sayi1>0 && sayi2>0){
//            System.out.println(sayi1+sayi2);
//        } else if (sayi1<0 && sayi2<0) {
//            System.out.println(sayi1*sayi2);
//        }else if (sayi1*sayi2<0){
//            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
//        }else System.out.println("Sifir carpmaya gore yutan elemandir");


        //5
//        System.out.println("Lutfen bir gun ismi giriniz: ");
//        String day=input.next();
//        Boolean gecerliDay=day.equalsIgnoreCase("Monday") ||
//                day.equalsIgnoreCase("Tuesday") ||
//                day.equalsIgnoreCase("Wednesday") ||
//                day.equalsIgnoreCase("Thursday") ||
//                day.equalsIgnoreCase("Friday") ||
//                day.equalsIgnoreCase("Saturday") ||
//                day.equalsIgnoreCase("Sunday");
//        if (gecerliDay){
//            String kisaDay=day.substring(0,1).toUpperCase()+day.substring(1,3);
//            System.out.println(kisaDay);
//        }else System.out.println("Gecerli gun ismi giriniz...");

        //4
//        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz: ");
//        int kenar1=input.nextInt();
//        int kenar2=input.nextInt();
//        int kenar3=input.nextInt();
//        if (kenar1==kenar2 && kenar2==kenar3){
//            System.out.println("Eskenar Ucgen");
//        } else System.out.println("Eskenar Degil");

        //3
//        System.out.println("Lutfen yasinizi giriniz: ");
//        int age=input.nextInt();
//        if (age<65){
//            System.out.println("Emekli olamazsin...");
//        }else System.out.println("Emekli olabilirsin...");

        //2
//        System.out.println("Lutfen bir karakter giriniz: ");
//        String ch=input.next();
//        if (ch.length()==1){
//            char harf=ch.charAt(0);
//            if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
//                System.out.println("Girilen karakter harftir.");
//            }else System.out.println("Girilen karakter harf degildir...");
//        }else System.out.println("Tek bir karakter giriniz...");

        //1
//        System.out.println("Dikdortgenin kenar uzunluklarini giriniz: ");
//        int kenar1=input.nextInt();
//        int kenar2=input.nextInt();
//        int kenar3=input.nextInt();
//        int kenar4=input.nextInt();
//        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
//            System.out.println("Kenar uzunluklari girilen dikdortgen bir karedir...");
//        }else System.out.println("Kenar uzunluklari girilen dikdortgen bir kare degildir...");


        //5
//        System.out.println("Lutfen bir gun ismi giriniz: ");
//        String day=input.next();
//        if (day.equalsIgnoreCase("Friday")){
//            System.out.println("Muslumanlar icin kutsal gun");
//        } else if (day.equalsIgnoreCase("Saturday")){
//            System.out.println("Yahudiler icin kutsal gun");
//        } else if (day.equalsIgnoreCase("Sunday")){
//            System.out.println("Hristiyanlar icin kutsal gun");
//        } else System.out.println("Dogru bir gun ismi giriniz...");

        //4
//        System.out.println("Dikdortgenin kenar uzunluklarini giriniz: ");
//        int kenar1=input.nextInt();
//        int kenar2=input.nextInt();
//        int kenar3=input.nextInt();
//        int kenar4=input.nextInt();
//        if (kenar1==kenar2 && kenar2==kenar3 && kenar3==kenar4){
//            System.out.println("Kenar uzunluklari girilen dikdortgen bir karedir...");
//        }else System.out.println("Kenar uzunluklari girilen dikdortgen bir kare degildir...");

        //3
//        System.out.println("Lutfen gun ismi giriniz: ");
//        String day=input.next();
//        if (day.equalsIgnoreCase("Monday")){
//            System.out.println("Hafta ici");
//        } else if (day.equalsIgnoreCase("Tuesday")){
//            System.out.println("Hafta ici");
//        } else if (day.equalsIgnoreCase("Wednesday")){
//            System.out.println("Hafta ici");
//        } else if (day.equalsIgnoreCase("Thursday")){
//            System.out.println("Hafta ici");
//        } else if (day.equalsIgnoreCase("Friday")){
//            System.out.println("Hafta ici");
//        } else if (day.equalsIgnoreCase("Saturday")){
//            System.out.println("Hafta sonu");
//        } else if (day.equalsIgnoreCase("Sunday")){
//            System.out.println("Hafta sonu");
//        } else System.out.println("Gecerli gun ismi giriniz...");

        //2 Monday Tuesday Wednesday Thursday Friday Saturday Sunday
//        System.out.println("Lutfen gun isimlerinden birinin ilk harfini giriniz: ");
//        char ch=input.next().toUpperCase().charAt(0);
//        if (ch=='m'){
//            System.out.println("Monday");
//        } else if (ch=='t'){
//            System.out.println("Tuesday, Thursday");
//        } else if (ch=='w'){
//            System.out.println("Wednesday");
//        } else if (ch=='f'){
//            System.out.println("Friday");
//        } else if (ch=='s'){
//            System.out.println("Saturday, Sunday");
//        } else System.out.println("Dogru karakter giriniz...");


        //1
//        System.out.println("Lutfen bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        if (sayi%2==0){
//            System.out.println("Girilen "+sayi+" sayisi ciftir...");
//        } else System.out.println("Girilen "+sayi+" sayisi tektir...");
//

    }
}
