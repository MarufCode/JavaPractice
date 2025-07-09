package src.interview_programs;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        // prime number Condition ->
        // Any number is divisible by itself

        int i = 0;
        int flag = 0;
        int m = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();


        m = n/2;
        if(n==0 || n==1){
            System.out.println("Not a prime number " + n);
        } else{
            for ( i = 2; i <=m ; i++) {
                if(n%i==0){
                    System.out.println("Not a prime number");
                    flag= 1;
                    break;


                }
            }
        }

        if (flag==0){
            System.out.println("It is a prime number " + n);
        }
















    }
}
