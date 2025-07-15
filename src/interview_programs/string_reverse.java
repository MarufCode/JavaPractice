package src.interview_programs;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {


        String name = "Maruf";
        String reverse_String = "";


        for (int i = name.length()-1; i>=0;  i--) {
            reverse_String = reverse_String  + name.charAt(i);

        }

        System.out.println(reverse_String);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String user_input = sc.next();

        String temp = "";


        for (int i = user_input.length()-1; i>=0; i--){
            temp = temp + user_input.charAt(i);

        }

        System.out.println(temp);











    }
}
