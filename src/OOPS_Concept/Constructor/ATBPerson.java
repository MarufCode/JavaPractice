package src.OOPS_Concept.Constructor;

public class ATBPerson {

    // Constructor is used to construct of object class
    // name must be exactly the same as class
    // Constructor is special method
    // It does not have return type


    String name;

    long phone_Number;

    String email;

    boolean isMarried;

    String courseName;


    // Default Constructor
    ATBPerson(){
        courseName = "ATB360";
        System.out.println("I am Default that's why i called!! ");
    }


    // Parametrized Constructor
    ATBPerson(String name, String email){
       this.name = name;
       this.email = email;
    }


    void talk(){
        System.out.println("Will Talk!!");
    }


    void printDetails(){
        System.out.println(this.name);
//        System.out.println(phone_Number);
        System.out.println(this.email);
//        System.out.println(isMarried);
        System.out.println(courseName);
    }









}
