package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi aralarinda bir bosluk birakarak gir");
        String str=input.nextLine();
        String arr[]=str.split(" ");
        for (String w:arr){
            System.out.println(w);
        }

        String ad=str.substring(0,str.indexOf(" "));
        System.out.println("ad = " + ad);
        String soyad=str.substring(str.indexOf(" ")+1);
        System.out.println("soyad = " + soyad);



    }
}
