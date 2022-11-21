package pdfsorulari;

public class Pdf_16 {
    public static void main(String[] args) {



        long timeSb1=System.nanoTime();
        System.out.println(timeSb1);
        String str="Java";
        for (int i=0;i<1000;i++){
            System.out.println(str);
        }
        long timeSb2=System.nanoTime();
        System.out.println(timeSb2);
        long diff1=timeSb2-timeSb1;
        System.out.println(diff1);

        long timeSb3=System.nanoTime();
        System.out.println(timeSb3);
        StringBuilder strb=new StringBuilder("Java");
        for (int i=0;i<1000;i++){
            System.out.println(strb);
        }
        long timeSb4=System.nanoTime();
        System.out.println(timeSb4);
        long diff2=timeSb4-timeSb3;
        System.out.println(diff2);

        StringBuilder numbers=new StringBuilder("Learn");
        System.out.println(numbers.capacity());
        numbers.trimToSize();
        System.out.println(numbers.capacity());
//        System.out.println(numbers.substring(1,3));
//        System.out.println(numbers.substring(6,7));
//        System.out.println(numbers.substring(7));

        String str10="Learn";
        int l=2;
        System.out.println(2.50*2.50);
        double k=1.2;

        float m=2;








    }




}
