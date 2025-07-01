package src.basic_06;

import java.util.Scanner;

public class arrays_program_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] marks  = new int[5];

        System.out.println("Enter the first subject marks");
        marks[0] = sc.nextInt();

        System.out.println("Enter the Second subject marks");
        marks[1] = sc.nextInt();

        System.out.println("Enter the Third subject marks");
        marks[2] = sc.nextInt();

        System.out.println("Enter the Fourth subject marks");
        marks[3] = sc.nextInt();

        System.out.println("Enter the Fifth subject marks");
        marks[4] = sc.nextInt();

        for (int i = 0; i <marks.length ; i++) {
            if (marks[i]<30){
                System.out.println("You are fail in this subject" + marks[i]);
            }
            System.out.println(marks[i]);

        }

//        sc.close();


        Scanner sc1 = new Scanner(System.in);

        int [] prize = new int[4];

        System.out.println("Enter the first prize");
        prize[0] = sc1.nextInt();

        System.out.println("Enter the second prize");
        prize[1] = sc1.nextInt();


        for (int j = 0; j < prize.length; j++) {
            if (prize[j]>100){
                System.out.println("You are first" + prize[j]);
            }
            System.out.println(prize[j]);

        }
















    }
}
