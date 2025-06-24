package src.basics_03;

import java.util.Scanner;

public class ifloop {
    public static void main(String[] args) {

        // Condition and Loops

        // condition
        // IF, ElSE

//
//        if (condition){
//
//        }else{
//
//        }


        boolean b = true;

        if (true){
            System.out.println("B is true");
        }else{
            System.out.println("b is false");
        }



        // 1.Interview Question

//        boolean a = true;
//        a=!a;
//        if (2+2>=4){
//            System.out.println("Inside the loop code will be execute if the conditin is true");
//
//        }else {
//            System.out.println("this is outside the loop, it will execute always");
//        }



        // 2.Interview Question

        // take an input from user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number, i will tell that number is even or odd");
//        int r = sc.nextInt();
//
//
//        if(r%2==1){
//            System.out.println("If the condition is true then it will print. ODD NUmber");
//        }else{
//            System.out.println("if the condition is false, this line will execute. EVEN Number");
//        }
//


        // Take the two input from user and give max out of it
//
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the value of a and c");
//        int a = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a>c){
//            System.out.println("Max number is " + a);
//        }else{
//            System.out.println("Max number is " + c);
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();

        if (number>20){
            System.out.println("Number is greater than 20");
        }else if (number<10){
            System.out.println("Number is less than 10");
        }else {
            System.out.println("Number is <20");
        }





















    }
}
