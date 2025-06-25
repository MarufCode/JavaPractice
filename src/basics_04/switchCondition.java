package src.basics_04;

import java.util.Scanner;

public class switchCondition {
    public static void main(String[] args) {

        // Switch Condition

        // Condition -> return as per the condition
        // loop-> which will Return something


        // Which day is today!!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value between 1-7 and i will tell you which day is it");
        int dayNumber = sc.nextInt();

        switch (dayNumber){

            case 1 :
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thu");
                break;

            case 5:
                System.out.println("Fri");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("Pagla gaye ho be!!!");
        }



        System.out.println(" - End of the program -");





        // Use case in our webAutomation

        Scanner sc1 = new Scanner(System.in);

        String browser = sc1.next();
//        String browser = user_input.toLowerCase();
           switch (browser.toLowerCase()) {
               case "chrome":
                   System.out.println("i will execute the chrome code");
                   break;

               case "firefox":
                   System.out.println("I will execute the firefox code");
                   break;

               default:
                   System.out.println("No idea which browser is this");
           }


















    }
}
