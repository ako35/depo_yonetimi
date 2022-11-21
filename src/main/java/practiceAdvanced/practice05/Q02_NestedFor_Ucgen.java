package practiceAdvanced.practice05;

public class Q02_NestedFor_Ucgen {

    public static void main(String[] args) {

  /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */
        for (int i=0;i<5;i++){
            for (int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }




}
