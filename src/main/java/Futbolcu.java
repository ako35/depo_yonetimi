public class Futbolcu extends Sporcu{

    String ulke;
    int maas;
    int bonservis;
    int boy;

    public void futbolOyna(){
        System.out.println("Futbol oynayabilir.");
    }

    public Futbolcu(){
        System.out.println("Futbolcu 1");
    }

    public Futbolcu(String ulke){
        this.ulke=ulke;
        System.out.println("Futbolcu 2");
    }

    public Futbolcu(int maas, int bonservis){
        this.maas=maas;
        this.bonservis=bonservis;
        System.out.println("Futbolcu 3");
    }

    public Futbolcu(String ulke,int bonservis, int maas, int boy){
        super("futbolcu");
        this.ulke=ulke;
        this.maas=maas;
        this.bonservis=bonservis;
        this.boy=boy;
        System.out.println("Futbolcu 4");
    }




}
