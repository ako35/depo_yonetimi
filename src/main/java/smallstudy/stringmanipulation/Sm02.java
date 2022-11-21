package smallstudy.stringmanipulation;

import java.util.Scanner;

public class Sm02 {
    public static void main(String[] args) {

        //  3.Ornek : Bir String da  herhangi bir karakter olup olmadığını kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.println("yazi yaziniz");
        String str =scan.nextLine();

        boolean contain = str.contains("a");
        System.out.println(contain);//false

        if (str.contains("a")){
            System.out.println("karakter var");
        }else {
            System.out.println("karakter yok ");
        }

        String buyuk = str.toLowerCase();
        System.out.println(buyuk);




    }
}
