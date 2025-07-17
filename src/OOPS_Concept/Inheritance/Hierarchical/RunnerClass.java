package src.OOPS_Concept.Inheritance.Hierarchical;

public class RunnerClass {
    public static void main(String[] args) {

        AirIndia ar = new AirIndia();
        ar.InternationalFlight();

        Indigo i = new Indigo();
        i.InternationalFlight();
        i.DomesticFlight();



    }
}
