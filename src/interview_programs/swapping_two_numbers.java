package src.interview_programs;

import java.util.Scanner;

public class swapping_two_numbers {
    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 15;
//
//        int a = 15;
//        int b = 10;

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of b");
//        int b = sc.nextInt();
//
//
//        int temp = a;
//         a = b;
//         b = temp;
//
//
//        System.out.println("Value of a is " + a);
//        System.out.println("Value of b is " + b);




        // without using third variable

      try{
          Scanner sc1 = new Scanner(System.in);
          System.out.println("Enter the value of a");
          int a = sc1.nextInt();
          System.out.println("Enter the value of b");
          int b = sc1.nextInt();


          a = a + b;
          b = a - b;
          a = a - b;

          System.out.println(a);
          System.out.println(b);
      }catch (Exception e){
          System.out.println("Something Bad or invalid input");
      }




//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value of A");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of B");
//        int b = sc.nextInt();
//
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println(a);
//        System.out.println(b);














        // PRIME NUMBERS



        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();


        m = n / 2;

       if (n==0 || n==1){
           System.out.println("Not Prime " + n);
       } else {
           for ( i = 2; i<=m; i++){
               if (n%i==0){
                   System.out.println("Not prime number " + n);
                   flag = 1;
                   break;
               }
           }
           if (flag==0){
               System.out.println("Prime number " + n);
           }
       }
























    }

}
