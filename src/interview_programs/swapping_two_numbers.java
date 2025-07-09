package src.interview_programs;

import java.util.Scanner;

public class swapping_two_numbers {
    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 15;
//
//        int a = 15;
//        int b = 10;

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b");
//        int b = sc.nextInt();
//
//
//        int temp = a;
//         a = b;
//         b = temp;
//
//
//        System.out.println("Value of a is " + a);
//        System.out.println("Value of b is " + b);




        // without using third variable

        try {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the value of x");
            int a = sc1.nextInt();
            System.out.println("Value of y");
            int b = sc1.nextInt();


            a = a + b;
            b = a - b;
            a = a - b;


            System.out.println("Value of a is " + a);
            System.out.println("Value of b is " + b);
        }catch (Exception e){
            System.out.println("Something wrong or bad!!");
        }


    }

}
