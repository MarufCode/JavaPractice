package src.OOPS_Concept;

import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {


        testing tes = new testing();
        tes.name= "maruf";
        System.out.println(tes.name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name & number");
        tes.name = sc.next();
        tes.Experience = sc.nextInt();
        tes.AT();
    }
}
