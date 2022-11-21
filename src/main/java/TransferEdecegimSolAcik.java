public class TransferEdecegimSolAcik extends SolAcik{

    int maas;
    int boy;
    String ulke;

    public void sagAyak(){
        System.out.println("Sag ayagini kullanabilir.");

    }

    public TransferEdecegimSolAcik(){
        super(27);
        System.out.println("TransferEdecegimSolAcik 1");
    }

    public TransferEdecegimSolAcik(int maas){
        this.maas=maas;
    }

    public TransferEdecegimSolAcik(int maas,String ulke){
        this.maas=maas;
        this.ulke=ulke;
    }







}
