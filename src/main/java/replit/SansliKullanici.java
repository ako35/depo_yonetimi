package replit;
public class SansliKullanici extends Kayit{
    public void sansliKullanici(){
        for (int i=0;i<kayitSaniyeListesi.size();i++){
            if (Integer.parseInt(kayitSaniyeListesi.get(i))<11){
                System.out.println(kayitSaniyeListesi.get(i)+" "+isimListesi.get(i)+" sansli kullanici");
            }
        }
    }
}
