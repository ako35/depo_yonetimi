package pdfsorulari;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pdf_24 {
    public static void main(String[] args) {

        //4
//        String dosyaYolu="src/main/java/pdfsorulari/Csv";
//        Map<String,String>map=csvdenMapYap(dosyaYolu);
//        System.out.println(map);


        //3
//        System.out.println(tekrarEtmeyenElemanlar("Hellooo"));

        //2
//        Map<Integer,String>map=new HashMap<>();
//        map.put(101,"Ali, Can, Java");
//        map.put(102,"Veli, Yan, Java");
//        map.put(103,"Ali, Yan, C#");
//        List<String>list=javaBilenler(map,"Java");
//        System.out.println(list);

        //1
//        System.out.println(harfSayisiBul("Hellooo"));
    }

    private static Map<String, String> csvdenMapYap(String dosyaYolu) {
        List<String>satirListesi=new ArrayList<>();
        Map<String,String>mapCsv=new HashMap<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(dosyaYolu));
            String line=bufferedReader.readLine();
            while (line!=null){
                satirListesi.add(line);
                line=bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Liste olarak : "+satirListesi);
        for (String w:satirListesi){
            String[] str=w.split(",");
            mapCsv.put(str[0],str[1]);
        }
        return mapCsv;
    }

    public static List<String> tekrarEtmeyenElemanlar(String str){
        List<String> list=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        String[] arr=str.split("");
        for (String w:arr){
            if (!map.containsKey(w)){
                map.put(w, 1);
            } else map.put(w, map.get(w)+1);
        }
        for (Map.Entry<String,Integer> w:map.entrySet()){
            if (w.getValue()==1){
                list.add(w.getKey());
            }
        }
        return list;
    }

    public static List<String> javaBilenler(Map<Integer, String> map, String java) {
        List<String>list=new ArrayList<>();

        for (String w:map.values()){
            String[] arr=w.split(", ");
            if (arr[2].equals(java)){
                list.add(arr[0]);
            }
        }
        return list;
    }

    public static HashMap<String,Integer> harfSayisiBul(String str) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        for (String w:str.split("")){
            if (!hashMap.containsKey(w)){
                hashMap.put(w,1);
            } else hashMap.put(w,hashMap.get(w)+1);
        }
        return hashMap;
    }
}
