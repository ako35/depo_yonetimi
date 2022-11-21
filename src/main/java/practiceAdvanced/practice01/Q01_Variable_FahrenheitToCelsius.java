package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Fahrenheit degeri giriniz: ");
        double fahrenheit=input.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(celsius);

        NumberFormat numberFormat=new DecimalFormat(".00");
        String formattedC=numberFormat.format(celsius);
        System.out.println("formattedC = " + formattedC+1);
        double doubleC=Double.valueOf(formattedC);
        System.out.println("doubleC = " + (doubleC+1));



        //


    }
}
