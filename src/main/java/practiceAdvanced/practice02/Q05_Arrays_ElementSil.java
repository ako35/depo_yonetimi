package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {

        /*
     Elementlerini kullanıcidan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Array limitini giriniz: ");
        int limit=input.nextInt();
        int[] arr=new int[limit];
        for (int i=0;i<limit;i++){
            System.out.println(i+". indeksi giriniz: ");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Silinecek indeksi giriniz: ");
        int silinecekIndeks=input.nextInt();
        int[] brr=new int[limit-1];
        int k=0;
        for (int i=0;i<limit;i++){
            if (i!=silinecekIndeks){
                brr[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(brr));

        //2. Yol:
        List<Integer>l=new ArrayList<>();
        for (int w: arr){
            l.add(w);
        }
        System.out.println(l);
        l.remove(silinecekIndeks);
        System.out.println(l);



    }
}
