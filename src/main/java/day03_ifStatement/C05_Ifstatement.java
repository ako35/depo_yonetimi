package day03_ifStatement;

import java.util.Scanner;

public class C05_Ifstatement {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4 \n");

        int islem=input.nextInt();
        System.out.println("Lutfen iki tamsayi giriniz: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();

        if (islem==1){
            System.out.println("Toplama isleminin sonucu= "+num1+"+"+num2+"="+(num1+num2));
        } else if (islem==2) {
            System.out.println("Cikarma isleminin sonucu= "+num1+"-"+num2+"="+(num1-num2));
        } else if (islem==3) {
            System.out.println("Bolme isleminin sonucu= "+num1+"/"+num2+"="+(num1/num2));
        }else if (islem==4) {
            System.out.println("Carpma isleminin sonucu= "+num1+"*"+num2+"="+(num1*num2));
        }else {
            System.out.println("Hatali giris yaptiniz...");
        }
    }
}
