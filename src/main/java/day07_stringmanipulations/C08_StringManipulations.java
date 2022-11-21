package day07_stringmanipulations;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın
        Scanner input=new Scanner(System.in);

//        System.out.println("Lutfen email adresinizi giriniz: ");
//        String email=input.nextLine();
//        if (email.contains("@gmail.com")){
//            if (email.endsWith("@gmail.com")){
//                System.out.println("Email adresiniz kaydedildi");
//            } else System.out.println("Lutfen yazimi kontrol edin");
//
//        } else System.out.println("Lutfen gmail adresinizi giriniz");

        /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali



        */
        boolean sifreGecerli;
        do {
            System.out.println("Lutfen bir sifre giriniz: ");
            String sifre=input.nextLine();
            boolean space=sifre.replaceAll("[^ ]","").length()==0;
            boolean buyukHarf=sifre.replaceAll("[^A-Z]","").length()==0;
            boolean sonKarakter=sifre.endsWith(".");
            boolean karakterSayisi8=sifre.length()>7;
            sifreGecerli=space && buyukHarf && sonKarakter && karakterSayisi8;
        } while (!sifreGecerli);
        System.out.println("Sifreniz kabul edilmistir...");




    }

}
