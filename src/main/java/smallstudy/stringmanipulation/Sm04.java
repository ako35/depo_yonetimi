package smallstudy.stringmanipulation;

public class Sm04 {
    public static void main(String[] args) {

        String str = "Ali!  13 yasinda  , 1555 yasında olduğunu dusunuyorum.";
        ////4.Örnek: Harflerden farklı tüm karakterleri ? değiştirin code yaziniz

        String st1= str.replaceAll("[^A-Za-z]","?");
        System.out.println(st1);//Ali??????yasinda???????yas?nda?oldu?unu?dusunuyorum?

        String st2= str.replaceAll("[^0-9]","*");
        System.out.println(st2);

        ////8.Örnek:String'de rakam haricindeki karakter sayisini bulunuz.

        int rekaSayi = str.replaceAll("\\d","").length();
        System.out.println(rekaSayi);



    }
}
