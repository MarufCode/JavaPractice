package src.interview_programs;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and i will tell that is leap year or not");

        int year = sc.nextInt();

        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year + " Is Leap year");
        }else{
            System.out.println(year + " Is Not a leap year");
        }











    }
}
