package src.OOPS_Concept.Inheritance.MultiLevel;

public class lab13 {
    public static void main(String[] args) {


        Manager m = new Manager();
        m.AT360();

        Senior s = new Senior();
        s.AT_API();
        s.AT360();


        Junior j = new Junior();
        j.AT();
        j.AT360();
        j.AT_API();



    }
}
