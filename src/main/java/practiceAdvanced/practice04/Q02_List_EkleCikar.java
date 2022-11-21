package practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        List<Integer>list=new ArrayList<>();
        while (true){
            System.out.println("Ekleme yapmak icin 1\n" +
                    "Guncelleme yapmak icin 2\n" +
                    "Silmek icin 3\n" +
                    "Cikmak icin q' ya basiniz");
            String option=input.next();
            if (option.equalsIgnoreCase("1")){
                System.out.println("Eklemek istediginiz sayiyi giriniz");
                int eklenecekSayi=input.nextInt();
                list.add(eklenecekSayi);
            } else if (option.equalsIgnoreCase("2")){
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                int guncellenecekSayi=input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz");
                int yeniSayi=input.nextInt();
                list.set(list.indexOf(guncellenecekSayi), yeniSayi);
            } else if (option.equalsIgnoreCase("3")) {
                System.out.println("Silmek istediginiz sayiyi giriniz");
                int silinecekSayi=input.nextInt();
                list.remove(list.indexOf(silinecekSayi));
            } else if (option.equalsIgnoreCase("q")) {
                break;
            } else System.out.println("Gecerli bir komut giriniz");
            System.out.println(list);
        }
        System.out.println("Gule gule");




    }


}
