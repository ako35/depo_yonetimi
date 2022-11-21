package pdfsorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pdf_14 {

    public static void main(String[] args) {

        //4
        List<Integer>m=new ArrayList<>();
        m.add(10);
        m.add(11);
        m.add(12);
        int arr[]={10,11,12};
        degistirArray(arr);
        System.out.println(Arrays.toString(arr));
        degistirList(m);
        System.out.println(m);


        //3
        List<Integer>l=new ArrayList<>();
        l.add(10);
        l.add(11);
        l.add(12);
        artirmaFor(l);
        System.out.println(l);
        artirmaSet(l);
        System.out.println(l);

        //1 - 2
        int fiyat=100;
        System.out.println(indirim10(fiyat));
        System.out.println(indirim20(fiyat));
        System.out.println(indirim25(fiyat));
        System.out.println(fiyat);




    }
    public static void degistirArray(int brr[]){
        brr=new int[5];
        brr[0]=1;
        brr[1]=2;
        brr[2]=3;
        brr[3]=4;
        brr[4]=5;
        System.out.println(Arrays.toString(brr));
    }
    public static void degistirList(List<Integer>k){
        k=new ArrayList<>();
        k.add(10);
        k.add(9);
        k.add(8);
        k.add(7);
        k.add(6);
        System.out.println(k);
    }
    public static void artirmaSet(List<Integer>k){
        for (int i=0;i<k.size();i++){
            k.set(i,k.get(i)+2);
            System.out.println(k.get(i));
        }
    }


    public static void artirmaFor(List<Integer>k){
        for (int w:k){
            w+=2;
            System.out.println(w);
        }
    }

    public static int indirim10(int a){
        return a-a*10/100;
    }

    public static int indirim20(int a){
        return a-a*20/100;
    }

    public static int indirim25(int a){
        return a-a*25/100;
    }


}
