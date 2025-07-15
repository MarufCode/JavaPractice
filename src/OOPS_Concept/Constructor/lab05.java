package src.OOPS_Concept.Constructor;

public class lab05 {
    public static void main(String[] args) {


        ATBPerson cs = new ATBPerson();
        cs.name = "Raj";
        cs.printDetails();

        ATBPerson cs3 = new ATBPerson("Maruf", "maruf@gmail.com");
        cs3.printDetails();


//
//        ATBPerson cs2 = new ATBPerson("Sherikar", "maruf@gmail.com");
//        cs2.printDetails();



//        String s;
//        System.out.println(s); // Local variable default value is never assigned by JVM






    }
}
