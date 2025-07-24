package src.innerclass;

import src.OOPS_Concept.Inheritance.Hierarchical.Car;

public class lab18 {

    public static void main(String[] args) {
        car c = new car ("Audi 137");
        car.Engine engine = c.new Engine("400cc");
        engine.start();
        c.drive();

    }
}


class car{

    String make;

    car(String make){
        this.make = make;
    }

    void drive(){
        System.out.println("you can drive car ");
    }

    public class Engine{

        String horsePower;

        // Parametrized Constructor

        Engine(String HP){
            this.horsePower = HP;
        }

        //method
        void start(){
            System.out.println("Engine is started " + make);
        }
    }







}
