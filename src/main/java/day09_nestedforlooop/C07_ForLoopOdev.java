package day09_nestedforlooop;
public class C07_ForLoopOdev {
    //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//
    public static void main(String[] args) {

        for (int i=1;i<7;i++){
            System.out.print(" ".repeat(i));
            for (int j=i;j<7;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
