package src.interview_programs;

import java.util.Scanner;
import java.util.Stack;

public class chech_palindrome {
    public static void main(String[] args) {


        // By creating the function

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String , i will check for palindrome");
        String user_input = sc.next();

        Boolean result = isPalindrome(user_input);
        if (result){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }



    }

        static boolean isPalindrome(String userInput){
        String original_str = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        sb.reverse();
        return original_str.equalsIgnoreCase(sb.toString());



        // Using for Loop


//            Scanner scanner  = new Scanner(System.in);
//            System.out.println("Enter the string");
//            String user_input = scanner.next();
//
//            String y = "";
//
//
//            for (int i=user_input.length()-1; i>=0; i--){
//                y = y + user_input.charAt(i);
//            }
//
//            if (user_input.equalsIgnoreCase(y)){
//                System.out.println("Palindrome");
//            }else {
//                System.out.println("Not a Palindrome");
//            }


//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter the string and i will check the Palindrome");
//        String input = sc1.next();
//        String input = input.toLowerCase();
//        String temp = "";
//
//
//
//        for (int i = input.length()-1; i>=0; i--){
//           temp = temp + input.charAt(i);
//        }
//
//        if (input.equalsIgnoreCase(temp)){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not a Palindrome");
//        }















    }


}
