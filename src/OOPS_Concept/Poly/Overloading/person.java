package src.OOPS_Concept.Poly.Overloading;

public class person {


    // method overloading -> multiple method name with same name , but different argument

    void speak(String a){
        System.out.println("A is a String " + a);
    }

    int speak(int x ){
        System.out.println("X is a Integer " + x);
        return x;
    }

    void speak(double y ){
        System.out.println("Y is a Double " + y);
    }










}
