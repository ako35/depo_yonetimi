package day07_stringmanipulations;

public class C04_StringManipulationsStartsWith {

    /**
     * startsWith()
     *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     *
     * endsWith()
     * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     */
    public static void main(String[] args) {
        String cumle="Kazananlar hic hata yapmayanlar degil,vazgecmeyenlerdir";
        boolean ilkHarfKa=cumle.startsWith("Ka");
        System.out.println(ilkHarfKa);

        boolean sonHarfDir=cumle.endsWith("dir");
        System.out.println(sonHarfDir);







    }
}
