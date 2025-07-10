package src.StringANDfunction_concept;

public class functions_in_java {
    public static void main(String[] args) {


        int c = maruf_sum(3,4);   // Definition of the function
        int c1 = maru_sum(3);
        System.out.println(c);
        System.out.println(c1);

//        int d = substraction (3, 6);
//        System.out.println(d);

        hello();    //  Call to the function
        sayhello4times(); // calling the function
        sayhello4times(); // calling the function

    }


     static int maruf_sum  (int x, int y){
        return x + y;
    }

//    static int substraction (int a, int b){
//        return a-b;
//    }

    static int maru_sum (int input_1){
        return input_1;
    }

    static int maruf_sum(){
        return  99;
    }

    static void hello(){
        System.out.println(" void -> No return type");
    }

    static void sayhello4times(){
        for (int i = 0; i <4 ; i++) {
            System.out.println("Hello");

        }
    }


}
