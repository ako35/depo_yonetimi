package okulYonetimi;

import okul_yonetimi.Okul;

public class Ogretmen extends Okul implements OrtakMethod{

    public Ogretmen(String ad, String soyad, String kimlikNo, String bolum, String sicilNo, int yas) {
        super(ad, soyad, kimlikNo, bolum, sicilNo, yas);
    }

    public Ogretmen() {
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
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

        System.out.println("Ogretmen Panelindeki Islemler: \n" +
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
