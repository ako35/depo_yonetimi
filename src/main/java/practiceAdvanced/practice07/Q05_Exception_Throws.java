package practiceAdvanced.practice07;
import java.util.Random;
public class Q05_Exception_Throws {
    public static void main(String[] args) throws Exception {
        /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */
        randomSayi();
    }
    public static void randomSayi() throws Exception {
        Random random=new Random();
        while (true){
            int sayi1= random.nextInt(11);
            int sayi2= random.nextInt(11);
            try {
                if (sayi1+sayi2<12){
                    throw new Exception();
                } else {
                    System.out.println(sayi1+sayi2);
                    break;
                }
            } catch (Exception e){
                System.out.println("Sayi 12'den kucukse hata verir");
            }
        }
    }
}