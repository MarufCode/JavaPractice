package src.OOPS_Concept;

public class lab02 {
    public static void main(String[] args) {



        // person is -> class blueprint
        // p  is -> reference
        // new person is -> Object


        person p = new person();

        p.isTalk();
        p.sleep();
        System.out.println("Is married : " + p.isMarried());

        p.name = "Amit";
        System.out.println(p.name);

        person p2 = new person();
        p.name = "MahiBhai";
        System.out.println(p.name);

        p.name = "Vicky";
        System.out.println(p.name);

        p.isTalk();















    }
}
