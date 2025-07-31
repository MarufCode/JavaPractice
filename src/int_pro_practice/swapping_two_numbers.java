package src.int_pro_practice;

import java.util.Scanner;

public class swapping_two_numbers {
    public static void main(String[] args) {
//
//

        Scanner scanner=  new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b ");
        int b = scanner.nextInt();


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a is -> " + a);
        System.out.println("Value of b is -> " + b);


















    }

}
