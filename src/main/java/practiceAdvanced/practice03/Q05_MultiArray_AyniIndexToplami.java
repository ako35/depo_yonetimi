package practiceAdvanced.practice03;

public class Q05_MultiArray_AyniIndexToplami {

    public static void main(String[] args) {

        /*
 Aşağıdaki mutli dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
 toplamını yazdıran bir program yazın.
 arr1[]={{1,2},{3,4,5}{6}}
 arr2[]={{7,8,9},{10,11},{12}}
*/

        int[][] arr1={{1,2},{3,4,5},{6}};
        int[][] arr2={{7,8,9},{10,11},{12}};
        int toplam=0;
        int icUzunluk=0;
        int disUzunluk=Math.min(arr1.length,arr2.length);
        for (int i=0;i<disUzunluk;i++){
            icUzunluk=Math.min(arr1[i].length,arr2[i].length);
            for (int j=0;j<icUzunluk;j++){
                toplam=arr1[i][j]+arr2[i][j];
                System.out.println(toplam);
            }
        }



    }
}
