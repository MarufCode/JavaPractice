package src.int_pro_practice;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        int i = 0;
        int m = 0;
        int flag = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        m = n/2;

        if (n==0 || n==1){
            System.out.println("Is not a prime number" + n);

        }else {
            for (i=2;i<=m;i++){
                if (n%i==0){
                    System.out.println("Not a prime number " + n);
                    flag = 1;
                    break;
                }
            }

            if (flag==0){
                System.out.println("It is a prime number" + n);
            }
        }

















    }
}
