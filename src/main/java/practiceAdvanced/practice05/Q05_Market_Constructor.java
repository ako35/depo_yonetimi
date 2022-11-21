package practiceAdvanced.practice05;

public class Q05_Market_Constructor {

    //Urun adi, urun fiyati ve varsa son kullanma tarihlerini yazdiran bir market programi yaziniz

    public static void main(String[] args) {

        Market market=new Market("Ekmek",5,1);

        System.out.println(market.urunAdi);
        System.out.println(market.urunFiyati);
        System.out.println(market.sonKullanmaTarihi);

        Market market1=new Market("Nutella",45,20);

        System.out.println(market1.urunAdi);
        System.out.println(market1.urunFiyati);
        System.out.println(market1.sonKullanmaTarihi);

        Market market2=new Market("Nutella",45);

        System.out.println(market2.urunAdi);
        System.out.println(market2.urunFiyati);
        System.out.println(market2.sonKullanmaTarihi);




    }

}
