package day07_stringmanipulations;

public class C07_StringManipulationsIndexOf {

    public static void main(String[] args) {

        String str="Javacancandir";
        char ch='a';
        boolean tekrarliMi=str.indexOf(ch)!=str.lastIndexOf(ch);
        if (tekrarliMi){
            System.out.println("Tekrarli");
        } else System.out.println("Tekrarsiz");




    }
}
