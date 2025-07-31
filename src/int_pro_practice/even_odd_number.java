package src.int_pro_practice;

import java.util.Scanner;

public class even_odd_number {
    public static void main(String[] args) {


        // Find the even and odd numbers from  to 100
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

            if (num%2==0){
                System.out.println(num + " is even Number");
            }else {
                System.out.println(num + " is Odd Number");
            }




    }
}
