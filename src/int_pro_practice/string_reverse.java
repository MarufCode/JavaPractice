package src.int_pro_practice;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {


     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.next();
        String temp = "";

        for (int i = name.length()-1;i>=0;i--){
            temp = temp + name.charAt(i);
        }

        System.out.println(temp);


        StringBuilder sb = new StringBuilder("Sherikar");
        sb.reverse();
        System.out.println(sb);










    }
}
