package replit.betulhocasoru.hoca;

public class Ogrenci extends Okul{

    private String ad;
    private String soyad;
    private int yas;

    public Ogrenci() {
        super();
    }

    public Ogrenci(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }
}
