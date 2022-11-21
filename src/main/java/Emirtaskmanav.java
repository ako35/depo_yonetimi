import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Emirtaskmanav {
    /* TASK :
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
    Ipucu:
    Class icinde 3 method olacak
     * main() isimli bir method
     * musteriSecimi() isimli bir method
     * kasa() isimli bir method
     */

    static int toplamFiyat;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<String>sepetList=new ArrayList<>();
        List<String>manavList= new ArrayList<>();
        manavList.add("elma");
        manavList.add("armut");
        manavList.add("domates");
        manavList.add("salatalik");
        manavList.add("karpuz");
        List<Integer>fiyatList= new ArrayList<>();
        fiyatList.add(9);
        fiyatList.add(12);
        fiyatList.add(10);
        fiyatList.add(13);
        fiyatList.add(7);

        musteriSecimi1(sepetList,manavList,fiyatList);

        kasa1(toplamFiyat);

    }
    public static void kasa1(double toplamFiyat){
        System.out.println(toplamFiyat);
    }
    public static void musteriSecimi1(List<String>sepetList,List<String>manavList,List<Integer>fiyatList){
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Lutfen almak istediginiz urunu seciniz: \nelma: 9 TL" +
                    "\narmut: 12 TL\ndomates: 10 TL\nsalatalik: 13 TL\nkarpuz: 7 TL");
            String urun=input.next();
            sepetList.add(urun);
            System.out.println("Kac kilo almak istersiniz: ");
            int kilo=input.nextInt();
            for (int i = 0; i<manavList.size(); i++){
                if (urun.equalsIgnoreCase(manavList.get(i))){
                    toplamFiyat+=fiyatList.get(i)*kilo;
                }
            }
            System.out.println("Baska bir urun almak ister misiniz? e/h");
            String eh=input.next();
            if (eh.equalsIgnoreCase("h")){
                break;
            }

        }

    }




}
