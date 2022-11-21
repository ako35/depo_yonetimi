package pdfsorulari;

import java.util.Scanner;

public class Pdf_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=4;
        System.out.println(str1+" "+str2+" "+sayi1+""+sayi2);
        System.out.println(str1+" "+sayi1+" "+str2);
        System.out.println(str1+" "+(sayi1+sayi2)+""+sayi2);
        System.out.println(str1+" "+(sayi1-sayi2)+""+(sayi1+sayi2));
        System.out.println(sayi1+""+sayi2+" "+str2);

//        System.out.println("Lutfen dort basamakli bir sayi giriniz: ");
//        int sayi=input.nextInt();
//        if (sayi>999 && sayi<10000){
//            int birlerBasamagi=sayi%10;
//            sayi/=10;
//            int onlarBasamagi=sayi%10;
//            sayi/=10;
//            int yuzlerBasamagi=sayi%10;
//            sayi=sayi/10;
//            int binlerBasamagi=sayi;
//            int toplam=birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi;
//            System.out.println("toplam = " + toplam);
//        } else System.out.println("Girilen sayi dort basamakli olmalidir");



    }
}
