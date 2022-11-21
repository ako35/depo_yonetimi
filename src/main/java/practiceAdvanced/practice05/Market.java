package practiceAdvanced.practice05;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;
    Market(String urunAdi, double urunFiyati, int aySonra){

        this.urunAdi=urunAdi;
        this.urunFiyati=urunFiyati;
        this.sonKullanmaTarihi= LocalDate.now().plusMonths(aySonra).toString();

    }

    Market(String urunAdi, double urunFiyati){

        this.urunAdi=urunAdi;
        this.urunFiyati=urunFiyati;
        this.sonKullanmaTarihi="Bu urunun son kullanma tarihi yoktur.";

    }



}
