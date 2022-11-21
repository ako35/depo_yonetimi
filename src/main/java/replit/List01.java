package replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class List01 {
    /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string.
    (Ignore case sensitivity)
input :
Learning java is easy
output:
maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz: ");
        String str=input.nextLine().toLowerCase();
        String[] arr=str.replaceAll(" ","").split("");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        String maxCharacter="";
        for (String w:list){
            String encok="";
            for (String k:list){
                if (w.equals(k)){
                    encok+=w;
                }
            }
            if (encok.length()>maxCharacter.length()){
                maxCharacter=encok;
            }
        }
        System.out.println(maxCharacter.charAt(0));
    }
}
