package replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class List09 {
    /*
     Write a Java program to get a String from user as input and find the maximum occurring character in that string.
     (Ignore case sensitivity).
Input : Learning java is easy
Output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz: ");
        String str=input.nextLine().toLowerCase();
        List<String>list=new ArrayList<>(Arrays.asList(str.replace(" ","").split("")));
        String maxCharacter="";
        for (String w:list){
            String karakterler="";
            for (String k:list){
                if (w.equals(k)){
                    karakterler+=w;
                }
            }
            if (karakterler.length()>maxCharacter.length()){
                maxCharacter=karakterler;
            }
        }
        System.out.println(maxCharacter.charAt(0)+" "+maxCharacter.length()+" tanedir");
    }
}
