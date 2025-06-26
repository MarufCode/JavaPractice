package src.basics_05;

import javax.xml.transform.Source;
import java.util.Scanner;

public class factorial_program {
    public static void main(String[] args) {

        // problem
        // factorial program

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter your number and i will give the factorial");
        int num = sc.nextInt();


        long fact = 1;

        int i = 1;

        while (i<=num){
            fact = fact*i;
            i++;

        }

        System.out.println("Factorial number is ->" + fact);


        // Using for loop


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc1.nextInt();

        long fac = 1;


        for(int j = 1; j<=number; j++){
            fac = fac*j;

        }
        System.out.println("The factorial is ->" + fac);



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int number = sc.nextInt();
//
//        long fact = 1;
//
//
//        long i = 1;

//        while(i<=number){
//            fact = fact*i;
//            i++;
//        }
//
//        System.out.println("fact is ->" + fact);




//
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("enter your number");
//        int num = sc1.nextInt();

//        long fact = 1;

//
//        int ii = 1;
//
//        while (i<=num){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println("Factorial number is ->" + fact);




//
//        for(int j = 1; j<=num; j++){
//            fact = fact*j;
//        }
//
//        System.out.println("Factorial number is ->" + fact);


        sc.close();



//

















    }
}
