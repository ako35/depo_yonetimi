package replit;
import java.util.Arrays;
public class MethodArray8 {
    /*
    Write a return method that accepts 2 integer Arrays as parameters
    And adds 2 array into a new Array and prints it.
        Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,7,8,9};
        int[] arr2={5,6,3,5,7};
        System.out.println(Arrays.toString(toArrayConcat(arr1,arr2)));
        System.out.println(Arrays.toString(toArrayConcat1(arr1,arr2)));
    }
    public static int[] toArrayConcat(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        while (i<arr3.length){
            for (int k:arr1){
                arr3[i]=k;
                i++;
            }
            for (int l:arr2){
                arr3[i]=l;
                i++;
            }
        }
        return arr3;
    }
    public static int[] toArrayConcat1(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr3.length;i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
            } else arr3[i]=arr2[i-arr1.length];
        }
        return arr3;
    }


}
