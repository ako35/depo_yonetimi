package OOP_Concept.DepoYonetimi;

import java.util.Scanner;

public class Islemler extends Urun {
    static Scanner input = new Scanner(System.in);

    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Depo Yönetimi Programı'na Hoşgeldiniz");
        System.out.println("Yapmak istediğini işlemi seçiniz");
        System.out.println(" 1-Urun Tanımla\n 2-Urun Listele\n 3-Urun Girişi\n 4-Ürünü Rafa Koy\n 5-Ürün Çıkışı\n 6-Çıkış");
        int islem = input.nextInt();
        switch (islem) {
            case 1:
                urunTanimla();
                menu();
                break;
            case 2:
                urunListele();
                menu();
                break;
            case 3:
                urunGirisi();
                menu();
                break;
            case 4:
                urunRafaKoy();
                menu();
                break;
            case 5:
                urunCikisi();
                menu();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("Geçerli bir işlem giriniz");
                menu();

        }
    }

    public void urunTanimla() {
        Scanner input = new Scanner(System.in);
        System.out.println("Urun ismini giriniz.");
        String urun_adi = input.nextLine();
        System.out.println("Urunun üretici ismini giriniz.");
        String uretici = input.nextLine();
        System.out.println("Urun birimini giriniz.");
        String birim = input.nextLine();

        Urun urun = new Urun(urun_id, urun_adi, uretici, birim);

        urunler.add(urun);

        urun_id++;
        System.out.println("Ürün Tanımlandı");
    }

    public void urunListele() {
        for (Urun w : urunler) {
            System.out.print(w + " ");
            //  System.out.print(w.miktar+" ");
            //  System.out.print(w.raf);
            System.out.println();
        }
    }

    public void urunGirisi() {
        System.out.println("Giriş yapmak için urun id'sini giriniz.");
        int id = input.nextInt();
        int counter=0;
        for (Urun w : urunler) {
            if (w.urun_id == id) {
                System.out.println("Giriş yapmak istediğiniz miktarı girin");
                int m = input.nextInt();
                w.miktar = w.miktar + m;
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Böyle bir ürün tanımlı değildir.");
        } else System.out.println("Ürün girişi gerçekleşti.");


    }

    public void urunRafaKoy() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rafa yerleştirmek istediğiniz ürünün id'sini giriniz.");
        int id = input.nextInt();
        int counter=0;
        for (Urun w : urunler) {
            if (w.urun_id == id) {
                System.out.println("Urunu yerleştirmek istediğiniz raf numarasını giriniz.");
                int raf_no = input.nextInt();
                w.raf = "Raf " + raf_no;
                counter++;
            }
        }
        if (counter==0){
            System.out.println("Böyle bir ürün tanımlı değildir.");
        } else System.out.println("Ürün rafa yerleştirildi.");

    }


    public void urunCikisi() {
        System.out.println("Çıkışını yapmak istediğiniz ürün id'sini giriniz");
        int id = input.nextInt();
        int counter=0;
        for (Urun w : urunler) {
            if (w.urun_id == id) {
                counter++;
                if (w.miktar != 0) {
                    System.out.println("Çıkış yapmak istediğiniz miktarı giriniz");
                    int c = input.nextInt();
                    w.miktar = w.miktar - c;
                } else {
                    System.out.println("Çıkışını yapmak istediğiniz ürün depomuzda bulunmamaktadır.");
                }
            }
        }
        if (counter==0){
            System.out.println("Böyle bir ürün tanımlı değildir.");
        } else System.out.println("Ürün çıkış işlemi yapıldı.");

    }

    public void cikis() {
        System.out.println("Depo Yönetimi Programımızı Kullandığınız için Teşekkür Ederiz.");
    }
}