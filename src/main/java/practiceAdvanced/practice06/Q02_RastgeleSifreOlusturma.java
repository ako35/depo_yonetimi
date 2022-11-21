package practiceAdvanced.practice06;
import java.util.Scanner;
public class Q02_RastgeleSifreOlusturma {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele
        // şifre üreten bir kod yazınız.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen karakter sayisini giriniz: ");
        int karakterSayisi=input.nextInt();
        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndeks=karakterler.length();
        StringBuilder sifre= new StringBuilder();
        int sayac=0;
        while (sayac<karakterSayisi){
            int rastgeleIndeks = (int) (Math.random() * maxIndeks);
            sifre.append(karakterler.charAt(rastgeleIndeks));
            sayac++;
        }
        System.out.println(sifre);
    }
}
