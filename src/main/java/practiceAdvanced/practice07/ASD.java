package practiceAdvanced.practice07;
import java.util.Scanner;
public class ASD {
    // Kullanıcıdan aldığınız güne göre o günden kaç gün sonrasının
    // hangi güne denk geldiğini yazdıran bir kod yazınız.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz: ");
        String gun=input.next().toLowerCase();
        System.out.println("Kac gun sonrasini ogrenmek istiyorsunuz? ");
        int gunSonrasiMod=input.nextInt()%7;
        String[] arr={"pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"};
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals(gun)){
                if (i+gunSonrasiMod<7){
                    System.out.println(arr[i+gunSonrasiMod]);
                } else {
                    System.out.println(arr[i-(7-gunSonrasiMod)]);
                }
            }
        }
    }
}
