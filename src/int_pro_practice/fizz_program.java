package src.int_pro_practice;

public class fizz_program {

    public static void main(String[] args) {


        // Write the program to print 1 to 100
        // for multiplies of 3, print the "Fizz" instead of number
        // for multiplies of 5, print the "Buzz" instead of number
        // for multiplies of 3 and 5 , print the "FizzBuzz" instead of number


        for (int i = 1; i<= 100; i++){
            if (i%3 == 0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if (i%5==0){
                System.out.println("Buzz");

            } else if (i%3==0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }












    }






}
