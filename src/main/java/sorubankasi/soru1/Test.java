package sorubankasi.soru1;

public class Test extends Ab01{
    public void set(int a){
        this.a=a;
    }

    @Override
    public void get() {

    }

    public static void main(String[] args) {
        Test obj=new Test();
        obj.set(20);
        System.out.println(obj.a);
    }
}
