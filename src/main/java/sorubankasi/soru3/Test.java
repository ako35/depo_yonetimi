package sorubankasi.soru3;

public class Test extends Ab01 {
    int b=10;
    Test(){
        b=super.b;

    }
    void getNumber(int x,int y){
        int i=x*y+b;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test sub=new Test();
        sub.getNumber(7,3);
    }
}
