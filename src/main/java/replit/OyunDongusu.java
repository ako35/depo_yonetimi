package replit;
import java.util.Scanner;
public class OyunDongusu extends Constructors01{
    static Constructors01 oyuncu1=new Constructors01();
    static Constructors01 oyuncu2=new Constructors01();
    void oyunDongusu(){
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci oyuncu: ");
        oyuncu1.isim=input.nextLine();
        System.out.println("Ikinci oyuncu: ");
        oyuncu2.isim=input.nextLine();
        System.out.println(oyuncu1.isim+" oyunu baslatmak icin kelime giriniz: ");
        kelime.append(input.next());
        System.out.println(oyuncu2.isim+" kelime gecerli mi ? (e/h)");
        char gecerliMi=input.next().charAt(0);
        char cevap=' ';
        char basSonMu=' ';
        String girilenEk="";
        if (gecerliMi=='e'){
            do {
                System.out.println(oyuncu2.isim+" kelimenin basina mi yoksa sonuna mi eklemek istiyorsunuz? (b/s)");
                basSonMu=input.next().charAt(0);
                System.out.println(oyuncu2.isim+" kelimeye ek giriniz: ");
                girilenEk=input.next();
                if (basSonMu=='b'){
                    kelime.insert(0,girilenEk);
                } else kelime.append(girilenEk);
                oyuncu2.puan+=girilenEk.length();
                System.out.println(kelime);
                System.out.println(oyuncu2.isim+" nin puani "+oyuncu2.puan);
                System.out.println(oyuncu1.isim+" Oyuna devam etmek istiyor musunuz? (e/h)");
                cevap=input.next().charAt(0);
                if (cevap=='h'){
                    break;
                }
                System.out.println(oyuncu1.isim+" kelimenin basina mi yoksa sonuna mi eklemek istiyorsunuz? (b/s)");
                basSonMu=input.next().charAt(0);
                System.out.println(oyuncu1.isim+" kelimeye ek giriniz: ");
                girilenEk=input.next();
                if (basSonMu=='b'){
                    kelime.insert(0,girilenEk);
                } else kelime.append(girilenEk);
                oyuncu1.puan+=girilenEk.length();
                System.out.println(kelime);
                System.out.println(oyuncu1.isim+" nin puani "+oyuncu1.puan);

                System.out.println(oyuncu2.isim+" Oyuna devam etmek istiyor musunuz? (e/h)");
                cevap=input.next().charAt(0);

            } while (cevap!='h');
            System.out.println("Oyun bitti");
            System.out.println(oyuncu1.isim+" nin puani "+oyuncu1.puan);
            System.out.println(oyuncu2.isim+" nin puani "+oyuncu2.puan);
            if (oyuncu1.puan>oyuncu2.puan){
                System.out.println(oyuncu1.isim+" kazandi");
            } else if (oyuncu1.puan<oyuncu2.puan){
                System.out.println(oyuncu2.isim+" kazandi");
            } else System.out.println("Oyun berabere");
        } else {
            System.out.println("Gecersiz kelime... "+oyuncu2.isim+" oyunu kazandi");
        }
    }
}
