package pdfsorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Pdf_10 {
    public static void main(String[] args) {



//        Scanner input=new Scanner(System.in);
//        int r = (int)(Math.random()*100)+1;
//        int a;
//        int count =1;
//        System.out.println("0-100 arası Bir sayı tahmini giriniz");
//        do {
//
//            a = input.nextInt();
//            if (a<r){
//                count++;
//                if (count>10){
//                    System.out.println("Kaybettiniz");
//
//                    break;
//                }
//                System.out.println(count+". HAKKINIZ olarak daha büyük bir numara giriniz");
//            } else if (a>r) {
//                count++;
//                if (count>10){
//                    System.out.println("Kaybettiniz");
//                    break;
//                }
//                System.out.println(count+". HAKKINIZ olarak daha küçük bir numara giriniz");
//            }else {
//                System.out.println("Tebrikler!!!");
//            }
//        }while ( a!=r);

        //6
//        int arr[]={1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,4,3,2,3};
//        int istenenDeger=3;
//        int k=0;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]!=istenenDeger){
//                k++;
//            }
//        }
//        int brr[]=new int[k];
//        int j=0;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]!=istenenDeger){
//                brr[j]=arr[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(brr));


        //5
//        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen bir string giriniz: ");
//        String str=input.nextLine();
//        String arr[]=str.split(" ");
//        System.out.println(arr.length);

        //4
//        int arr[][] = {{1, 2, 3}, {4, 5}, {6,7}};
//        int brr[]=new int[arr.length];
//        for (int i = 0; i < arr.length; i++){
//            int toplam=0;
//            for (int j = 0; j < arr[i].length; j++){
//                toplam+=arr[i][j];
//            }
//            brr[i]=toplam;
//        }
//        System.out.println(Arrays.toString(brr));

        //3
//        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
//        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
//        int toplam=0;
//        int disUzunluk=arr1.length<=arr2.length ? arr1.length:arr2.length;
//        for (int i = 0; i < disUzunluk; i++){
//            int icUzunluk=arr1[i].length<=arr2[i].length ? arr1[i].length:arr2[i].length;
//            for (int j = 0; j < icUzunluk; j++){
//                toplam=arr1[i][j]+arr2[i][j];
//                System.out.println(toplam);
//            }
//        }

//        int dizi1[][] = {{1,2},{3,4,5},{6}};
//        int dizi2[][] = {{7,8,9},{10,11},{12}};
//        int toplam = 0;
//        int disUzunluk = Math.min(dizi1.length, dizi2.length);
//        int icUzunluk;
//        for (int i = 0; i < disUzunluk; i++) {
//            icUzunluk = Math.min(dizi1[i].length, dizi2[i].length);
//            for (int j = 0; j < icUzunluk; j++) {
//                toplam = dizi1[i][j] + dizi2[i][j];
//                System.out.println(dizi1[i][j] + "+" + dizi2[i][j] + "=" + toplam);
//            }
//        }

        //2
//        int arr[][] = {{1, 2, 3}, {4, 5}, {6}};
//        int carpim = 1;
//        for (int i = 0; i < arr.length; i++) {
//            carpim*=arr[i][arr[i].length-1];
//        }
//        System.out.println(carpim);

        //1
//        int arr[][]={{1,2,3},{4,5,6}};
//        int carpim=1;
//        for (int[] w:arr){
//            for (int k:w){
//                carpim*=k;
//            }
//        }
//        System.out.println(carpim);


        //2
//        int arr[]={9,10,11};
//        int sum=0;
//        for (int w:arr){
//            sum+=w;
//        }
//        System.out.println(sum);

        //1
//        int arr[]={1,2,3};
//        int brr[]=new int[3];
//        for (int i=0;i<3;i++){
//            if (i!=0){
//                brr[i-1]=arr[i];
//            } else {
//                brr[brr.length-1]=arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(brr));

        //1
//        String arr[]={"Ali","Veli","Ayse","Fatma"};
//        System.out.println(Arrays.toString(arr));

        //2
//        String arr[]={"Ali","Veli","Ayse","Fatma"};
//        arr[0]="Can";
//        arr[2]="Gul";
//        System.out.println(Arrays.toString(arr));
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }


    }
}
