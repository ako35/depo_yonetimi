package practiceAdvanced.practice08;
public class Q01_ForEach_SayiUcgen {
    public static void main(String[] args) {
        /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */
        for (int i=1;i<7;i++){
            System.out.print(" ".repeat(i));
            for (int j=i;j<7;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
