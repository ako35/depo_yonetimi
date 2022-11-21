package replit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Kayit {
    /*
     Bu uygulama kulanıcıların bir ArrayListe kayıt zamanını da alarak
     ekleyen ve sonrasında her dakikanın ilk 10 saniyesinde kaydolanları
     şanslı kullanıcı olarak ekrana yazdıran bir uygulamadır.
     Bunun için;
     1- Bir Kayit class'i oluşturun fields:  kullaniciDate (LocalDateTime cinsinden)
     2- Kayit isminde olusturdugunuz class'da kayitol() isminde bir method
     ekleyerek Kullanıcıdan kullanici ismini alarak ArrayList'e ekleyin
     3- SansliKullanici class'i olusturun.Bu class'ta kendine verilen
     ArrayListteki kullanicilardan her dakikanın ilk 10  saniyesinde kaydolanları
     yazdıran sansliKullanici() isminde bir metod  ekleyiniz.
     */
    static List<String>isimListesi=new ArrayList<>();
    static List<String>kayitSaniyeListesi=new ArrayList<>();
    public static void main(String[] args) {
        kayitListesi(isimListesi,kayitSaniyeListesi);
        System.out.println(isimListesi);
        System.out.println(kayitSaniyeListesi);

        SansliKullanici obj=new SansliKullanici();
        obj.sansliKullanici();
    }
    public static List<String> kayitListesi(List<String>isimListesi,List<String>kayitSaniyeListesi){
        Scanner input=new Scanner(System.in);
        String isim="";
        while (!isim.equalsIgnoreCase("q")){
            System.out.println("Lutfen isim giriniz: ");
            isim=input.nextLine();
            LocalDateTime kayitAni=LocalDateTime.now();
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("ss");
            String saniye=dtf.format(kayitAni);
            if (!isim.equalsIgnoreCase("q")){
                isimListesi.add(isim);
                kayitSaniyeListesi.add(saniye);
            }
        }
        return isimListesi;
    }
}


