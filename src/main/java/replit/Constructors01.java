package replit;
public class Constructors01 {
    /*
    İki kişilik bir Scrabble Oyunu yaz
 1- Başlangıçta İlk Oyuncuya sor Oyunu başlatmak için bir kelime girin
 2- Daha sonra oyuncuyu değiştirin, verilen kelimenin geçerli olup olmadığını yeni oyuncuya sorun
i) Yeni oyuncu verilen kelimeyi kabul ederse, kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin
            ve 3. adıma gidin
ii) Yeni oyuncu kelimeyi geçerli olarak kabul etmezse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı"
            yazıp oyunu bitirin
 3- Kullanıcılara oyuna devam etmek isteyip istemediğini sorun
 i) Oyuncu devam etmek istiyorsa, kullanıcıdan kelimeye eklemek için bir harf isteyin
        ve kullanıcı tarafından eklemesini isteyin (başlangıç veya bitiş)
            sonra kelimeye harf ekleyin ve 2. adımı çalıştırın
 ii) Oyuncu devam etmek istemiyorsa
   sonra "Oyun Bitti" yazdırın ve puanları ve kazananı yazdırın
     */
    String isim="";
    int puan=0;
    static StringBuilder kelime=new StringBuilder();


    public static void main(String[] args) {

        OyunDongusu obj=new OyunDongusu();

        obj.oyunDongusu();

    }


}
