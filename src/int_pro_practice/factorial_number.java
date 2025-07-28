package src.int_pro_practice;

import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args) {


//        fact number of 3 is -> 3*2*1 = 6

        long fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("fact number is " + fact);








        long fac = 1;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number  = sc1.nextInt();



        for (int i = 1; i<=number; i++){
            fac = fac * i;
        }

        System.out.println("Fact number is " + fac);




















    }
}
