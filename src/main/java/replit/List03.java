package replit;
import java.util.*;
public class List03 {
    public static void main(String[] args) {
        /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter,
        Invert sentence using Array and write a Method that returns the result as a String to the main method.
Note: Upper and lower case letters, spaces and special characters will not be changed.
Input :
It is very nice to write code.
Output :
.edoc etirw ot ecin yrev si tI
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz: ");
        String str=input.nextLine();
        stringReverse(str);
        System.out.println();
        stringReverse1(str);
    }
    public static void stringReverse(String str){
        String[] arr=str.split("");
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void stringReverse1(String str){
        List<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(list);
        String ters="";
        for (String w:list){
            ters+=w;
        }
        System.out.println(ters);

    }
}
