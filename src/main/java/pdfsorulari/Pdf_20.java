package pdfsorulari;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pdf_20 {

    public static void mailDogrula(String eMail) throws InvalidEmailIdCheckedException {
        if (eMail.contains("@hotmail.com") || eMail.contains("@gmail.com")){
            System.out.println(eMail);
        } else {
            throw new InvalidEmailIdCheckedException("Email adresi uygun degil");
        }
    }

    public static void mailDogrula1(String eMail){
        if (eMail.contains("@hotmail.com") || eMail.contains("@gmail.com")){
            System.out.println(eMail);
        } else {
            throw new InvalidEmailIdUnCheckedException("Email adresi uygun degil");
        }
    }

    private static void run() {
        throw new RuntimeException("Run more");
    }

    public static void main(String[] args) {

//        Set<String> lhs1=new TreeSet<>();
//        lhs1.add("Ali");
//        lhs1.add("Canan");
//        lhs1.add("Veli");
//        lhs1.add("Remziye");
//        System.out.println(lhs1);
//        Set<String>lhs2=new TreeSet<>();
//        lhs2.add("Ali");
//        lhs2.add("Canan");
//        System.out.println(lhs1.retainAll(lhs2));
//        System.out.println(lhs1);
//        System.out.println(lhs2);

//        try {
//            run();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }


//        String s="123";
//        System.out.println(s+1);

//        FileInputStream f=new FileInputStream("src\\main\\java\\pdfsorulari\\TextFile");
//        int i=0;
//        while ((i=f.read())!=-1){
//            System.out.print((char) i);
//        }
//        f.close();


        //6
        //mailDogrula1("ab@gmail1.com");

        //5
        //mailDogrula("ab@gmail.com");

        //4
//        String s="";
//        try {
//            s+="t";
//        } catch (Exception e){
//            s+="c";
//        } finally {
//            s+="f";
//        }
//        s+="a";
//        System.out.println(s);

        //3
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lutfen yasinizi giriniz: ");
//        try {
//            int age=scanner.nextInt();
//            if (age<0){
//                throw new IllegalArgumentException();
//            } else System.out.println(age);
//        } catch (IllegalArgumentException e){
//            e.printStackTrace();
//            System.out.println("yas icin negatif bir sayi giremezsiniz:" +e.getMessage());
//        }


        //2
//        String[] str=new String[5];
//        str[0]="elma";
//        str[1]="armut";
//        str[2]="kiraz";
//        str[3]="cilek";
//        str[4]="muz";
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lutfen istediginiz urunun indexini giriniz: ");
//        try {
//            int index=scanner.nextInt();
//            System.out.println(str[index]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("Girdiginiz sira urun sayisindan buyuk"+e.getMessage());
//        }



        //1
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Lutfen carpma yapmak icin bir string giriniz: ");
//        String sayi=scanner.next();
//        try {
//            System.out.println(Integer.parseInt(sayi)*2);
//        } catch (NumberFormatException e){
//            e.printStackTrace();
//            System.out.println("Girdiginiz string sayiya cevrilemez"+e.getMessage());
//        }



    }



}
