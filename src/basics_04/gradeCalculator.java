package src.basics_04;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {


        // Grade Calculator

        // 1.Input from users
        // 2.Basic login or brute force logic write basic rough code
        // 3.Write the real code
        // 4.Debug the code
        // 5.fix the code and final it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int marks = sc.nextInt();


        if (marks>=90 && marks<=100){
            System.out.println("You score A" );
        }else if(marks>=80 && marks<=89) {
            System.out.println("You score - B");
        } else if (marks>=70 && marks<=79) {
            System.out.println("You score - C");
        } else if (marks>=60 && marks <=69) {
            System.out.println("You score - D");
        }else {
            System.out.println("Sorry ! You are Failed ");
        }


    }
}
