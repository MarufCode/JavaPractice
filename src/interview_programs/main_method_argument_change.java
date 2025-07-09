package src.interview_programs;

public class main_method_argument_change {
//    public static void main(String[] args) {
//
//        System.out.println("Run Fine!!");
//    }

    public static void main(String[] Maruf) {

        System.out.println("Also Run Fine!!");

        int  d = main(10);
        System.out.println(d);
        main("MARUF");
        print("Hi, it will print and looks like python");

    }

    static void main (String a){
        System.out.println("I am a main method but JVM doesn't recognise me!!");
    }

    static int main (int a){
//        System.out.println(a + "Wil Print");
        return 99;
    }

    static void print(String s){
        System.out.println(s);
    }

}
