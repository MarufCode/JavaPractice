package src.basics_04;

import java.util.Scanner;

public class triangleClassifire {
    public static void main(String[] args) {


        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the side1, side2, side3 and i will the triangle");

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1==side2) && (side2==side3) && (side1==side3)){
            System.out.println("EQ");
        } else if ((side1==side2) || (side2==side3) || (side1==side3)) {
            System.out.println("ISO");
        }else {
            System.out.println("scalene");
        }


    }
}
