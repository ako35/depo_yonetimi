package replit;
import java.util.Scanner;
public class List08 {
    /*
    Write a java program which accept a sentence as parameter,
    than reverses sentence by using StringBuilder and checks if sentence is
    palindrome or not (without case sensitivity).Use StringBuilder.
Input :
I love Java.
Output:
Reversed sentence : avaJ evol I.
It is not a palindrome"
     */
    public static void main(String[] args) {
        StringBuilder sentence=new StringBuilder();
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        sentence.append(input.nextLine());

        System.out.println(sentence.reverse());
        reversePalindrome(sentence);
    }
    public static void reversePalindrome(StringBuilder sentence){
        if (sentence.toString().equalsIgnoreCase(sentence.reverse().toString())){
            System.out.println("Bu bir palindrome dur");
        } else System.out.println("Bu bir palindrome degildir");
    }
}
