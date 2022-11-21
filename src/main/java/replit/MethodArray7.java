package replit;
public class MethodArray7 {
    public static void main(String[] args) {
/*
Write a method that accepts an array as parameter and returns sum off all elements in the array
Then print the result in the main method.
Eg :
input : {1,2,3,4,5,6,7,8};
output: 36
 */
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(toplam(arr));

    }
    public static int toplam(int[] arr){
        int sum=0;
        for (int w:arr){
            sum+=w;
        }
        return sum;
    }



}
