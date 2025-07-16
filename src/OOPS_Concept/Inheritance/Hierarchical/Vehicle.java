package src.OOPS_Concept.Inheritance.Hierarchical;

public class Vehicle {

    Vehicle(){
        System.out.println("Vehicle - DC");
    }

    void VehicleHasToSpeed(){
        System.out.println("Yeah " + getClass().getSimpleName());
    }
}
