package smallstudy.stringmanipulation;

import java.util.Scanner;

public class Sm01 {
    public static void main(String[] args) {
//.Örnek: Verilen String'in ilk ve son karakterini konsolda yazdırın.
        // "Java kolay" ==> Jy


        Scanner scan = new Scanner(System.in);
        System.out.println("yazi yaziniz");
        String str =scan.nextLine();
        //1 way
        char ilkkarakter = str.charAt(0);
        System.out.print(ilkkarakter);

        char sonKarakter= str.charAt(str.length()-1);
        System.out.println(sonKarakter);
        //2 way

        String ilkKarakter2= str.substring(0,1);
        System.out.print(ilkKarakter2);

        String sonKarakter2=str.substring(str.length()-1);
        System.out.println(sonKarakter2);





    }
}
