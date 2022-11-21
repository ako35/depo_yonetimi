package replit.betulhocasoru.hoca;

import java.util.Hashtable;

public class Okul {

    private String okulAd;
    private int maxOgrenciSayisi;
    private Integer ogrenciId;
    Hashtable<Integer,Ogrenci>ogrenciListesi=new Hashtable<>();

    public Okul() {
        super();
    }

    public String getOkulAd() {
        return "Halit Bey";
    }

    public int getMaxOgrenciSayisi() {
        return 3;
    }

    public Integer getOgrenciId() {
        return 1;
    }
}
