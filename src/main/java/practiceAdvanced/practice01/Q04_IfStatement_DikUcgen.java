package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {

        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin
         kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 1. kenari giriniz: ");
        int sayi1=input.nextInt();
        System.out.println("Lutfen 2. kenari giriniz: ");
        int sayi2=input.nextInt();
        System.out.println("Lutfen 3. kenari giriniz: ");
        int sayi3=input.nextInt();
        if (sayi1*sayi1+sayi2*sayi2==sayi3*sayi3 ||
                sayi1*sayi1+sayi3*sayi3==sayi2*sayi2 ||
                sayi3*sayi3+sayi2*sayi2==sayi1*sayi1){
            System.out.println("Bu bir dik ucgendir");
        } else  System.out.println("Bu bir dik ucgen degildir");



    }
}
