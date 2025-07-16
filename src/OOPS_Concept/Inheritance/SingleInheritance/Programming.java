package src.OOPS_Concept.Inheritance.SingleInheritance;

public class Programming {


    int version;

    String author;



    Programming(){
        System.out.println("Programming - DC");
    }



    Programming(String author, int version){
        this.author = author;
        this.version = version;

    }



    void printInfo(){
        System.out.println("Programming Info -> " + "Author -> " + this.author + " Version -> " + this.version );
    }

    void car(){
        System.out.println("Lambo");
    }

    void bhk3(){
        System.out.println("3BHK House");
    }
}
