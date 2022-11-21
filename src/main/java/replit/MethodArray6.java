package replit;
import java.util.Arrays;
public class MethodArray6 {
    public static void main(String[] args) {
        /*
Write a method that accepts an integer array as input and prints the minimum
and the maximum numbers from given array
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
         */
        int[] arr={3,2,5,4,1,6};
        minMax(arr);
        minMax1(arr);
    }
    public static void minMax(int[] arr){
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[arr.length-1];
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
    public static void minMax1(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
