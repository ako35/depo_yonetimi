package replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class List04 {
    public static void main(String[] args) {
        /*
        Write a program that deletes the letters 'a' from the names in the list given as input.
         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT :
         [Veli,Omer]
         */
        String[] list1={"Ali","Veli","Ayse","Ahmet","Omer","zAhmetaga","Fatma"};
        List<String>list=new ArrayList<>(Arrays.asList(list1));
        for (int i=0;i<list.size();i++){
            for (int j=0;j<list.get(i).length();j++){
                if (list.get(i).contains("a") || list.get(i).contains("A")){
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        System.out.println(list);









    }



}
