package src.int_pro_practice;

import java.util.Scanner;

public class palindrome_check {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String user_input = scanner.next();
        String y = "";

        for (int i = user_input.length()-1;i>=0;i--) {
            y = y + user_input.charAt(i);
        }
            if (user_input.equalsIgnoreCase(y)){
                System.out.println(user_input + " is Palindrome");
            }else {
                System.out.println(user_input + " is not a palindrome");
            }




















    }
}
