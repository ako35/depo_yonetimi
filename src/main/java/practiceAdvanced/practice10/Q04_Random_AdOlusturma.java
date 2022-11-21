package practiceAdvanced.practice10;

public class Q04_Random_AdOlusturma {

    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve
    // bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {

        String karakterler="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxId=karakterler.length();
        String isim="Can";
        String yeniIsim="";
        int counter=0;
        for (int i=0;i<isim.length();i++){
            while (true){
                char rastgeleKarakter=karakterler.charAt((int)(Math.random()*maxId));
                counter++;
                if (isim.charAt(i)==rastgeleKarakter){
                    yeniIsim+=rastgeleKarakter;
                    System.out.println("yeniIsim = " + yeniIsim);
                    break;
                }
            }
        }
        System.out.println("yeniIsim = " + yeniIsim);
        System.out.println("counter = " + counter);



    }




}
