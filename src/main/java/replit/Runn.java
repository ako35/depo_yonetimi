package replit;

public class Runn {

    public static void main(String[] args) {

        Constructor03 obj1=new Constructor03();
        Constructor03 obj2=new Constructor03("Honda","Civic","Dizel");

        obj1.marka="BMW";
        obj1.model="M5";
        obj1.yakitTuru="Benzin";

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yakitTuru);




    }



}
