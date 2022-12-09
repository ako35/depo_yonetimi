package okulYonetimi;

import okul_yonetimi.Okul;

public class Ogrenci extends Okul implements OrtakMethod{

    public Ogrenci(int yas, String ad, String soyad, String kimlikNo, String numara, String sinif) {
        super(yas, ad, soyad, kimlikNo, numara, sinif);
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }



    @Override
    public void islemler() {

        System.out.println("Ogrenci Panelindeki Islemler: \n" +
                "1-) Ekleme\n" +
                "2-) Arama\n" +
                "3-) Listeleme\n" +
                "4-) Silme\n" +
                "5-) Ana Menu\n" +
                "6-) Cikis");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
        String secim=input.next();
        boolean flag=true;
        do {
            switch (secim){
                case "1":
                    ekleme();
                    flag=false;
                    break;
                case "2":
                    arama();
                    flag=false;
                    break;
                case "3":
                    listeleme();
                    flag=false;
                    break;
                case "4":
                    silme();
                    flag=false;
                    break;
                case "5":
                    okulAnaSayfasi();
                    flag=false;
                    break;
                case "6":
                    System.out.println("Program sonlandiriliyor...");
                    break;
                default:
                    System.out.println("Yanlis bir secim yaptiniz");
                    System.out.println("1,2,3,4,5 ve 6 secimlerini kullanmalisiniz");
            }
        } while (flag);
    }

}
