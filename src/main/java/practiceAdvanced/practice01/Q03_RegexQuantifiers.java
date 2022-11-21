package practiceAdvanced.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {

        //Bir String değerin belirli sayıda karakter içerip
        //belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
        String str="as";
        System.out.println(str.matches(".s"));//true ==> herhangi bir karakter ile
                                                    //baslayip 's' harfi ile bitiyor.
        //matches() methodu regex ile calisip
        // String degerin regex ile karsilastirmasini yapar.
        System.out.println(str.matches("..s"));//false ==> 3 karakterli degil

        //Bir String değerin ikinci karakterinin belirli bir karakter
        //olup olmadığını kontrol eden bir kod yazınız.
        String str1="alikocan";
        System.out.println(str1.matches(".l.*"));//true ==> ilk karakter herhangi biri
                                                                    //ikinci karakter 's'
        // .* ==> esnek sayida karakter (0 ya da daha fazla)
        System.out.println(str1.matches(".s.*"));//false ==> ilk karakter herhangi biri
        //ikinci karakter uyusmuyor.

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("abc".matches("[A-Za-z]*"));

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini
        //kontrol eden bir kod yazınız.
        System.out.println("Kabch".matches("[a-zA-Z]{5}"));//true ==> 5 karakterli
                                                                            //ve hepsi harf
        System.out.println("abchdX".matches("[a-zA-Z]{5}"));//false ==> 5' den
                                                                //fazla karakter iceriyor.
        System.out.println("1abch".matches("[a-zA-Z]{5}"));//false ==> harf disinda
                                                                //karakter iceriyor.

        //Bir String değerin belirli karakterleri en az
        //belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1234567".matches("[0-9]{6,}"));//true ==> en az
                                                                // 6 rakam iceriyor
        System.out.println("12345".matches("[0-9]{6,}"));//false ==> 6' dan az
        // karakter iceriyor
        System.out.println("12345X".matches("[0-9]{6,}"));//false ==> rakam disi
        // karakter iceriyor

        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda
        // içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xAc".matches("\\w{7,10}"));//true ==> en fazla
                                                        // 10 karakter(\\w) iceriyor.
        // \\w=[a-zA-Z0-9_]
        System.out.println("abcd123".matches("\\w{7,10}"));//true ==> en az
        // 7 karakter(\\w) iceriyor.

        // ilk karakter 1, ikinci karekter noktalama işareti ve
        // kalan 8 karakter rakam, toplam 10 karakter olmali.
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));//true ==>
                                                                //tum kosullari sagliyor.







    }
}
