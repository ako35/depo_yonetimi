package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q01_Ascii {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan
    // tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki karakter giriniz:");
        char ch1=scanner.next().charAt(0);
        char ch2=scanner.next().charAt(0);
        if (ch1<ch2){
            for (char i=ch1;i<ch2;i++){
                System.out.print(i);
            }
        } else {
            for (char i=ch2;i<ch1;i++){
                System.out.print(i);
            }
        }



    }



}
