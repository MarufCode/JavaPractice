package src.staticKeyword;

public class RC_Static {
    public static void main(String[] args) {
//
//        System.out.println(staticDemo.college_name);
//        staticDemo.printName();



        staticDemo s1 = new staticDemo();
        s1.version = 99;
        s1.printVersion();

        staticDemo.college_name = "Mithibai";

        staticDemo s2 = new staticDemo();
        s2.version = 199;
        s2.printVersion();










    }
}
