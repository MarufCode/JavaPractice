package src.interview_programs;

import java.util.Scanner;
import java.util.Stack;

public class chech_palindrome {
    public static void main(String[] args) {


        // By creating the function

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String , i will check for palindrome");
//        String user_input = sc.next();
//
//        Boolean result = isPalindrome(user_input);
//        if (result){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not a Palindrome");
//        }
//
//
//
//    }
//
//        static boolean isPalindrome(String userInput){
//        String original_str = userInput;
//        StringBuilder sb = new StringBuilder(userInput);
//        sb.reverse();
//        return original_str.equalsIgnoreCase(sb.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string and i will check for palindrome");
        String user_Input = sc.next();
        String temp = "";

        for (int i = user_Input.length()-1; i>=0; i--){
            temp = temp + user_Input.charAt(i);
        }

        if (user_Input.equalsIgnoreCase(temp)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }













    }



}
