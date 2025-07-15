package src.interview_programs;

import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args) {


//        fact number of 3 is -> 3*2*1 = 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();


//        long fact = 1;
//
////        int i = 1;
//
//
//        while (i<=number){
//            fact = fact*i;
//            i++;
//        }
//
//        System.out.println("Fact number is" + fact);




        // By using for loop


//      long fac = 1;
//
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter your number i will give the factorial number");
//        int num = sc1.nextInt();
//
//
//        for (int j = 1; j<=num; j++){
//            fac = fac*j;
//
//        }
//        System.out.println("Fact number is ->" + fac);
//

       long fac = 1;

       Scanner scr = new Scanner(System.in);
        System.out.println(":Enter the number");
        int num = scr.nextInt();

        for (int i = 1; i <=num ; i++) {
            fac = fac * i;


        }

        System.out.println("fact number is -> "+ fac);







    }
}
