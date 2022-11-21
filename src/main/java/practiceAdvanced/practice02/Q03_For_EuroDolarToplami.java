package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_For_EuroDolarToplami {
    public static void main(String[] args) {

        /*
      Tek bir String içerisinde verilen euro ve dolarların
      ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       String str="$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
       */
        String str="$1 $12 €34 €56 $45 €78";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolarTop=0;
        int euroTop=0;
        for (String w:arr){
            if (w.contains("$")){
                dolarTop+=Integer.valueOf(w.replace("$",""));
            }else {
                euroTop+=Integer.valueOf(w.replace("€",""));
            }
        }
        System.out.println("euroTop = " + euroTop);
        System.out.println("dolarTop = " + dolarTop);


    }
}
