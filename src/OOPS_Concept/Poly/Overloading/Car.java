package src.OOPS_Concept.Poly.Overloading;

public class Car {

    String name;


    void run(String a){
        System.out.println(" A is a name " + a);
    }

    void run(int x ){
        System.out.println("X is a speed " + x);
    }

    void run(boolean x){
        if (x == true) {
            System.out.println("Yes, it is a Super Car " + x);
        }else {
            System.out.println("Something Wrong !!");
        }
    }
}
