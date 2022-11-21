package day04_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        /*
 Print "Lutfen is unvaninizi girin
 jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
 Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
 Eger jobTitle  qa ise print is unvaniniz Quality Analyst
 test data: qa ise print Quality Analyst
 dev ise print Developer
 ba ise print Business Analyst
 pm ise print Project Manager
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz: ");
        String jobTittle=input.nextLine().toLowerCase();
        if (jobTittle.equals("qa")){
            System.out.println("Quality Analyst");
        } else if (jobTittle.equals("dev")){
            System.out.println("Developer");
        } else if (jobTittle.equals("ba")){
            System.out.println("Business Analyst");
        } else if (jobTittle.equals("pm")){
            System.out.println("Project Manager");
        }
    }
}
