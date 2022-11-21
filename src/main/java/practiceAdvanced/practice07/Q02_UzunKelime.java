package practiceAdvanced.practice07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q02_UzunKelime {
    public static void main(String[] args) {
        /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri)
          return eden bir method oluşturunuz.
         */
        System.out.println(enUzunKelime("ali topu tut"));;
    }
    public static List<String> enUzunKelime(String cumle){
        String[] arr=cumle.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        List<String>enUzun=new ArrayList<>();
        int max=0;
        for (String k:list){
            if (k.length()>max){
                max=k.length();
            }
        }
        for (String w:list){
            if (w.length()==max){
                enUzun.add(w);
            }
        }
        return enUzun;
    }
}
