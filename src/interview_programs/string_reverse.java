package src.interview_programs;

public class string_reverse {
    public static void main(String[] args) {


        String name = "Maruf";
        String reverse_String = "";


        for (int i = name.length()-1; i>=0;  i--) {
            reverse_String = reverse_String  + name.charAt(i);

        }

        System.out.println(reverse_String);











    }
}
