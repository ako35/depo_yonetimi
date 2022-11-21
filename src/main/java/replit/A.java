package replit;
public class A {
    public static void main(String[] args) {
        Test t=new Test(5);

        change(t);
        System.out.println(t.x);
    }
    public static void change(Test t){
        t=new Test();
        System.out.println(t.x);
        t.x=10;
        System.out.println(t.x);

    }
}