package src.OOPS_Concept;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class lab03 {

    public static void main(String[] args) {


        cricket ck = new cricket();
        ck.Bats = "BAS Beat All Sports";
        System.out.println(ck.Bats);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score or Runs");
        ck.Score = sc.nextInt();
        ck.isDeclared();
        System.out.println(ck.isRaining());
    }
}
