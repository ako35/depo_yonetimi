package replit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        // Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
        // bir method yaziniz
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        map1.put(1905, "Can, Birtane, Java");
        List<String>list=new ArrayList<>();
        for (String w:map1.values()){
            StringBuilder str=new StringBuilder();
            for (int i=w.length()-1;i>=0;i--){
                if (w.charAt(i)!=' '){
                    str.append(w.charAt(i));
                } else break;
            }
            str.reverse();
            if (str.toString().equals("java") || str.toString().equals("Java")){
                String k=w.replace(str.toString(),"");
                list.add(k.substring(0,k.length()-2));
            }
        }
        for (String w:list){
            System.out.println(w);
        }
    }
}
