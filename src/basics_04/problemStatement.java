package src.basics_04;

import java.util.Scanner;

public class problemStatement {
    public static void main(String[] args) {


        // Take the value from users and print it

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your details are " + name + "->" + age + "->" + salary);





        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the payment mode");
        String payment_mode = scr.next();

        switch (payment_mode.toLowerCase()){

            case "phonePay":
                System.out.println("Phone pay app wil open");
                break;

            case "gpay":
                System.out.println("GPAy app will open ");
                break;

            case "paytm":
                System.out.println("Paytm app will open");
                break;


            default:
                System.out.println("It is not a valid mode of payment");


        }



























    }
}
