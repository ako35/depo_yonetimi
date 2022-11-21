package practiceAdvanced.practice03;

import java.util.Arrays;

public class Q06 {

    public static void main(String[] args) {

        /*
Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
 */
//        int arr[]={-999,1, 2, 5, 7, 9, 22, 8, 3, 1, 3};
//        int enBuyuk=arr[0];
//        int indexEnBuyuk=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>enBuyuk){
//                enBuyuk=arr[i];
//                indexEnBuyuk=i;
//            }
//        }
//        int brr[]=new int[indexEnBuyuk+1];
//        int crr[]=new int[arr.length-indexEnBuyuk-1];
//        int k=0;
//        for (int i=0;i<arr.length;i++){
//            if (i<=indexEnBuyuk){
//                brr[i]=arr[i];
//            } else {
//                crr[k]=arr[i];
//                k++;
//            }
//        }
//        int ilkBrr[]=new int[brr.length];
//        for (int i=0;i<brr.length;i++){
//            ilkBrr[i]=brr[i];
//        }
//        Arrays.sort(brr);
//        int crrTersi[]=new int[crr.length];
//        int j=0;
//        for (int i=crr.length-1;i>=0;i--){
//            crrTersi[j]=crr[i];
//            j++;
//        }
//        Arrays.sort(crr);
//        if (Arrays.equals(ilkBrr,brr)){
//            if (Arrays.equals(crrTersi,crr)){
//                System.out.println("Mountain Array dir");
//            } else System.out.println("Mountain Array degildir");
//        }




        int arr[]={-999,1, 2, 5, 7, 9, 22, 8, 3, 1, 0};
        int enBuyuk=arr[0];
        int indexEnBuyuk=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>enBuyuk){
                enBuyuk=arr[i];
                indexEnBuyuk=i;
            }
        }
        boolean sol=true;
        boolean sag=true;
        for (int i=0;i<arr.length-1;i++){
            if (i<indexEnBuyuk){
                if (arr[i]>=arr[i+1]){
                    sol=false;
                }
            } else if (i==indexEnBuyuk){

            } else {
                if (arr[i]<=arr[i+1]){
                    sag=false;
                }
            }
        }
        if (sol && sag){
            System.out.println("Montain Array dir");
        } else System.out.println("Montain Array degildir");






    }
}
