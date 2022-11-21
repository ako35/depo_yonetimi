package day07_stringmanipulations;

public class C03_StringManipulationsReplace {
    /*
    replace()
  Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
  Sonuc String'dir..
      */

       /*
       Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey
    */

    public static void main(String[] args) {


        //rakam haricindekileri silin
        String str1="$45.99";
        str1=str1.replaceAll("\\D","");
        System.out.println("str1 = " + str1);


        // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin
        String cumle="Her dert Java gibi olsa";
        cumle=cumle.replaceAll("\\w","*")+cumle.substring(10);
        System.out.println(cumle);


        //a harfini @ isareti ile degistir
        String ders="olaganustu";
        ders=ders.replaceAll("a","@");
        System.out.println(ders);




        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunan karakteri değiştirir
         */
        String txt = "Merhaba Dunya";


        //txt'deki butun 'a' lari 'e' ile degistirin
//        txt=txt.replaceAll("a","e");
//        System.out.println(txt);




        //txt'deki ilk bulunan 'a' yi 'e' ile degistirin
        txt=txt.replaceFirst("a","e");
        System.out.println(txt);



     /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..

      */
        //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
        String str="Dolma kalem";
        str=str.replaceAll("kalem","biber");
        System.out.println(str);







          /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

        String str3 = "Merhaba";
        String st = "Merhaba";
        boolean birebiresitMi=str3.equals("Merhaba");
        System.out.println("birebiresitMi = " + birebiresitMi);
        System.out.println(str3.equals(st));
        System.out.println(str3.equals("merhaba"));
        System.out.println(str3.equalsIgnoreCase("MerHaBa"));
        System.out.println(str3.equalsIgnoreCase("Merha"));

    }
}
