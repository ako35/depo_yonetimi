package replit;
public class Constructor03 {
    String marka;
    String model;
    String yakitTuru;
    Constructor03(){


        System.out.println("Parametresiz Constructor calisti");

    }

    public Constructor03(String marka, String model, String yakitTuru) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        System.out.println(marka);
        System.out.println(model);
        System.out.println(yakitTuru);
    }





}
