package src.basics_02;

public class Operators {

    public static void main(String[] args) {

        // Operators

        int age = 10;

        // =  Assigned operators - store the value from right to left


        // Arithmetic Operators
        // +,-,*,%
        double a = 10;
        double b = 30;
        double sum = a+b;
        System.out.println(sum);

        double sub = a-b;
        System.out.println(sub);

        double mul = a*b;
        System.out.println(mul);

        double div = a/b;
        System.out.println(div);


        double x = 65;
        double y = 12;

        double result = x%y;
        System.out.println(result);


        // String

        String firstname = "Maruf";
        String lastname = "Sherikar";

        System.out.println(firstname + lastname);



        // Unary Operators

        int a1 = +12;
        int b1 = -44;

        System.out.println(a1);
        System.out.println(b1);

    }
}
