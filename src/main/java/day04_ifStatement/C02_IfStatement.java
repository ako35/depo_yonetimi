package day04_ifStatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        int not = 101;
        if (not < 0 || not > 100) {
            System.out.println("Gecersiz");
        } else if (not < 60) {
            System.out.println("Not: F Zayif");
        } else if (not < 70) {
            System.out.println("Not: D Gecer");
        } else if (not < 80) {
            System.out.println("Not: C Orta");
        } else if (not < 90) {
            System.out.println("Not: B Iyi");
        } else {
            System.out.println("Not: A Cok iyi");
        }
    }
}
