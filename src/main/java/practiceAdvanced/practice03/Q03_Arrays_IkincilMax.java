package practiceAdvanced.practice03;

public class Q03_Arrays_IkincilMax {

    public static void main(String[] args) {

        /*
   Bir Array içerisindeki 'minimum','maksimum' ve 'ikinci maksimum' değerleri bulan bir kod yazınız

   input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
   output: min:-90, max:10001, secMax: 8787

  */


        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        int min=arr[0];
        int max1=arr[0];
        int max2=arr[0];
        for (int w:arr){
            if (w<min){
                min=w;
            } else if (w>max1){
                max1=w;
            } else if (w>max2) {
                max2=w;
            }
        }
        System.out.println(min);
        System.out.println(max2);
        System.out.println(max1);

//        Arrays.sort(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[arr.length-1]);
//        System.out.println(arr[arr.length-2]);

//        int max=arr[0];
//        int min=arr[0];
//        for (int w:arr){
//            if (w>max){
//                max=w;
//            }
//        }
//        for (int w:arr){
//            if (w<min){
//                min=w;
//            }
//        }
//        System.out.println(min);
//        int brr[]=new int[arr.length-1];
//        int j=0;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]!=max){
//                brr[j]=arr[i];
//                j++;
//            }
//        }
//        int max2=brr[0];
//        for (int w:brr){
//            if (w>max2){
//                max2=w;
//            }
//        }
//        System.out.println(max2);
//        System.out.println(max);


    }
}
