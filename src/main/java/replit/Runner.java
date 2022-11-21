package replit;

import java.util.Scanner;

public class Runner {

    /*
Create a student's variables in the main method and use this assign variables
 create a method named Changename, student as parameter
 get the information and change all the information in the method and add the new information
 have it print
 The line where we call the Rename method in the Main method is immediately then reprint student information
 Create a method named changesurname, this method is "lastname" as parameter get the variable. In the method, ask the user to enter a new last name and
 change the old last name (i.e. can).
 */

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Runner runner = new Runner("Emir", "Kantar");


        runner.ogrenciBilgileri();

        char devamMi = ' ';
        do {
            System.out.println("Hangisi degistirmek istiyormusunuz? 1-Ad 2-Soyad");
            int secenek = scanner.nextInt();

            if (secenek == 1) {

                runner.adDegistir();
            }

            if (secenek == 2) {

                runner.soyadDegistir();

            }

            System.out.println("Başka bir değişiklik yapmak istiyormusunuz E/H");
            devamMi = scanner.next().charAt(0);
        } while (devamMi != 'h');

        runner.ogrenciBilgileri();


    }


    public String name;

    public String surName;

    public Runner(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }


    public void adDegistir() {

        System.out.println("Adınızı Güncelleyin:");
        name = scanner.next();

    }


    public void soyadDegistir() {

        System.out.println("Soyadınızı Güncelleyin:");
        surName = scanner.next();

    }

    public void ogrenciBilgileri() {

        System.out.println(name);
        System.out.println(surName);

    }



}
