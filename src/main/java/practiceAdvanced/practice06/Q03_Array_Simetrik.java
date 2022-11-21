package practiceAdvanced.practice06;
public class Q03_Array_Simetrik {
    //Bir Array'in simetrik olup olmadığını kontrol eden bir method yazınız.
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        Q03_Array_Simetrik obj=new Q03_Array_Simetrik();
        System.out.println(obj.simetrikMi(arr));
    }
    public boolean simetrikMi(int[] arr){
        boolean sonuc=true;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr[arr.length-1-i]){
                sonuc=false;
                break;
            }
        }
        return sonuc;
    }
}
