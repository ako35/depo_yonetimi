package practiceAdvanced.practice10;

import java.time.LocalTime;

public class Q06_HizTesti {

    //Iki Java islemi arasindaki calisma zamani farkini gosteren bir kod yaziniz
    public static void main(String[] args) {
        int nano1=LocalTime.now().getNano();

        int x=0;
        while (x<2000000000){
            int a=1234*1234;
            x++;
        }

        int nano2=LocalTime.now().getNano();
        System.out.println("nano1 = " + nano1);
        System.out.println("nano2 = " + nano2);
        System.out.println("Birinci fark: "+(nano2-nano1));

        System.out.println("------------------------------");
        int nano3=LocalTime.now().getNano();
        long y=0;
        while (y<20000000000L){
            int a=1234*1234;
            y++;
        }
        int nano4=LocalTime.now().getNano();
        System.out.println("nano3 = " + nano3);
        System.out.println("nano4 = " + nano4);
        System.out.println("Ikinci fark: "+(nano4-nano3));


    }



}
