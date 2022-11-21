package practiceAdvanced.practice10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q03_TextOkuma {


    //Bir text dosyasındaki 3. satırın kelime sayısını veren bir kod yazınız.
    public static void main(String[] args) throws IOException {
        BufferedReader bfr=new BufferedReader(new FileReader("" +
                "src\\main\\java\\practiceAdvanced\\practice10\\Text"));

        bfr.readLine();
        bfr.readLine();
        String line3=bfr.readLine();
        System.out.println(line3);
        String[] arr=line3.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(bfr.readLine());
        String line=null;
        while (bfr.readLine()!=null){
            line=bfr.readLine();
        }
        System.out.println(line);





    }



}
