package practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrome {
    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

    public static void main(String[] args) {

//        String str = "nazan";
//        String strReverse ="";
//        for(int i=str.length()-1;i>-1;i--){
//            strReverse += str.charAt(i);
//        }
//        if(str.equalsIgnoreCase(strReverse)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Palindrome degil");
//        }

        String str = "nazan";
        StringBuilder stb = new StringBuilder();
        stb.append(str);
        if (str.equals(stb.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }
    }
}
