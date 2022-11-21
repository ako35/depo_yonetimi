package smallstudy.stringmanipulation;

import java.util.Scanner;

public class Sm03 {
    public static void main(String[] args) {

        String st1= "Java";
        String st2= "Candir";
        // +

        System.out.println(st1 +" "+st2);//Java Candir

        System.out.println(st1.concat(st2));//JavaCandir

        String cumle = st1.concat(" ").concat(st2);
        System.out.println(cumle);//Java Candir

        // Soru 2) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // frotan@gmail.com

        String email= "frotan@gmail.com";
        String arananMetin= "@gmail.com";

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mail adresi girin");
        String mail = input.nextLine();

        if (!mail.contains("@gmail.com")){//@gmail.com
            System.out.println("Lütfen mail adresi girin");

        }else if(mail.endsWith("@gmail.com")){
            System.out.println("Mail adresi kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }





    }
}
