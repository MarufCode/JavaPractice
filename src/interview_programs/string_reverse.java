package src.interview_programs;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String user_Input = sc.next();
        String temp = "";

        for (int i = user_Input.length()-1; i>=0; i--){
            temp = temp + user_Input.charAt(i);
        }

        System.out.println(temp);











    }
}
