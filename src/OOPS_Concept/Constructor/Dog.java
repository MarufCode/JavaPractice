package src.OOPS_Concept.Constructor;

public class Dog {

    String name;  // Instance Variable

    Dog(){
        System.out.println("DC");
    }

    Dog(String name_ref){
        this.name = name_ref;
        System.out.println("Param Cons -> PC");
    }


    void bark(){
        int age  = 10;  // Local variable
        System.out.println("Bark");
        System.out.println("Dog name is -> " + this.name);
    }








}
