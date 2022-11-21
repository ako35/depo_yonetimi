package practiceAdvanced.practice03;

public class Q04_DoWhile_TopunSicramasi {

    public static void main(String[] args) {

        /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */

        double toplamYol=0;
        double yukseklik=10;
        int yereVurmaSayisi=0;
        do {
            toplamYol+=yukseklik;
            yereVurmaSayisi++;
            yukseklik*=3;
            yukseklik/=4;
            toplamYol+=yukseklik;
        }while (yukseklik>1);
        System.out.println(yereVurmaSayisi);
        System.out.println(toplamYol);



    }



}
