public class SolAcik extends Futbolcu{

    public void hizliKos(){
        System.out.println("Hizli kosabilir");
    }

    int yas;
    int bonservis;
    int boy;

    public SolAcik(){
        System.out.println("SolAcik 1");
    }

    public SolAcik(int yas){
        super("Cek",10000,1000,180);
        this.yas=yas;
        System.out.println("SolAcik 2");
    }

    public SolAcik(int bonservis,int boy){
        this.bonservis=bonservis;
        this.boy=boy;
        System.out.println("SolAcik 3");
    }




}
