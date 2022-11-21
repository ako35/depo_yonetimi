package practiceAdvanced.practice07;
public class Q04_Exception_Throws {
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
        int sayi1= (int) (Math.random()*10);
        int sayi2= (int) (Math.random()*10);
        System.out.println(sayi1+sayi2);
        if (sayi1+sayi2<12){
            throw new Exception("Sayi 12'den kucukse hata verir");
        }
    }
}
