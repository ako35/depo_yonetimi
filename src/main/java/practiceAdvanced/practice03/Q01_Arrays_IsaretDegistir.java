package practiceAdvanced.practice03;

public class Q01_Arrays_IsaretDegistir {

    public static void main(String[] args) {

        //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int arr[]={1,2,-3,4,-5,-6};
        for (int w:arr){
            System.out.print(w*-1);
            if (w!=arr[arr.length-1]){
                System.out.print(", ");
            }
        }



    }



}
