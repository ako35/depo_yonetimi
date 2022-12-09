package OOP_Concept.DepoYonetimi;

import java.util.ArrayList;
import java.util.List;

public class Urun {
    public int urun_id=1000;  //default değer atandı
    public  String urun_adi;
    public  String uretici;
    public int miktar=0;  //default değer atandı
    public  String birim;
    public String raf=""; //default değer atandı

    static List<Urun> urunler=new ArrayList<>();

    public Urun() {
    }

    public Urun(int urun_id, String urun_adi, String uretici, String birim) {   // Urun Girişi yapılırken bu bilgilerle yapılması isteniyor
        this.urun_id = urun_id;
        this.urun_adi = urun_adi;
        this.uretici = uretici;
        this.birim = birim;
    }


    public String toString() {
        return "Urun{" +
                "urun_id=" + urun_id +
                ", urun_adi='" + urun_adi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}