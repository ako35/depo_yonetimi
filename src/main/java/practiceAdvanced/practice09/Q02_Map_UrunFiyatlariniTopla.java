package practiceAdvanced.practice09;

import java.util.HashMap;

public class Q02_Map_UrunFiyatlariniTopla {

    public static void main(String[] args) {

        /*
        Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.
        (for each loop kullanınız)
Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
         */

        HashMap<String,Double>urunFiyat=new HashMap<>();
        urunFiyat.put("Kemer",19.99);
        urunFiyat.put("Gömlek",29.99);
        urunFiyat.put("Ayakkabı",89.99);
        urunFiyat.put("Kazak",24.99);
        urunFiyat.put("Kravat",19.99);
        double toplam=0;
        for (double w:urunFiyat.values()){
            toplam+=w;
        }
        System.out.println("Toplam: "+toplam);


    }



}
