package replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class List02 {
    public static void main(String[] args) {
        /*
        Create a 10-element list. Swap the 8th element with the 3rd element.
INPUT :
String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
Output:
[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
         */
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String>list=new ArrayList<>(Arrays.asList(names));
        System.out.println(list);
        String str=list.get(7);
        list.set(7,list.get(2));
        list.set(2,str);
        System.out.println(list);
    }
}
