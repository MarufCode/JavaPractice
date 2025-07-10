package src.interview_programs;

public class reverse_string_using_stringBuilder {
    public static void main(String[] args) {

         StringBuilder sb = new StringBuilder("Maruf");
         sb.reverse();
         System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Sherikar");
        sbf.reverse();
        System.out.println(sbf);

    }
}
