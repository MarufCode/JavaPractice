package src.int_pro_practice;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {


        // Leap Year

        // Leap year is divisible by 4
        // but not by 100 unless it is also divisible by 400



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();


        if ((year%4 == 0 && year%100!= 0) || (year %400 == 0)){
            System.out.println(year + " Is leap year");
        }else{
            System.out.println(year + " Is not leap year");
        }







    }
}
