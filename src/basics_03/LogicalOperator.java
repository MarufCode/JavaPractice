package src.basics_03;

public class LogicalOperator {
    public static void main(String[] args) {
        // Interview Questions - relational Operator

        System.out.println(10==10); // true
        System.out.println(10>=10); // true
        System.out.println(10<=10); // true
        System.out.println(10>10); // false
        System.out.println(10<10); // false


        System.out.println('A' ==65);

        System.out.println("------------------------------");
        // Logical Operators

//        !-> Not
        boolean a= true;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(10>20);
        System.out.println( !(10>20));

        System.out.println( 30>90);
        System.out.println( !(30>90));


        int num = 15;

        boolean num2 = num>10 || num<5;

        System.out.println(num2);














    }
}

