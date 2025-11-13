package src.interview_programs;

import java.util.Scanner;

public class even_odd_number {
    public static void main(String[] args) {


        // Find the even and odd numbers from  to 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        Integer num = sc.nextInt();

        if (num %2 == 0){
            System.out.println("It is even number");
        }else {
            System.out.println("It is Odd number");
        }

       for (int i = 0; i<= 100; i++) {
           if (i % 2 == 0) {
               System.out.println(i + " is even number");
           } else {
               System.out.println( i + " is Odd number");
           }
       }









    }
}
