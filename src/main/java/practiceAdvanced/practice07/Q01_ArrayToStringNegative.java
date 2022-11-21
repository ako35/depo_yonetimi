package practiceAdvanced.practice07;
public class Q01_ArrayToStringNegative {
    public static void main(String[] args) {
        /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        StringBuilder str= new StringBuilder();
        for (String w:arr){
            str.append(w);
            if (str.length()>1){
                if (str.substring(str.length()-2,str.length()).equalsIgnoreCase("is")){
                    str.append("NOT");
                }
            }
        }
        System.out.println(str);
    }
}
