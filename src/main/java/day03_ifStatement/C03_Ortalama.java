package day03_ifStatement;

import java.util.Scanner;

public class C03_Ortalama {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double num1=23.4;
        double num2=24.0;
        double num3=12;
        double num4=450.3;
        double num5=23000;

        double ort=(num1+num2+num3+num4+num5)/5;
        System.out.println("ort = " + ort);
    }
}
