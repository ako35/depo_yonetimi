package replit;
public class MethodArray5 {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements
        input[]= {1,2,3,4,5,6,7}
        Output : 4
         */
        int toplam=0;
        int[] arr={1,2,3,4,5,6,7};
        for (int w:arr){
            toplam+=w;
        }
        System.out.println(toplam/arr.length);
    }
}
