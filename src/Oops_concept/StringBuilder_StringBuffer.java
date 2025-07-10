package src.Oops_concept;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {


        // Immutable in nature (That can not be changed)
        String s1 = "Maruf";
        String s2 = new String("Mruf");



        // Mutable in nature (That can be changed)
        StringBuilder s3 = new StringBuilder("Sherikar");
        s3.append(" Maruf");
//        s3.append(" Mumbai");
        System.out.println(s3);


        StringBuffer sbf = new StringBuffer("Maruf");
        sbf.append(" Sherikar");
        System.out.println(sbf);




































//        String s = "MAruf";
//        String s1 = new String("Maruf");
//
//
//        StringBuilder s2 = new StringBuilder("maruf");
//        StringBuffer s3 = new StringBuffer("maruf");
//
//        String[] allString = {s, s1, s2.toString(), s3.toString() };
//
//        for (String value: allString){
//            System.out.println(value);
//
//        }














    }
}
