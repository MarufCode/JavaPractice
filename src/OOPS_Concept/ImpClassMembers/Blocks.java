package src.OOPS_Concept.ImpClassMembers;

public class Blocks {

    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    Blocks(){
        System.out.println("I am DC");
    }


    static{
        // Static Initialization Block
        System.out.println("I am SIB");

    }

}
