package pdfsorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pdf_11 {
    public static void main(String[] args) {

        //1
        List<String> arr=new ArrayList<>();
        arr.add("A");
        arr.add("C");
        arr.add("E");
        arr.add("F");
        System.out.println(arr);

        //2
        arr.add("B");
        arr.add(1,"L");
        System.out.println(arr);

        //3
        arr.set(3,"D");
        System.out.println(arr);

        //4
        System.out.println(arr.remove("F"));
        System.out.println(arr);

        //5
        Collections.sort(arr);
        System.out.println(arr);

        //6
        System.out.println(arr.contains("L"));
        System.out.println(arr.contains("M"));

        //7
        System.out.println(arr.size());

        //8
        arr.clear();
        System.out.println(arr);

        //9
        System.out.println(arr.isEmpty());



    }
}
