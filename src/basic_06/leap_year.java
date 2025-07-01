package src.basic_06;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {


        // Leap Year

        // Leap year is divisible by 4
        // but not by 100 unless it is also divisible by 400


        int year = 1700;

        if ((year%4==0 && year%100!=0) || ( year%400 == 0)) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and i will tell whether it is leap year or not");
        int year_num = sc.nextInt();

        if ((year_num%4==0 && year_num%100!=0) || (year_num%400==0)){
            System.out.println("leap year");
        }else {
            System.out.println("Not a leap year");
        }









        Scanner sce = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sce.nextInt();
        if ((num%4==0 && num%100!=0) || (num%400==0)){
            System.out.println("Leap");
        }else{
            System.out.println("not leap");
        }


        System.out.println("-- End of Program -- ");


        sc.close();





























    }
}
