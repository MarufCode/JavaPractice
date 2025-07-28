package src.int_pro_practice;

import java.util.Scanner;

public class palindrome_check {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String and i will check for palindrome");
        String user_input = scanner.next();
        String y = "";

        for (int i = user_input.length()-1; i>=0; i--){
            y = y + user_input.charAt(i);
        }

        if (user_input.equalsIgnoreCase(y)){
            System.out.println( user_input + " It is Palindrome");
        }else {
            System.out.println(user_input + " It is not Palindrome");
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        String x = "";



        for (int i = input.length()-1; i>=0; i--){
            x = x + input.charAt(i);
        }
        if (input.equalsIgnoreCase(x)){
            System.out.println(input + " Is is Palindrome");
        }else {
            System.out.println(input+ " is is not Palindrome");
        }


























































    }
}
