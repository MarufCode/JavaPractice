package src.basics_04;

import java.util.Scanner;

public class vowelCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character and i will it is a vowel or not");

        char user_input = sc.next().toCharArray()[0];

        switch (user_input){

            case 'a':
                System.out.println("It is vowel");
                break;
            case 'e':
                System.out.println("It is vowel");
                break;
            case 'i':
                System.out.println("It is vowel");
                break;
            case 'o':
                System.out.println("It is vowel");
                break;
            case 'u':
                System.out.println("It is vowel");
                break;

            default:
                System.out.println("Not vowel, it is consonant");

        }
    }
}
