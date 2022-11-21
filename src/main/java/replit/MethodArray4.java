package replit;
import java.util.Arrays;
public class MethodArray4 {
    public static void main(String[] args) {
        /*
        Create a custom return type method accepts a name as parameter and prints the name as a char array.
        (do not use toCharArray() method)
        Input : John
        Output :[J, o, h, n]
         */
        karakterYazdirma("John");
        karakterYazdirma1("Osman");
    }

    public static void karakterYazdirma(String ad){
        String[] arr=ad.split("");
        System.out.println(Arrays.toString(arr));
    }

    public static void karakterYazdirma1(String ad){
        char[] arr1=new char[ad.length()];
        for (int i=0;i<ad.length();i++){
            arr1[i]=ad.charAt(i);
        }
        System.out.println(Arrays.toString(arr1));
    }




}
