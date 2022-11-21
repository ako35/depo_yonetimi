package practiceAdvanced.practice02;

import java.util.*;

public class Q06_Arrays_BelirliToplamiVerenIkililer {
    public static void main(String[] args) {

//        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen 3 karakterli bir isim giriniz");
//        String ad=input.next();
//        int counter=0;
//        if (ad.length()==3){
//            for (int i=0;i<ad.length();i++){
//                for (int j=0;j<ad.length();j++){
//                    if (i!=j){
//                        if (ad.charAt(i)==ad.charAt(j)){
//                            counter++;
//                        }
//                    }
//                }
//                if (counter!=0){
//                    System.out.println("Tekrar eden karakter vardir");
//                    break;
//                }
//            }
//        } else System.out.println("3 karakterli isim gir");
//        if (counter==0){
//            System.out.println("Tekrar eden karakter yoktur");
//        }

//        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen 3 karakterli bir isim giriniz");
//        String ad=input.next();
//        if (ad.length()==3){
//            if (ad.charAt(0)!=ad.charAt(1) &&
//                    ad.charAt(1)!=ad.charAt(2) &&
//                    ad.charAt(0)!=ad.charAt(2)){
//                System.out.println("Dizenin benzersiz karakterleri var");
//            } else System.out.println("Dizenin benzersiz karakterleri yok");
//        } else System.out.println("3 karakterli isim giriniz");


        /*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini
     yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */
//        int arr[]={4,6,5,-10,8,5,20};
//        int verilenSayi=10;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (i!=j){
//                    if (arr[i]+arr[j]==verilenSayi){
//                        System.out.println(arr[i]+" + "+arr[j]+" = "+(arr[i]+arr[j]));
//                    }
//                }
//            }
//        }

        int arr[]={4,6,5,-10,8,5,20};
        ikilileriBul(arr,13);

    }

    public static void ikilileriBul(int arr[], int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==a){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+a);
                }
            }
        }
    }


}
