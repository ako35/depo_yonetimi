package day07_stringmanipulations;

public class C05_StringManipulationsIsEmpty {

    public static void main(String[] args) {

        String str1="Hi";
        System.out.println(str1.isEmpty());

        String str2="";
        System.out.println(str2.isEmpty());

        String str3=" ";
        System.out.println(str3.isEmpty());

        String str4="ali kocan";
        boolean boslukVarMi=str4.contains(" ");
        System.out.println(boslukVarMi);


    }
}
