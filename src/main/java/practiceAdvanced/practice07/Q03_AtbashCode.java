package practiceAdvanced.practice07;
import java.util.Arrays;
import java.util.Scanner;
public class Q03_AtbashCode {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String str=input.nextLine();
        String[] arr=str.split("");
        String a1="abcdefghijklmnopqrstuvwxyz";
        String a2="zyxwvutsrqponmlkjihgfedcba";
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(" ")){
                System.out.print(" ");
            } else {
                for (int j=0;j<a1.length();j++){
                    if (arr[i].charAt(0)==a1.charAt(j)){
                        System.out.print(a2.charAt(j));
                    }
                }
            }
        }
    }
}
