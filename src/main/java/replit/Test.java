package replit;
public class Test {
    int x;
    Test(int i){
        System.out.println("Parametreli Constructor calisti");
        x=i;
        System.out.println(x);
    }
    Test(){
        System.out.println("Parametresiz Constructor calisti");
        x=0;
    }

}
