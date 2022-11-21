package replit;
import java.util.Scanner;
public class StudentInformation {
    static Scanner scanner=new Scanner(System.in);
    String ad;
    String soyad;
    String okulNo;
    String sinif;
    String sube;
    String alan;

    public StudentInformation(String ad, String soyad, String okulNo, String sinif, String sube, String alan) {
        this.ad = ad;
        this.soyad = soyad;
        this.okulNo = okulNo;
        this.sinif = sinif;
        this.sube = sube;
        this.alan = alan;
        System.out.println(ad+soyad+okulNo+sinif+sube+alan);
    }

    public void adDegisikligi(){
        System.out.println("Lutfen yeni bir ad giriniz: ");
        ad=scanner.nextLine();
    }
    public void soyadDegisikligi(){
        System.out.println("Lutfen yeni bir soyad giriniz: ");
        soyad=scanner.next();
    }
    public void okulNoDegisikligi(){
        System.out.println("Lutfen yeni bir okul numarasi giriniz: ");
        okulNo=scanner.next();
    }
    public void sinifDegisikligi(){
        System.out.println("Lutfen yeni bir sinif giriniz: ");
        sinif=scanner.next();
    }
    public void subeDegisikligi(){
        System.out.println("Lutfen yeni bir sube giriniz: ");
        sube=scanner.next();
    }
    public void alanDegisikligi(){
        System.out.println("Lutfen yeni bir alan giriniz: ");
        alan=scanner.nextLine();
    }
    public void tumBilgiler(){
        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(okulNo);
        System.out.println(sinif);
        System.out.println(sube);
        System.out.println(alan);
    }
    public void islemler(StudentInformation student){
        System.out.println("Hangi ogrenci bilgisini degistirmek istersiniz? " +
                "\nad icin 1 e basiniz\nsoyad icin 2 e basiniz\nokulNo icin 3 e basiniz" +
                "\nsinif icin 4 e basiniz\nsube icin 5 e basiniz\nalan icin 6 e basiniz");
        int cevap=scanner.nextInt();
        switch (cevap){
            case 1:
                student.adDegisikligi();
                student.tumBilgiler();
                break;
            case 2:
                student.soyadDegisikligi();
                student.tumBilgiler();
                break;
            case 3:
                student.okulNoDegisikligi();
                student.tumBilgiler();
                break;
            case 4:
                student.sinifDegisikligi();
                student.tumBilgiler();
                break;
            case 5:
                student.subeDegisikligi();
                student.tumBilgiler();
                break;
            case 6:
                student.alanDegisikligi();
                student.tumBilgiler();
                break;
        }
    }

}
